package lesson3;

import java.io.IOException;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by andrey1 on 26.12.16.
 */
public class App11 {
        public static void main(String[] args) throws IOException {

            int n;



            Scanner in = new Scanner(System.in);
            n = in.nextInt();

            int matrixA [][] = new int[n][n];

            Random generator = new Random();


            for (int i=0; i<n; i++){
                for (int j=0; j<n; j++) {
                    matrixA[i][j] = (generator.nextInt()%20);
                }
            }

            for (int i=0; i<n; i++){
                for (int j=0; j<n; j++) {
                    System.out.print(matrixA[i][j] + "\t");
                }
                System.out.println();
            }

            System.out.println();

            for (int i=0; i<n; i++){
                for (int j=0; j<n; j++) {
                    if (i==j){
                        matrixA[i][j] = 0;
                    }
                }
            }

            for (int i=0; i<n; i++){
                for (int j=0; j<n; j++) {
                    System.out.print(matrixA[i][j] + "\t");
                }
                System.out.println();
            }
    }
}
