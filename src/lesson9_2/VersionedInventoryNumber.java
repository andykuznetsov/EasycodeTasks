package lesson9_2;

import java.util.Random;

public class VersionedInventoryNumber<T> {
    private T whatIsIt;
    private int inventoryNumber;

    public VersionedInventoryNumber(T whatIsIt) {
        Random randomGenerator = new Random();
        this.inventoryNumber = randomGenerator.nextInt(Integer.MAX_VALUE);
        this.whatIsIt = whatIsIt;
    }

    public T getWhatIsIt() {
        return whatIsIt;
    }

    public void setWhatIsIt(T whatIsIt) {
        this.whatIsIt = whatIsIt;
    }

    public int getInventoryNumber() {
        return inventoryNumber;
    }

    public void setInventoryNumber(int inventoryNumber) {
        this.inventoryNumber = inventoryNumber;
    }

}
