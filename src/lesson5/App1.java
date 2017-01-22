package lesson5;

import java.io.IOException;


public class App1 {
    public static void main(String[] args) throws IOException {
        Rectangle myRect = new Rectangle(0, 5, 5, 5);
        System.out.println(myRect);
        System.out.println(myRect.x);
        System.out.println(myRect.y);
        System.out.println(myRect.width);
        System.out.println(myRect.height);

        System.out.println();

        Square mySquare = new Square(5, 5, 5, 5);
        System.out.println(mySquare.x);
        System.out.println(mySquare.y);
        System.out.println(mySquare.width);
        System.out.println(mySquare.height);
    }

}
