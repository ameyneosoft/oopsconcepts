package threadgroup;

public class NamePrinter extends Thread{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}
