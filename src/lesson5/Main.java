package lesson5;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;

/**
 * Created by Andrey on 1/19/17.
 */
public class Main {
    public static void main(String[] args) {

        Date firstBoxDate = new Date(2017,01,01);
        Date secondBoxDate = new Date(2017,01,03);

        Box myFirstBox = new Box(1, 3, 4, 6, firstBoxDate);
        Box mySecondBox = new Box(1, 3, 4, 6, secondBoxDate);





        Box[] a = {myFirstBox, mySecondBox};

        Arrays.sort(a, new Comparator<Box>() {
            @Override
            public int compare(Box o1, Box o2) {
                return o1.getBoxDate().compareTo(o2.getBoxDate());
            }
        });

        System.out.println("result: " + Arrays.toString(a));







    }
}
