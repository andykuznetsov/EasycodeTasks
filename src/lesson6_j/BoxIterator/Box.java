package lesson6_j.BoxIterator;

import java.util.Date;

public class Box {
	private Date date;
	
	public Box(Date date) {
		this.date = date;
	}
	
	@Override
	public String toString() {
		final StringBuffer sb = new StringBuffer("Box{");
		sb.append("date=").append(date);
		sb.append('}');
		return sb.toString();
	}
}
