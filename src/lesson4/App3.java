package lesson4;

import java.io.IOException;


public class App3 {
    public static void main(String[] args) throws IOException {

        double a = 12, b =4, sum, min, div, mul;

        Calculator myCalc1 = new Calculator();
        sum = myCalc1.plus(a, b);
        min = myCalc1.minus(a, b);
        div = myCalc1.division(a, b);
        mul = myCalc1.multiplication(a, b);

        System.out.println(sum + " " + min + " "  + div + " " + mul);

    }
}
