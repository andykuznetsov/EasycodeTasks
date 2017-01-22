package lesson1_2;

/**
 * Created by andrey1 on 19.12.16.
 */

import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.*;
import java.lang.Object;
import java.text.Collator;

public class App0_5 {
    public static void main(String[] args) {
        Calendar calendar = new GregorianCalendar();
        String am_pm;
        int hour = calendar.get( Calendar.HOUR );
        int minute = calendar.get( Calendar.MINUTE );
        // int second = calendar.get(Calendar.SECOND);
        if( calendar.get( Calendar.AM_PM ) == 0 ){
            am_pm = "AM";
            if(hour >=10)
                System.out.println( "welcome" );
        }
        else{
            am_pm = "PM";
            if(hour<6)
                System.out.println( "welcome" );
        }

        String time = "Current Time : " + hour + ":" + minute + " " + am_pm;
        System.out.println( time );
    }

}
