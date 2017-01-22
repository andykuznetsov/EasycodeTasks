package hometasks1; /**
 * Created by andrey1 on 17.12.16.
 */
import java.util.Scanner;


public class App8 {
    public static void main(String[] args) {
        double a,b,c;
        Scanner in = new Scanner(System.in);
        a = in.nextDouble();
        b = in.nextDouble();
        c = in.nextDouble();
        double sum = a+b+c;
        double composition = a*b*c;
        System.out.println(Math.max(sum, composition)+3);
    }
}
