package lesson6.anonymous;

/**
 * Created by Andrey on 1/19/17.
 */
public class SomeParentClass {
    int x = 6;
    int y = 10;

    public SomeParentClass(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public SomeParentClass(int var) {
        this.x = var;
        this.y = var;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void doSmth(){
        System.out.println(" in parent");
    }
}
