package threadgroup;

public class NamePrinterTwo extends Thread{
    @Override
    public void run() {
        try {

        Thread.sleep(5000);
        System.out.println(Thread.currentThread().getName());
        }catch (InterruptedException ie){
            System.out.println("Interrupted Exception occur");
        }
    }
}
