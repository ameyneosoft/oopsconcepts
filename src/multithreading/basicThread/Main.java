package multithreading.basicThread;

public class Main {
    public static void main(String[] args) {
        MultiThread mt = new MultiThread();
        Thread t1 = new Thread(mt);
        t1.start();
        Thread mainThread = Thread.currentThread();
        System.out.println("Main thread id =>" + mainThread.getId());
        System.out.println("T1 thread id =>" + t1.getId());
    }
}
