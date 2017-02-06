package lesson9;

import java.util.*;

public class RealizationList implements List{

    ArrayList evenNumbers = new ArrayList();
    ArrayList oddNumbers = new ArrayList();


    @Override
    public int size() {
        return evenNumbers.size() + oddNumbers.size();
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public Object[] toArray(Object[] a) {
        return new Object[0];
    }

    @Override
    public boolean add(Object o) {
        return true;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean addAll(Collection c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public Object get(int index) {
        return null;
    }

    @Override
    public Object set(int index, Object element) {
        if ((Integer) element % 2 != 0){
            return evenNumbers.set(index, element);
        }
        else {
            return oddNumbers.set(index, element);
        }
    }

    @Override
    public boolean retainAll(Collection c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection c) {
        return false;
    }

    @Override
    public boolean containsAll(Collection c) {
        return false;
    }

    @Override
    public void add(int index, Object element) {
        if ((Integer) element % 2 != 0){
            evenNumbers.add(index, element);
        }
        else {
            oddNumbers.add(index, element);
        }
    }

    @Override
    public Object remove(int index) {
        return null;
    }

    public Object removeEven(int index){
        return evenNumbers.remove(index);
    }

    public Object removeOdd(int index){
        return oddNumbers.remove(index);
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator listIterator() {
        return null;
    }

    @Override
    public ListIterator listIterator(int index) {
        return null;
    }

    @Override
    public List subList(int fromIndex, int toIndex) {
        return null;
    }
}
