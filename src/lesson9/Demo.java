package lesson9;

public class Demo {
    public static void main(String[] args) {
        RandomNumberCollection myCollection = new RandomNumberCollection(10);
        RandomNumberCollection.IteratorRealize iteratorRealize = myCollection.new IteratorRealize();

        RealizationList myList = new RealizationList();

        myList.add(5);

       // while (myList.


        while (iteratorRealize.hasNext()){
            System.out.println(iteratorRealize.next());
        }
    }
}
