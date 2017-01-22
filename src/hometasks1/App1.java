package hometasks1;

/**
 * Created by a1 on 16.12.16.
 */
public class App1 {
    public static void main(String[] args) {
        double a1=1.7, a2=2.3, a3=-3.1, a4=-0.7, a5=0;
        double countPositive = 0, countNegative = 0;
        double sum = a1+a2+a3+a4+a5; // calculating sum of all numbers

        if (a1>=0){
            countPositive = countPositive + a1;
        }
        else {
            countNegative = countNegative + Math.abs(a1);
        }
        if (a2>=0){
            countPositive = countPositive +a2;
        }
        else {
            countNegative = countNegative + Math.abs(a2);
        }
        if (a3>=0){
            countPositive = countPositive + a3;
        }
        else {
            countNegative = countNegative + Math.abs(a3);
        }
        if (a4>=0){
            countPositive = countPositive + a4;
        }
        else {
            countNegative = countNegative + Math.abs(a4);
        }
        if (a5>=0){
            countPositive = countPositive + a5;
        }
        else {
            countNegative = countNegative + Math.abs(a5);
        }

        System.out.println(String.format("%.1f", sum)) ;
        System.out.println(countPositive);
        System.out.println(countNegative);
    }
}