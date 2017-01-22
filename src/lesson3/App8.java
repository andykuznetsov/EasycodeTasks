package lesson3;

import java.io.IOException;
import java.util.Arrays;

/**
 * Created by andrey1 on 26.12.16.
 */
public class App8 {
        public static void main(String[] args) throws IOException {

            int sourceArray[] = new int[]{1,2,3,4,5,6,7,8,9,0};
            int destinationArray[] = new int[10];

            for (int i = 0; i<destinationArray.length; i++){
                destinationArray[i]=sourceArray[sourceArray.length-i-1];
            }

            System.out.println("Dest:" + Arrays.toString(destinationArray));


    }
}
