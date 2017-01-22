package lesson4_j;

public class RemoteControl {
	
	int countOfButtons = 20;
	
	public void switchPowerButton() {
		System.out.println("Start switching");
		
		int i = 0;
		while(i++<10) {
			System.out.println("I'm switching");
		}
		
		System.out.println("Stop switching");
	}
	
	public boolean switchSpecificButton(byte buttonNumber) {
		boolean methodResult;
		if(buttonNumber<10) {
			methodResult = true;
		} else {
			methodResult = false;
		}
		
		
		buttonNumber++;
		return methodResult;
	}
	
}
