package lesson4;

/**
 * Created by andrey1 on 29.12.16.
 */
public class Calculator {

    double sum, number1, number2;

    {
        sum = number1 + number2;
        System.out.println(sum);
    }

    public double plus(double number1, double number2){
        double result;
        result = number1+number2;
        return result;
    }

    public double plus(double number1, int number2){
        double result;
        result = number1+number2;
        return result;
    }

    public float plus(float number1, int number2){
        float result;
        result = number1+number2;
        return result;
    }

    public double minus(double number1, double number2){
        double result;
        result = number1-number2;
        return result;
    }


    public double division(double number1, double number2){
        double result;
        result = number1/number2;
        return result;
    }


    public double multiplication(double number1, double number2){
        double result;
        result = number1*number2;
        return result;
    }


}



