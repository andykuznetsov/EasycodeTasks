package lesson10;

public class a3 {
    String stringField;
    int intField;

    public a3(String stringField, int intField) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        a3 a3 = (a3) o;

        if (intField != a3.intField) return false;
        return stringField != null ? stringField.equals(a3.stringField) : a3.stringField == null;
    }

    @Override
    public int hashCode() {
        int result = stringField != null ? stringField.hashCode() : 0;
        result = 31 * result + intField;
        return result;
    }
}
