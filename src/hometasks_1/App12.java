package hometasks_1; /**
 * Created by andrey1 on 17.12.16.
 */

import java.util.Scanner;


public class App12 {
    public static void main(String[] args) {
        double amount;
        final double course = 27.2;
        int curr;
        System.out.println("Enter currency and amount of money. 1 to UAH, 2 to USD");
        Scanner in = new Scanner(System.in);
        System.out.println("Currency: ");
        curr = in.nextInt();
        System.out.println("Amount: ");
        amount = in.nextInt();
        int amount1 = (int)(amount/course);
        if (curr==1){
            System.out.println(amount1 + " USD + " + String.format("%4.2f", amount%course).replace(',', '.') + " UAH");
        }
        else if (curr==2){
            System.out.println(amount*course + " UAH");
        }
        else{
            System.out.println("Wrong currency");
        }
    }
}
