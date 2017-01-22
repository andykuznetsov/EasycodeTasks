package lesson2;

/**
 * Created by andrey1 on 22.12.16.
 */

import java.io.IOException;

public class App2 {
    public static void main(String[] args) throws IOException{
        String greeting = new String("Hello!");

        String name = "MyName";

        String totalGreet = greeting + " " + name;

        System.out.print(totalGreet);

    }
}
