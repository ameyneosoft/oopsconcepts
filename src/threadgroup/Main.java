package threadgroup;

public class Main {
    public static void main(String[] args) throws InterruptedException{
        NamePrinter np1 = new NamePrinter();
        NamePrinterTwo np2 = new NamePrinterTwo();
        ThreadGroup tg = new ThreadGroup("Thread Group 1");
        Thread t1 = new Thread(tg, np1, "My thread 1");
        Thread t2 = new Thread(tg, np2,"My Thread 2");
        t1.start();
        t2.start();
        System.out.println("Active thread "+tg.activeCount());
        t1.join();
        tg.interrupt();
        System.out.println("Active thread "+tg.activeCount());


    }
}
