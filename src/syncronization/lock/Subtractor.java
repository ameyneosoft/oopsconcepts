package syncronization.lock;

import java.util.concurrent.locks.Lock;

public class Subtractor implements Runnable{
    Number number;
    Lock lock;

    Subtractor(Number number, Lock lock){
        this.number = number;
        this.lock = lock;
    }

    @Override
    public void run() {
        subtract();
    }
    public void subtract(){
        for(int i = 1; i <= 1000 ;i++ ){
            lock.lock();
            number.number -= i;
            System.out.println("Subtracting " +i);
            lock.unlock();
        }
    }
}
