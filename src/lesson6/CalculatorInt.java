package lesson6;


import java.util.Scanner;
import java.util.StringTokenizer;

public class CalculatorInt {
    public static void main(String[] args) {
        String someString, s1, s2, s3;
        double res = 0;
        Scanner in = new Scanner(System.in);
        someString = in.nextLine();


        StringTokenizer myTokenizer = new StringTokenizer(someString, "+/*-", true);

        s1 = myTokenizer.nextToken();
        s2 = myTokenizer.nextToken();
        s3 = myTokenizer.nextToken();

    //    System.out.println(s1);
    //    System.out.println(s2);
    //    System.out.println(s3);



        Integer i1, i2;
        i1 = Integer.valueOf(s1);
        i2 = Integer.valueOf(s3);


    //    System.out.println(i1);
    //    System.out.println(i2);


        switch (s2){
            case "/":
                res = i1/i2;
                break;
            case "+":
                res = i1+i2;
                break;
            case "-":
                res = i1-i2;
                break;
            case "*":
                res = i1*i2;
                break;
        }

        System.out.println(res);

    //    Integer.valueOf(a)


    }

}
