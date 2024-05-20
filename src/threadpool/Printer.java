package threadpool;

public class Printer implements Runnable{
    int i;
    Printer(int i){
        this.i = i;
    }
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()
        + " i-> " + i);
    }
}
