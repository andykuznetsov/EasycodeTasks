package lesson6.anonymous;

/**
 * Created by Andrey on 1/19/17.
 */
public class Main {
    public static void main(String[] args) {
        SomeActionInterface myImp1 = new SomeActionInterface() {
            @Override
            public int doSomeActionAndGetResult() {
                System.out.println("method inside of interface");
                return 100;
            }
        };


        int result = myImp1.doSomeActionAndGetResult();
        System.out.println("result: " + result);

    }
}
