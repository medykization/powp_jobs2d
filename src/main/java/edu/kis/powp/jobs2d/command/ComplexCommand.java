package edu.kis.powp.jobs2d.command;

import edu.kis.powp.jobs2d.Job2dDriver;

import java.util.ArrayList;
import java.util.List;

public class ComplexCommand implements DriverCommand {

    private List<DriverCommand> commands;

    public ComplexCommand() {
        this.commands = new ArrayList<>();
    }

    public ComplexCommand(List<DriverCommand> commandList) {
        this.commands = commandList;
    }

    public void add(DriverCommand command) {
        commands.add(command);
    }

    @Override
    public void execute(Job2dDriver job2dDriver) {
        for(DriverCommand command: commands) {
            command.execute(job2dDriver);
        }
    }

}
