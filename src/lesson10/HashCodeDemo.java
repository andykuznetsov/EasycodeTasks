package lesson10;

import java.util.ArrayList;
import java.util.HashSet;

public class HashCodeDemo {
    public static void main(String[] args) {

        ArrayList<a1> a1ArrayList = new ArrayList<>();
        ArrayList<a2> a2ArrayList = new ArrayList<>();
        ArrayList<a3> a3ArrayList = new ArrayList<>();

        /*
        a1 a1 = new a1("String1", 1);
        a2 a2 = new a2("String2", 2);
        a3 a3 = new a3("String2", 3);

        System.out.println(a2.hashCode());
        */

        for (int i =0; i<1000; i++){
            a1ArrayList.add(new a1(String.valueOf(i), i));
            a2ArrayList.add(new a2(String.valueOf(i), i));
            a3ArrayList.add(new a3(String.valueOf(i), i));

        }

        HashSet<a1> a1HashSet = new HashSet<>(a1ArrayList);
        HashSet<a2> a2HashSet = new HashSet<>(a2ArrayList);
        HashSet<a3> a3HashSet = new HashSet<>(a3ArrayList);

        long l1 = System.currentTimeMillis();

        System.out.println(a1ArrayList.containsAll(a1HashSet));
        System.out.println(a1ArrayList.size());
        System.out.println(a1HashSet.size());
        long l2 = System.currentTimeMillis();
        System.out.println(l2-l1);

        l1 = System.currentTimeMillis();

        System.out.println(a2ArrayList.containsAll(a2HashSet));
        System.out.println(a2ArrayList.size());
        System.out.println(a2HashSet.size());
        l2 = System.currentTimeMillis();
        System.out.println(l2-l1);

        l1 = System.currentTimeMillis();

        System.out.println(a3ArrayList.containsAll(a3HashSet));
        System.out.println(a3ArrayList.size());
        System.out.println(a3HashSet.size());
        l2 = System.currentTimeMillis();
        System.out.println(l2-l1);

    }
}
