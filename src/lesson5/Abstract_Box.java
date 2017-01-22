package lesson5;

/**
 * Created by andrey1 on 1/12/17.
 */

abstract class Abstract_Box implements GetSize{
    private double length, width, height;
    private int cost;
    private String matherial;

    public Abstract_Box(double length, double width, double height, int cost, String matherial) {
        this.length = length;
        this.width = width;
        this.height = height;
        this.cost = cost;
        this.matherial = "Paper";
    }

    abstract public void open();


    @Override
    public double calculateSize() {
        Double size = height*width*length;
        return size;
    }
}
