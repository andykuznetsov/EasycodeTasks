package lesson13;

public class ThreadCreationDemo {
    public static void main(String[] args) {
        Thread newThread= new Thread();
        Thread newThreadWithName = new Thread("SomeName");

        Thread newMyThread = new MyThread();
        newMyThread.start();
        newMyThread.run();
    }
}
