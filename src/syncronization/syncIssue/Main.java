package syncronization.syncIssue;

public class Main {
    public static void main(String[] args) throws InterruptedException{
        Number num = new Number(0);
        Adder adder = new Adder(num);
        Subtractor subtractor = new Subtractor(num);
        Thread t1 = new Thread(adder);
        Thread t2 = new Thread(subtractor);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(num.number);
    }
}
