package hometasks1; /**
 * Created by andrey1 on 17.12.16.
 */
import java.util.Scanner;

public class App7 {
    public static void main(String[] args) {
        int x,y;
        Scanner in = new Scanner(System.in);
        x = in.nextInt();
        y = in.nextInt();
        if (x<0 && y>0){
            System.out.println(1);
        }
        else if (x>0 && y>0){
            System.out.println(2);
        }
        else if (x>0 && y<0){
            System.out.println(3);
        }
        else if (x<0 && y<0){
            System.out.println(4);
        }
        else if (x==0 || y==0){
            System.out.println("Points are on the axis");
        }
    }
}
