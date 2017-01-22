package lesson4;

/**
 * Created by andrey1 on 29.12.16.
 */
public class Room {
    public int Area;
    public int Volume;
    public String nameOfRoom;

    public int countOfPeople;
    public int maxNumberOfPeople = Area;

    public int addOnePerson(int countOfPeople) {
        while (countOfPeople<=maxNumberOfPeople)
        {
            countOfPeople = countOfPeople+1;
            System.out.println(" " + countOfPeople);
        }

        return  countOfPeople;
    }

    public void swichOnLight(){
        System.out.println("Light has been switched on");
    }

}



