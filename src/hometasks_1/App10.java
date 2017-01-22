package hometasks_1; /**
 * Created by andrey1 on 17.12.16.
 */

import java.util.Scanner;


public class App10 {
    public static void main(String[] args) {
        int n;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();

        for (int j = 1; j < n + 1; j++) {
            for (int i = j; i < n; i++) {
                System.out.print(" ");
            }
            for (int k = n; k >= n - (2 * (j - 1)); k--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
