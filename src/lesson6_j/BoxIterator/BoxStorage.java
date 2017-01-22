package lesson6_j.BoxIterator;

import java.util.Iterator;

public class BoxStorage {
	
	private Box[] boxes;
	
	public BoxStorage(Box[] boxes) {
		this.boxes = boxes;
	}
	
	public class BoxesIterator implements Iterator<Box> {
		private int currentIndex = 0;
		
		@Override
		public boolean hasNext() {
			return BoxStorage.this.boxes.length > currentIndex;
		}
		
		@Override
		public Box next() {
			return BoxStorage.this.boxes[currentIndex++];
		}
	}
}
