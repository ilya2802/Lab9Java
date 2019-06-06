package ua.lviv.iot.fortifications.models;

public class Escarpment extends Fortifications {
    private int numberOfCliffs;

    public Escarpment(final double lenght, final double depth,
                      final double timeToBuild, final int numberOfCliffs) {
        super(lenght, depth, timeToBuild);
        this.numberOfCliffs = numberOfCliffs;
    }

    public String getHeaders(){
        return super.getHeaders() + ", numberOfCliffs";
    }

    public String toCSV() {
        return super.toCSV() + "," + getNumberOfCliffs();
    }

    public int getNumberOfCliffs() {
        return numberOfCliffs;
    }

    public void setNumberOfCliffs(final int numberOfCliffs) {
        this.numberOfCliffs = numberOfCliffs;
    }
}
