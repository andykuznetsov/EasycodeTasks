package lesson6.anonymous;

/**
 * Created by Andrey on 1/19/17.
 */
public class Main2 {
    public static void main(String[] args) {
        SomeParentClass myImpl1 = new SomeParentClass(5) {
            public void doSmth() {
                System.out.println(" in child");
            }
        };

        myImpl1.doSmth();
    }
}
