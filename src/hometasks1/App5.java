package hometasks1; /**
 * Created by a1 on 16.12.16.
 */
import java.util.Scanner;

public class App5 {
    public static void main(String[] args) {
        int mark;
        Scanner in = new Scanner(System.in);
        mark = in.nextInt();
        if (mark >=0 && mark <= 19) {
            System.out.println("F");
        }
        else if (mark >=20 && mark <= 39){
            System.out.println("E");
        }
        else if (mark >=40 && mark <= 59){
            System.out.println("D");
        }
        else if (mark >=60 && mark <= 74){
            System.out.println("C");
        }
        else if (mark >=75 && mark <= 89){
            System.out.println("B");
        }
        else if (mark >=90 && mark <= 100){
            System.out.println("A");
        }
        else {
            System.out.println("Incorrect mark ");
        }
    }
}
