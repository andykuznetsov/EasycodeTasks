package lesson6_j.BoxIterator;

import java.util.Date;

public class BoxStorageDemo {
	
	public static void main(String[] args) {
		Box[] boxes = new Box[] {
			new Box(new Date()),
			new Box(new Date()),
			new Box(new Date()),
			new Box(new Date()),
			new Box(new Date()),
			};
		BoxStorage boxStorage = new BoxStorage(boxes);
		
		BoxStorage.BoxesIterator boxIter = boxStorage.new BoxesIterator();
		
		while (boxIter.hasNext()) {
			System.out.println(boxIter.next());
		}
	}
	
}
