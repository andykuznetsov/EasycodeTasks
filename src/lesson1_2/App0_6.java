package lesson1_2;

/**
 * Created by andrey1 on 19.12.16.
 */
public class App0_6 {
    public static void main(String[] args) {
        String name = "Andrey";
        switch (name) {
            case "Mike":{
                System.out.println("My name is Mike");
                break;
                // break is important!!!!!!
            }
            case "Lusi":{
                System.out.println("My name is Lusi");
                break;
            }
            case "Andrey":{
                System.out.println("My name is Andrey");
                break;
            }
            case "Alex":{
                System.out.println("My name is Alex");
                break;
            }
            default:{
                System.out.println("I am anonymous");
                break;
            }

        }
    }

}
