package lesson4;

import java.io.IOException;


public class Factorial {
    public static void main(String[] args) throws IOException {

        Factorial application = new Factorial();
        System.out.println(application.calculateFactorial(5));

    }

    public int calculateFactorial(int factValue) {
        if (factValue == 1){
            return 1;
        }
        else {
           return calculateFactorial(factValue -1) * factValue;
        }

    }
}
