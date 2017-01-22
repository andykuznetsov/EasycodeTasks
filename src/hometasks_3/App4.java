package hometasks_3;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;


/**
 * Created by andrey1 on 26.12.16.
 */
public class App4 {

    public static void main(String[] args) throws IOException {

        int n, lastPositivePosition = 0, firstZeroPosition = 0;
        Double min = Double.MAX_VALUE, sum = 0.0;

        System.out.println("Enter number of elements in massive: ");
        Scanner in = new Scanner(System.in);
        n = in.nextInt();

        Double randomArray[] = new Double[n];

        Double secondArray[] = new Double[n];


        for (int i = 0; i < n; i++) {
            Scanner in1 = new Scanner(System.in);
            randomArray[i] = in1.nextDouble();
        }
        System.out.println(Arrays.toString(randomArray));


        for (int i = 0; i < randomArray.length; i++){
            if (Math.abs(randomArray[i])<Math.abs(min)){
                min = Math.abs(randomArray[i]);
            }
        }

        System.out.println("Min element: " + min);

        for (int i = 0; i < randomArray.length; i++){
            if (randomArray[i] == 0){
                firstZeroPosition = i;
            }
        }

        for (int i = randomArray.length-1; i > firstZeroPosition; i--){
            sum = sum + Math.abs(randomArray[i]);
        }

        System.out.println("Sum: " + sum);

        for (int i = 1; i < randomArray.length; i++){
            if (i % 2 == 0){
                secondArray[i] = randomArray[i];
            }
        }

        for (int i = 1; i < randomArray.length; i++){
            if (i % 2 != 0){
                secondArray[i] = randomArray[i];
            }
        }
    }
}
