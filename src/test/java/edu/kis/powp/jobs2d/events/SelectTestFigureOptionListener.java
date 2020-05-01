package edu.kis.powp.jobs2d.events;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import edu.kis.powp.jobs2d.Job2dDriver;
import edu.kis.powp.jobs2d.command.OperateToCommand;
import edu.kis.powp.jobs2d.command.SetPositionCommand;
import edu.kis.powp.jobs2d.drivers.DriverManager;
import edu.kis.powp.jobs2d.drivers.adapter.DriverAdapter;
import edu.kis.powp.jobs2d.magicpresets.FiguresJane;
import edu.kis.powp.jobs2d.magicpresets.FiguresJoe;

public class SelectTestFigureOptionListener implements ActionListener {

	private DriverManager driverManager;

	public SelectTestFigureOptionListener(DriverManager driverManager) {
		this.driverManager = driverManager;
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		String option = e.getActionCommand();
		switch (option) {
			case "Figure Joe 1":
				FiguresJoe.figureScript1(driverManager.getCurrentDriver());
				break;
			case "Figure Joe 2":
				FiguresJoe.figureScript2(driverManager.getCurrentDriver());
				break;
			case "Figure Jane 1":
				FiguresJane.figureScript(new DriverAdapter(driverManager.getCurrentDriver()));
				break;
			case "Command Test Figure":
				Job2dDriver driver = driverManager.getCurrentDriver();
				SetPositionCommand command = new SetPositionCommand(50,50);
				command.execute(driver);
				OperateToCommand operateTo = new OperateToCommand();
				operateTo.setXY(100, 50);
				operateTo.execute(driver);
				operateTo.setXY(75, 75);
				operateTo.execute(driver);
				operateTo.setXY(50,50);
				operateTo.execute(driver);
				break;
			default:
				System.out.println("error wrong option");
		}

	}

}
