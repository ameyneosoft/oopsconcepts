package thread_sleep;

public class ThreadB extends Thread{
    ThreadA ta;
    ThreadB(ThreadA ta){
        this.ta = ta;
    }
    @Override
    public void run() {
        for(int i =0 ; i < 5; i++){
            System.out.println(i+"From thread2");
            try {
                Thread.sleep(25);
                ta.join();
            }catch (InterruptedException e){
                System.out.println("Error");
            }
        }
    }
}
