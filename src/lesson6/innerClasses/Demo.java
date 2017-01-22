package lesson6.innerClasses;

/**
 * Created by Andrey on 1/19/17.
 */
public class Demo {
    public static void main(String[] args) {
        Outer outerObject = new Outer();

        Outer.Inner myinner1 = outerObject.new Inner();
        Outer.Inner myinner2 = outerObject.new Inner();
    }
}
