package lesson4_j;

import java.io.IOException;
import java.util.Arrays;

public class App1 {
	public static void main(String[] args) throws IOException {
		RemoteControl projectorRemoteControl = new RemoteControl();
		System.out.println("New object has been created");
		projectorRemoteControl.switchPowerButton();
		System.out.println("New object has been created");
	}
	
}
