package hometasks3;

import java.io.IOException;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by andrey1 on 26.12.16.
 */
public class App1 {
        public static void main(String[] args) throws IOException {

            int n, count = 0, count1 = 0, count2 = 0, sum = 0, sumBetween = 0, max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;


            System.out.println("Enter number of elements in massive: ");
            Scanner in = new Scanner(System.in);
            n = in.nextInt();

            int randomArray[] = new int[n];
            Random generator = new Random();
            for (int index = 0; index < randomArray.length; index++){
                randomArray[index] = (generator.nextInt()%20);
            }

            System.out.println(Arrays.toString(randomArray));

            for (int i = 0; i < randomArray.length; i++){
                if (randomArray[i]<0){
                    sum = sum + randomArray[i];
                    count = count + 1;
                    //System.out.println(randomArray[i]);
                }
            }

            for (int i = 0; i < randomArray.length; i++){
                if (randomArray[i]>max){
                    max = randomArray[i];
                //    count1 = count1 + 1;
                }
                if (randomArray[i]<min){
                    min = randomArray[i];
                //    count2 = count2 + 1;
                }
            }

         //   System.out.println(max + " " + min);


            for (int i = 0; i < randomArray.length; i++){
                if (randomArray[i] == max){
                //    max = randomArray[i];
                    count1 = i;
                    //System.out.println(randomArray[i]);
                }
                if (randomArray[i] == min){
                 //   min = randomArray[i];
                    count2 = i;
                    //System.out.println(randomArray[i]);
                }

            }

          //  System.out.println(count1 + " " + count2);

            if (count1 <= count2){
                for (int i = count1+1; i < count2; i++) {
                    sumBetween = sumBetween+randomArray[i];
                }
            }
            else
            {
                for (int i = count2+1; i < count1; i++) {
                    sumBetween = sumBetween+randomArray[i];
                }
            }

         //   System.out.println(count);
            System.out.println("Sum of negative elements: " + sum);
            System.out.println("Sum between max and min: " + sumBetween);




    }
}
