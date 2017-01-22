package lesson1_2;

/**
 * Created by andrey1 on 19.12.16.
 */
public class App0_1 {
    public static void main(String[] args) {
        int x=5;
        int y=6;
        System.out.println("x=" + x + "; y=" + y);
        // Аналогично:
        System.out.printf("x=%d; y=%d \n", x, y);

        System.out.println("Hello word!!1");
        // Аналогично:
        System.out.print("\nHello word!!1");
        System.out.println();

        int countStudents = 10, countTeachers = 1;
        System.out.printf("Students: %d, Teachers: %d \n", countStudents, countTeachers);
    }

}
