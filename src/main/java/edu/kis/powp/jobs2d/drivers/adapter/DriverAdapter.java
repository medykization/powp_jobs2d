package edu.kis.powp.jobs2d.drivers.adapter;

import edu.kis.powp.jobs2d.AbstractDriver;
import edu.kis.powp.jobs2d.Job2dDriver;

public class DriverAdapter extends AbstractDriver {

    private Job2dDriver job2dDriver;

    public DriverAdapter(int x, int y, Job2dDriver job2dDriver) {
        super(x, y);
        this.job2dDriver = job2dDriver;
    }


    @Override
    public void operateTo(int x, int y) {
        job2dDriver.operateTo(x,y);
        setPosition(x,y);
    }
}
