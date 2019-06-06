package ua.lviv.iot.fortifications.models;

public class Aperal extends Fortifications {
    private int angleOfInclination;

    public Aperal() {
    }

    public Aperal(final double lenght, final double depth,
                  final double timeToBuild, final int angleOfInclination) {
        super(lenght, depth, timeToBuild);
        this.angleOfInclination = angleOfInclination;
    }

    public String getHeaders(){
        return super.getHeaders() + ", angleOfInclination";
    }

    public String toCSV() {
        return super.toCSV() + "," + getAngleOfInclination();
    }

    public int getAngleOfInclination() {
        return angleOfInclination;
    }

    public void setAngleOfInclination(final int angleOfInclination) {
        this.angleOfInclination = angleOfInclination;
    }
}
