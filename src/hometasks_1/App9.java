package hometasks_1; /**
 * Created by andrey1 on 17.12.16.
 */
import java.util.Scanner;


public class App9 {
    public static void main(String[] args) {
        int i=1;
        while (i<100){
            i=i+1;
            System.out.print(i + " ");
            i=i+3;
            System.out.print(i + " ");
            i=i+5;
            System.out.print(i + " ");
        }

        System.out.println();

        for (i=1; i<100; i=i+9){
            System.out.print(i+1 + " ");
            System.out.print(i+4 + " ");
            System.out.print(i+9 + " ");
        }

        System.out.println();

        i=1;
        do {
            i=i+1;
            System.out.print(i + " ");
            i=i+3;
            System.out.print(i + " ");
            i=i+5;
            System.out.print(i + " ");
        }
        while (i<100);

    }
}
