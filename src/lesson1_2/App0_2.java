package lesson1_2;

/**
 * Created by andrey1 on 19.12.16.
 */
public class App0_2 {
    public static void main(String[] args) {
        boolean firstBool = false;
        boolean secondBool = true;
        boolean resultOR = firstBool | secondBool;
        boolean resultAND = firstBool & secondBool;

        boolean resultORDouble = firstBool || secondBool;
        boolean resultANDDouble = firstBool && secondBool;

        System.out.println(resultOR);
        System.out.println(resultAND);
        System.out.println(resultORDouble);
        System.out.println(resultANDDouble);
    }

}
