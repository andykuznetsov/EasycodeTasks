package lesson3;

import java.io.IOException;
import java.util.Arrays;

/**
 * Created by andrey1 on 26.12.16.
 */
public class App3 {
        public static void main(String[] args) throws IOException {
            int a[] = new int[] {5, 7, 9};
            int temper[] = {25, 28, 31, 30, 32, 30};


            int []integerArray = {10, 241, 24, 45, 1, 2, 43, 45};

            for (int arrayIndex = 0; arrayIndex<temper.length; arrayIndex++){
                System.out.print(temper[arrayIndex] + " ");
            }
            System.out.println();


            for (int currentElement : temper){
                System.out.print(currentElement + " ");
            }
            System.out.println();

            for (int i =0; i<temper.length; i++){
                System.out.print(temper[i] +  " ");
            }
         //   System.out.println(Arrays.toString(integerArray));
    }
}
