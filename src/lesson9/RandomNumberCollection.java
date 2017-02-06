package lesson9;

import java.util.Iterator;
import java.util.Random;

public class RandomNumberCollection implements Iterable{

    public int number;

    public RandomNumberCollection(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public Iterator iterator() {
        return new IteratorRealize();
    }

    public class IteratorRealize implements Iterator{

        int index = 0;

        @Override
        public boolean hasNext() {
            return index != number;
        }

        @Override
        public Object next() {
            index++;
            Random n = new Random(100);
            return n.nextInt();
        }

    }




}
