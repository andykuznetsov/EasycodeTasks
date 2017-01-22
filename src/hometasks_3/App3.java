package hometasks_3;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;



/**
 * Created by andrey1 on 26.12.16.
 */
public class App3 {

    public static void main(String[] args) throws IOException {

        int n, lastPositivePosition = 0;
        Double max = Double.MIN_VALUE, sum = 0.0;

        System.out.println("Enter number of elements in massive: ");
        Scanner in = new Scanner(System.in);
        n = in.nextInt();

        Double randomArray[] = new Double[n];


        for (int i = 0; i < n; i++) {
            Scanner in1 = new Scanner(System.in);
            randomArray[i] = in1.nextDouble();
        }
        System.out.println(Arrays.toString(randomArray));


        for (int i = 0; i < randomArray.length; i++){
            if (randomArray[i]>max){
                max = randomArray[i];
            }
        }

        System.out.println("Max element: " + max);

        for (int i = 0; i < randomArray.length; i++){
            if (randomArray[i] > 0){
                lastPositivePosition = i;
            }
        }

        for (int i = 0; i < lastPositivePosition; i++){
            sum = sum + randomArray[i];
        }

        System.out.println(lastPositivePosition);
        System.out.println("Sum before last positive element: " + sum);

        Double a, b, c;

        System.out.println("Enter number of elements in massive: ");
        Scanner in1 = new Scanner(System.in);
        a = in1.nextDouble();
        b = in1.nextDouble();

        for (int i = 0; i < randomArray.length; i++){
            if ((Math.abs(randomArray[i]) > a) && (Math.abs(randomArray[i]) < b)){
                c = randomArray[i];
                randomArray[i] = 0.0;
            }
        }

        for (int i = 0; i < randomArray.length; i++){
        //    if [ra]
        }

    }
}
