package syncronization.lock;

import java.util.concurrent.locks.Lock;

public class Adder implements Runnable{
    Number number ;
    Lock lock;

    Adder(Number number, Lock lock){
        this.lock = lock;
        this.number = number;
    }

    @Override
    public void run() {
        add();
    }
    public void add(){
        for(int i = 1; i <= 1000 ;i++ ){
            lock.lock();
            number.number += i;
            System.out.println("Adding " +i);
            lock.unlock();
        }
    }

}
