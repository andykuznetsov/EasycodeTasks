package hometasks4;


import java.text.SimpleDateFormat;

/**
 * Created by andrey1 on 1/16/17.
 */
public class Group {

    public int number;
    public String faculty;

    SimpleDateFormat firstDate = new SimpleDateFormat("01.01.1990");
    SimpleDateFormat secondDate = new SimpleDateFormat("05.05.1995");

    public Student student1 = new Student(1, "Ivan", "Ivanov", firstDate, "Ukraine", 4.5);
    public Student student2 = new Student(2, "Petro", "Petrov", secondDate, "Poland", 3.7);

    Student[] arrayOfStudents = {student1, student2};

    public int amount = arrayOfStudents.length;
    public static double medialScore;

    public double getMedialScore(){
        double sum = 0;
        for (int i = 0; i < arrayOfStudents.length; i++){
            sum = sum + arrayOfStudents[i].getMedialScore();
        }
        return sum / arrayOfStudents.length;
    }

    public Group(int number, String faculty, int amount, double medialScore) {
        this.number = number;
        this.faculty = faculty;
        this.amount = amount = arrayOfStudents.length;
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
