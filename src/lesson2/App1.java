package lesson2;

/**
 * Created by andrey1 on 22.12.16.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App1 {
    public static void main(String[] args) throws IOException{
        String greeting = new String("Hello");
        String anotherGreeting = "Привет";
        System.out.println(greeting);
        System.out.println(anotherGreeting);

        char firstCharacterOfString = greeting.charAt(0);
        System.out.println("Первый символ строки: " + firstCharacterOfString);


    }
}
