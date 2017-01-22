package hometasks_3;

import java.io.IOException;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


/**
 * Created by andrey1 on 26.12.16.
 */
public class App2 {
    public static void BubbleSort( int [ ] num )
    {
        int j;
        boolean flag = true;   // set flag to true to begin first pass
        int temp;   //holding variable

        while ( flag )
        {
            flag= false;    //set flag to false awaiting a possible swap
            for( j=0;  j < num.length -1;  j++ )
            {
                if ( num[ j ] < num[j+1] )   // change to > for ascending sort
                {
                    temp = num[ j ];                //swap elements
                    num[ j ] = num[ j+1 ];
                    num[ j+1 ] = temp;
                    flag = true;              //shows a swap occurred
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {

            int n, mul = 1, sum = 0, firstZeroPosition = 0;

            System.out.println("Enter number of elements in massive: ");
            Scanner in = new Scanner(System.in);
            n = in.nextInt();

            int lastZeroPosition = n;

            int randomArray[] = new int[n];


            for (int i = 0; i<n; i++){
                Scanner in1 = new Scanner(System.in);
                randomArray[i] = in1.nextInt();
            }
            System.out.println(Arrays.toString(randomArray));


            for (int i = 0; i < randomArray.length; i++){
                if (i%2 != 0){
                    mul = mul*randomArray[i];
                    //System.out.println(randomArray[i]);
                }
            }


            for (int i = 0; i < randomArray.length; i++){
                if (randomArray[i] == 0){
                    firstZeroPosition = i;
                    break;
                }
            }

            for (int i = randomArray.length-1; i >= 0; i--){
                if (randomArray[i] == 0){
                    lastZeroPosition = i;
                    break;
                }
            }

            for (int i = firstZeroPosition; i<lastZeroPosition; i++){
                sum = sum + randomArray[i];
            }


         //   System.out.println(count);
            System.out.println("Mul of even elements: " + mul);
            System.out.println("Sum of elements between zeroes: " + sum) ;
            System.out.println("Sorted massive: ");

            BubbleSort(randomArray);

        for (int i = 0; i < randomArray.length; i++){
                System.out.print(randomArray[i] + " ");
            }
        }

    }

