package lesson3;

import java.io.IOException;
import java.util.Arrays;

/**
 * Created by andrey1 on 26.12.16.
 */
public class App10 {
        public static void main(String[] args) throws IOException {

            int sourceArray[] = new int[]{1,2,3,4,5,6,7,8,9,0, -1};
            System.out.println(Arrays.toString(sourceArray));
int temp;
            for (int j = 0; j < sourceArray.length ; j++){
                for (int i = 0; i < sourceArray.length - j - 1; i++){
                   if (sourceArray[i]>sourceArray[i+1]) {
                       temp = sourceArray[i];
                       sourceArray[i] = sourceArray[i+1];
                       sourceArray[i+1] = temp;
                   }
                }
            }

            System.out.println(Arrays.toString(sourceArray));


    }
}
