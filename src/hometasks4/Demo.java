package hometasks4;

import java.text.SimpleDateFormat;

public class Demo {
    public static void main(String[] args) {


        Hometask hometask1 = new Hometask("DataBases", 1, "DataBases Basics", "SomeBigTextttttt");
        Hometask hometask2 = new Hometask("DataBases2", 2, "DataBases Basics2", "SomeBigTextttttt2");
        Hometask hometask3 = new Hometask("DataBases3", 3, "DataBases Basics3", "SomeBigTextttttt3");

        Hometask[] myArrayOfHometasks = {hometask1, hometask2, hometask3};

        SimpleDateFormat firstDate = new SimpleDateFormat("01.01.1990");
        SimpleDateFormat secondDate = new SimpleDateFormat("05.05.1995");
        SimpleDateFormat thirdDate = new SimpleDateFormat("09.09.1996");

        Student student1 = new Student(1, "Ivan", "Ivanov", firstDate, "Ukraine", 4.5, myArrayOfHometasks);
        Student student2 = new Student(2, "Petro", "Petrov", secondDate, "Poland", 3.7, myArrayOfHometasks);
        Student student3 = new Student(3, "Somename", "Somesecondname", thirdDate, "Russia", 4.9, myArrayOfHometasks);


        Student[] myArrayOfStudents = {student1, student2, student3};


        Group group1 = new Group(13, "CS", myArrayOfStudents);

        System.out.println(group1.getNumber());
        System.out.println(group1.getFaculty());
        System.out.println(group1.getArrayOfStudents());
        System.out.println(group1.getAmount());
        System.out.println(group1.getMedialScore());





    }
}
