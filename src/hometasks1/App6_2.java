package hometasks1; /**
 * Created by andrey1 on 17.12.16.
 */
import java.util.Arrays;
import java.util.Scanner;

public class App6_2 {
    public static void main(String[] args) {
        int n, amount = 0;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        boolean[] primes = new boolean[n];
        Arrays.fill(primes,true);
        primes[0] = primes[1] = false;
        for (int i = 2; i < primes.length; i++) {
            if(primes[i]) {
                for (int j = 2; i * j < primes.length; j++) {
                    primes[i * j] = false;
                }
                System.out.print(i + " ");
                amount++;
            }
        }
        System.out.println("Количество простых чисел: " + amount);
    }
}
