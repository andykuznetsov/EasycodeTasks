package lesson10;

import java.util.Random;

public class a2 {
    String stringField;
    int intField;

    public a2(String stringField, int intField) {
        this.stringField = stringField;
        this.intField = intField;
    }

    public String getStringField() {
        return stringField;
    }

    public void setStringField(String stringField) {
        this.stringField = stringField;
    }

    public int getIntField() {
        return intField;
    }

    public void setIntField(int intField) {
        this.intField = intField;
    }


    // random
    @Override
    public int hashCode() {
        Random randomGenerator = new Random();
        return randomGenerator.nextInt(Integer.MAX_VALUE);
    }
}
