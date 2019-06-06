package ua.lviv.iot.fortifications.models;

import javax.persistence.Entity;
import javax.persistence.Inheritance;

@Entity
@Inheritance
public class Trench extends Fortifications {
    private double width;

    public Trench(final double lenght, final double depth,
                  final double timeToBuild, final double width) {
        super(lenght, depth, timeToBuild);
        this.width = width;
    }

    public Trench() {
    }

    public String getHeaders(){
        return super.getHeaders() + ", width";
    }

    public String toCSV() {
        return super.toCSV() + "," + getWidth();
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(final double width) {
        this.width = width;
    }
}
