package edu.kis.powp.jobs2d.command;

import edu.kis.powp.jobs2d.Job2dDriver;
import java.util.Arrays;
import java.util.List;

public class ComplexCommand implements DriverCommand {

    private List<DriverCommand> commands;

    public ComplexCommand(List<DriverCommand> commandList) {
        this.commands = commandList;
    }

    public ComplexCommand(DriverCommand... commandsArray) {
        this(Arrays.asList(commandsArray));
    }

    @Override
    public void execute(Job2dDriver job2dDriver) {
        for(DriverCommand command: commands) {
            command.execute(job2dDriver);
        }
    }

}
