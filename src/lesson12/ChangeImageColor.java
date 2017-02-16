package lesson12;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Random;

public class ChangeImageColor {
    public static void main(String[] args) throws IOException{

        try {
            FileInputStream inputStream = new FileInputStream("/Users/Andrey/IdeaProjects/EasycodeTasks/pictures/before.bmp");
            byte[] someByteArray = new byte[inputStream.available()];
            System.out.println(inputStream.available());
            inputStream.read(someByteArray);
            System.out.println(someByteArray.length);
            System.out.println(Arrays.toString(someByteArray));

            /*
            someByteArray[i] = (byte)random.nextInt(127);
            someByteArray[i+1] = (byte)random.nextInt(127);
            someByteArray[i+2] = (byte)random.nextInt(127);
            */

            Random random = new Random();


            for (int i = 53; i<someByteArray.length - 1; i=i+3){
                someByteArray[i] = (byte)1;
                someByteArray[i+1] = (byte)1;
                someByteArray[i+2] = (byte)1;
            }
            System.out.println(Arrays.toString(someByteArray));

            FileOutputStream outputStream = new FileOutputStream("/Users/Andrey/IdeaProjects/EasycodeTasks/pictures/after.bmp");
            outputStream.write(someByteArray);

        }
        catch (FileNotFoundException exception) {
            exception.printStackTrace();
        }

    }
}
