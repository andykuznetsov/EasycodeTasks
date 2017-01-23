package lesson6.staticnested;

public class AOuter {

    int outerX = 5;

    static class  BInner {
        int x = 10;
        static int y = 10;
    }

    class CInner {
        int x;
    }
}
