package lesson7;

public class ExceptionStackDemo {
    public static void main(String[] args) {
        A instanceA = new A();
        instanceA.doSomeAction();

    }
}

class A{
    public int doSomeAction(){
        try{
            doSomeAction();
        } catch (NullPointerException e) {
            System.out.println("WCNPE");
        }
        return 0;
    }

    public void doSomeAction2(){

        doSomeAction3();
    }

    public void doSomeAction3() {

    }
}


