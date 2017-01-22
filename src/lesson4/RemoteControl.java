package lesson4;

/**
 * Created by andrey1 on 29.12.16.
 */
public class RemoteControl {
    public int numberOfbuttons;

    public void switchPowerButton(){
        System.out.println("Start switching");

        int i=0;
        while (i++<10){
            System.out.println("I'm switching");
        }

        System.out.println("Stop switching");
    }

    public boolean switchSpecificButton(byte buttonNumber) {
        boolean methodResult;

        if (buttonNumber<10) {
            methodResult = true;
        }
        else {
            methodResult = false;
        }

        return methodResult;
    }

}



