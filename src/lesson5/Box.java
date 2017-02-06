package lesson5;

import java.util.Date;

/**
 * Created by andrey1 on 1/12/17.
 */

public class Box implements GetSize, Cloneable {
    private double length, width, height;
    private int cost;
    private Date boxDate;

    public Box(double length, double width, double height, int cost, Date boxDate) {
        this.length = length;
        this.width = width;
        this.height = height;
        this.cost = cost;
        this.boxDate = boxDate;
    }

    private Box[] boxes;

    public void setLength(double length) {
        this.length = length;
        {
            throw new IllegalArgumentException();
        }
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public Date getBoxDate() {
        return boxDate;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public Box clone() throws CloneNotSupportedException {
        return (Box) super.clone();
    }

    @Override
    public double calculateSize() {
        Double size = height*width*length;
        return size;
    }
}
