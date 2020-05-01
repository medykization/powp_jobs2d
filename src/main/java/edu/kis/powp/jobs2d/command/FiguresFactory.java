package edu.kis.powp.jobs2d.command;

public class FiguresFactory {

    public static ComplexCommand getRectangle() {
        ComplexCommand complexCommand = new ComplexCommand();
        complexCommand.add(new SetPositionCommand(50, 50));
        complexCommand.add(new OperateToCommand(150, 50));
        complexCommand.add(new OperateToCommand(150, 100));
        complexCommand.add(new OperateToCommand(50, 100));
        complexCommand.add(new OperateToCommand(50, 50));
        return complexCommand;
    }


    public static ComplexCommand getTriangle() {
        ComplexCommand complexCommand = new ComplexCommand();
        complexCommand.add(new SetPositionCommand(50, 50));
        complexCommand.add(new OperateToCommand(100, 50));
        complexCommand.add(new OperateToCommand(75, 75));
        complexCommand.add(new OperateToCommand(50, 50));
        return complexCommand;
    }
}
