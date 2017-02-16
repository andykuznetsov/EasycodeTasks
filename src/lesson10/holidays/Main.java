package lesson10.holidays;

import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        TreeSetGenerator newGenerator = new TreeSetGenerator();
        newGenerator.addHoliday(new Holiday(new Date(117, 2,6), "Праздник 1"));
        newGenerator.addHoliday(new Holiday(new Date(117, 2,6), "Праздник 2"));
        newGenerator.addHoliday(new Holiday(new Date(117, 2,7), "Праздник 3"));
        newGenerator.addHoliday(new Holiday(new Date(117, 2,7), "Праздник 4"));
        newGenerator.addHoliday(new Holiday(new Date(117, 2,8), "Праздник 5"));

        for (Holiday holiday : newGenerator.getHolidayTreeSet()) {
            System.out.println(holiday.getDate() + " " + holiday.getName());
        }

        Calendar.getInstance();





    }
}
