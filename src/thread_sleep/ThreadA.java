package thread_sleep;

import static java.lang.Thread.currentThread;

public class ThreadA extends Thread {
    @Override
    public void run() {
        for(int i =0 ; i < 5; i++){
            System.out.println(i+"From thread1");
            try {
                Thread.sleep(50);
            }catch (InterruptedException e){
                System.out.println("Error");
            }
        }
    }
}
