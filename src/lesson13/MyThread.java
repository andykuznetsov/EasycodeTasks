package lesson13;

public class MyThread extends Thread {

    @Override
    public void run() {
        super.run();
        System.out.println("run in new thread" + MyThread.currentThread());
    }
}
