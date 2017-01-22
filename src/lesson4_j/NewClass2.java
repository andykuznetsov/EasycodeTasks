package lesson4_j;

import java.util.Objects;

public class NewClass2 {
	
	public int value = 6;
	
	public NewClass2(int value) {
		this.value = value;
	}
	
	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof NewClass2)) return false;
		NewClass2 newClass2 = (NewClass2) o;
		return value == newClass2.value;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(value);
	}
}
