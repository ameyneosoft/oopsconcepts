package thread_sleep;

public class Main {
    public static void main(String[] args) throws InterruptedException{
        ThreadA a = new ThreadA();
        ThreadB b = new ThreadB(a);
        a.start();
        b.start();
//        Thread.sleep(5000);
        System.out.println("Printed after sleeping");
    }
}
