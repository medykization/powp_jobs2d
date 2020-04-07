package edu.kis.powp.jobs2d.drivers.adapter;
import edu.kis.legacy.drawer.panel.DrawPanelController;
import edu.kis.legacy.drawer.shape.ILine;
import edu.kis.powp.jobs2d.Job2dDriver;

public class LineDrawerAdapter  extends DrawPanelController implements Job2dDriver {

    private int startX = 0, startY = 0;
    private DrawPanelController drawController;
    private ILine iLine;

    public LineDrawerAdapter(DrawPanelController drawPanelController, ILine line) {
        this.drawController = drawPanelController;
        this.iLine = line;
    }

    @Override
    public void setPosition(int x, int y) {
        this.startX = x;
        this.startY = y;
    }

    @Override
    public void operateTo(int x, int y) {
        this.iLine.setStartCoordinates(this.startX, this.startY);
        this.iLine.setEndCoordinates(x, y);
        setPosition(x,y);

        drawController.drawLine(this.iLine);
    }

    @Override
    public String toString() {
        return "special Line";
    }
}
