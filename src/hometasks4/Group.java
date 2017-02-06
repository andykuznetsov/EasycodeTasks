package hometasks4;


import java.text.SimpleDateFormat;

/**
 * Created by andrey1 on 1/16/17.
 */
public class Group {

    private int number;
    private String faculty;


    public Student[] arrayOfStudents;

    public int amount;

    public double getMedialScore(){
        double sum = 0;
        for (int i = 0; i < arrayOfStudents.length; i++){
            sum = sum + arrayOfStudents[i].getMedialScore();
        }
        return sum / arrayOfStudents.length;
    }

    private double medialScore;

    public Group(int number, String faculty, Student[] arrayOfStudents) {
        this.number = number;
        this.faculty = faculty;
        this.arrayOfStudents = arrayOfStudents;
        this.amount = arrayOfStudents.length;
        this.medialScore = getMedialScore();
    }

    public int getNumber() {
        return number;
    }

    public String getFaculty() {
        return faculty;
    }

    public Student[] getArrayOfStudents() {
        return arrayOfStudents;
    }

    public int getAmount() {
        return amount;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

}
