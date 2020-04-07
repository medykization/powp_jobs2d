package edu.kis.powp.jobs2d.drivers.adapter;

import edu.kis.powp.jobs2d.AbstractDriver;
import edu.kis.powp.jobs2d.Job2dDriver;

public class DriverAdapter extends AbstractDriver {

    private Job2dDriver job2dDriver;

    public DriverAdapter(Job2dDriver job2dDriver) {
        super(0, 0);
        this.job2dDriver = job2dDriver;
    }


    @Override
    public void operateTo(int x, int y) {
        job2dDriver.setPosition(getX(), getY());
        job2dDriver.operateTo(x,y);
        setPosition(x,y);
    }

    @Override
    public String toString() {
        return "Test";
    }
}
