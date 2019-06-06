package ua.lviv.iot.fortifications.models;

public class AntitankNadovb extends Fortifications {

    private MaterialType kindOfMaterial;

    public AntitankNadovb() {
    }

    public AntitankNadovb(final double lenght, final double depth,
                          final double timeToBuild,
                          final MaterialType kindOfMaterial) {
        super(lenght, depth, timeToBuild);
        this.kindOfMaterial = kindOfMaterial;
    }

    public String getHeaders(){
        return super.getHeaders() + ", kindOfMaterial";
    }

    public String toCSV() {
        return super.toCSV() + "," + getKindOfMaterial();
    }

    public MaterialType getKindOfMaterial() {
        return kindOfMaterial;
    }

    public void setKindOfMaterial(final MaterialType kindOfMaterial) {
        this.kindOfMaterial = kindOfMaterial;
    }
}
