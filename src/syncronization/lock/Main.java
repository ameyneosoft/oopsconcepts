package syncronization.lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Main {
    public static void main(String[] args) throws InterruptedException{

        Number num1 = new Number(0);
        Lock lock = new ReentrantLock();
        Adder adder = new Adder(num1, lock);
        Subtractor subtractor = new Subtractor(num1, lock);

        Thread t1 = new Thread(adder);
        Thread t2 = new Thread(subtractor);

        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println(num1.number);

    }
}
