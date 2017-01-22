package hometasks1; /**
 * Created by andrey1 on 17.12.16.
 */

import java.util.Scanner;


public class App11 {
    public static void main(String[] args) {
        double amount, course = 27.2;
        int curr;
        System.out.println("Enter currency and amount of money. 1 to UAH, 2 to USD");
        Scanner in = new Scanner(System.in);
        System.out.println("Currency: ");
        curr = in.nextInt();
        System.out.println("Amount: ");
        amount = in.nextInt();


        if (curr==1){
            System.out.println(String.format("%8.2f", amount/course).replace(',', '.') + " USD");
        }
        else if (curr==2){
            System.out.println(amount*course + " UAH");
        }
        else{
            System.out.println("Wrong currency");
        }
    }
}
