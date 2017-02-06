package hometasks4;

import java.text.SimpleDateFormat;

/**
 * Created by andrey1 on 1/16/17.
 */
public class Student {
    // Variables
    private int numberInGroup;
    private String firstName, secondName;
    private SimpleDateFormat dateOfBirth = new SimpleDateFormat("dd.MM.yyyy");
    private String nationality;
    protected double medialScore;
    private Hometask[] arrayOfHometasks;

    // Constructor
    public Student(int numberInGroup, String firstName, String secondName, SimpleDateFormat dateOfBirth, String nationality, double medialScore, Hometask[] arrayOfHometasks) {
        this.numberInGroup = numberInGroup;
        this.firstName = firstName;
        this.secondName = secondName;
        this.dateOfBirth = dateOfBirth;
        this.nationality = nationality;
        this.medialScore = medialScore;
        this.arrayOfHometasks = arrayOfHometasks;
    }


    // Getters
    public int getNumberInGroup() {
        return numberInGroup;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public SimpleDateFormat getDateOfBirth() {
        return dateOfBirth;
    }

    public String getNationality() {
        return nationality;
    }

    public double getMedialScore() {
        return medialScore;
    }

    // Setters
    public void setNumberInGroup(int numberInGroup) {
        this.numberInGroup = numberInGroup;
    }

    private void setMedialScore(double medialScore) {
        this.medialScore = medialScore;
    }


}
