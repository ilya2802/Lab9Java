package ua.lviv.iot.fortifications.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.ArrayList;
import java.util.List;

@Entity
public abstract class Fortifications {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private double lenght;
    private double depth;
    private double timeToBuild;



    public Fortifications(final double lenght, final double depth,
                          final double timeToBuild) {
        this.lenght = lenght;
        this.depth = depth;
        this.timeToBuild = timeToBuild;
    }

    public Fortifications() {
    }

    public String getHeaders(){
      return "lenght, depth, timeToBuild";
    }

    public String toCSV() {
        return getLenght() + "," + getDepth() + "," + getTimeToBuild();
    }

    public double getLenght() {
        return lenght;
    }

    public void setLenght(final double lenght) {
        this.lenght = lenght;
    }

    public double getDepth() {
        return depth;
    }

    public void setDepth(final double depth) {
        this.depth = depth;
    }

    public double getTimeToBuild() {
        return timeToBuild;
    }

    public void setTimeToBuild(final double timeToBuild) {
        this.timeToBuild = timeToBuild;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

}
