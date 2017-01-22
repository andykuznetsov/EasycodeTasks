package lesson3;

import java.io.IOException;

/**
 * Created by andrey1 on 26.12.16.
 */
public class App4 {
        public static void main(String[] args) throws IOException {

            int matrixA [][] = new int[][] {{2, 3, 5},
                                            {3, 5, 7}};

            for (int i=matrixA.length-1; i>=0; i--){
                for (int j=matrixA[i].length-1; j>=0; j--) {
                    System.out.print(matrixA[i][j] + "\t");
                }
                System.out.println();
            }


    }
}
