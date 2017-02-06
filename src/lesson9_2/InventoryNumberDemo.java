package lesson9_2;

import lesson5.Box;

public class InventoryNumberDemo {

    public static void main(String[] args) {
        String someString = new String("s1");
        String someString2 = new String("s2");
        String someString3 = new String("s3");

        VersionedInventoryNumber<String> in1 = new VersionedInventoryNumber<>(someString);
        VersionedInventoryNumber<String> in2 = new VersionedInventoryNumber<>(someString2);
        VersionedInventoryNumber<String> in3 = new VersionedInventoryNumber<>(someString3);


        System.out.println(in1.getInventoryNumber() + " " + in1.getWhatIsIt());
    }
}
