package ua.lviv.iot.fortifications.models;

public class Blindage extends Fortifications {

    private CoveringType kindOfCovering;
    private int capacityOfPeople;
    private double square;

    public Blindage(final double lenght, final double depth,
                    final double timeToBuild,
                    final CoveringType kindOfCovering,
                    final int capacityOfPeople, final double square) {
        super(lenght, depth, timeToBuild);
        this.kindOfCovering = kindOfCovering;
        this.capacityOfPeople = capacityOfPeople;
        this.square = square;
    }

    public String getHeaders(){
        return super.getHeaders() + ", kindOfCovering, capacityOfPeople, square";
    }

    public String toCSV() {
        return super.toCSV() + "," + getKindOfCovering() + "," + getCapacityOfPeople() + "," + getSquare();
    }

    public CoveringType getKindOfCovering() {
        return kindOfCovering;
    }

    public void setKindOfCovering(final CoveringType kindOfCovering) {
        this.kindOfCovering = kindOfCovering;
    }

    public int getCapacityOfPeople() {
        return capacityOfPeople;
    }

    public void setCapacityOfPeople(final int capacityOfPeople) {
        this.capacityOfPeople = capacityOfPeople;
    }

    public double getSquare() {
        return square;
    }

    public void setSquare(final double square) {
        this.square = square;
    }
    public class MyClass{

    }
}
