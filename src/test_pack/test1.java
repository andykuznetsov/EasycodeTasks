package test_pack;

import java.io.IOException;

/**
 * Created by andrey1 on 1/9/17.
 */
public class test1 {
    public static void main(String[] args) throws IOException {
        int sum=0;
        for (int i = 1; i<1000; i++){
            if ((i%3==0) || (i%5==0)){
                System.out.print(i+" ");
                sum=sum+i;
            }
        }
        System.out.println();
        System.out.println(sum);
    }

}
