package lesson4_j;

import java.io.IOException;

public class App2 {
	public static void main(String[] args) throws IOException {
		RemoteControl projectorRemoteControl = new RemoteControl();
		
		byte numberOfButton = 15;
		System.out.println("Button switched: " + 
				projectorRemoteControl.switchSpecificButton(numberOfButton));
		
		System.out.println(numberOfButton);
	}
	
}
