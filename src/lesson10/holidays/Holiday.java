package lesson10.holidays;

import java.util.Date;

public class Holiday implements Comparable<Holiday>{
    Date date;
    String name;

    public Holiday(Date date, String name) {
        this.date = date;
        this.name = name;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Holiday o) {
        int d = this.date.compareTo(o.date);
        int n = this.name.compareTo(o.name);
        if (d == 0){
            return n;
        }
        else{
            return d;
        }
    }

    @Override
    public String toString() {
        return "Holiday{" +
                "date=" + date +
                ", name='" + name + '\'' +
                '}';
    }


}
