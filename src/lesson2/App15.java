package lesson2;

/**
 * Created by andrey1 on 22.12.16.
 */

import java.io.IOException;

public class App15 {
    public static void main(String[] args) throws IOException{
        StringBuffer myNewbuffer = new StringBuffer();
        System.out.println("\'" + myNewbuffer);
        System.out.println(myNewbuffer.length());
        System.out.println(myNewbuffer.capacity());

        myNewbuffer.append("hello");
        System.out.println("\'" + myNewbuffer);
        System.out.println(myNewbuffer.length());
        System.out.println(myNewbuffer.capacity());


    }
}

