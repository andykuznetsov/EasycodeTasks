package lesson4;

import java.io.IOException;


public class App2 {
    public static void main(String[] args) throws IOException {
        Room room1;
        room1 = new Room();

        Room room2 = new Room();

        RemoteControl projectorRemoteControl = new RemoteControl();
        System.out.println("Button switched" + (projectorRemoteControl.switchSpecificButton((byte)15)));

    }
}
