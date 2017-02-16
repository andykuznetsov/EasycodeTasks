package lesson10.holidays;

import java.util.Calendar;
import java.util.TreeSet;

public class TreeSetGenerator {

    TreeSet<Holiday> holidayTreeSet = new TreeSet<>();

    boolean addHoliday(Holiday e){
        return  holidayTreeSet.add(e);
    }

    void todaysHolidays(){

        Calendar currentDate = Calendar.getInstance();
        Calendar tomorrowDate = Calendar.getInstance();
        tomorrowDate.set(117,2,7, 0,0,0);
 //       System.out.println(holidayTreeSet.subSet(currentDate, true, tomorrowDate, true));
    }

    public TreeSet<Holiday> getHolidayTreeSet() {
        return holidayTreeSet;
    }

}

