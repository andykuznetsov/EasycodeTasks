package lesson2;

/**
 * Created by andrey1 on 22.12.16.
 */

import javax.swing.*;
import java.io.IOException;

public class App5 {
    public static void main(String[] args) throws IOException{
        char a = 'a';

        String word1 = "Some word";
        String word2 = new String("Some word");

        String word3 = "Some word";

        System.out.println("Expected true " + (word1 == word3));
        System.out.println("Expected false " + (word1 == word2));
        System.out.println("Expected false " + (word3 == word2));

    }
}

