package shutdownhook;

public class ShutDownHook {
    public static void main(String[] args) {
        Thread A = new Thread(()->{
            System.out.println(Thread.currentThread().getName());
        });

        Runtime r = Runtime.getRuntime();
        r.addShutdownHook(A);
        r.addShutdownHook(new Thread(()-> System.out.println("Thread 2")));
        System.out.println("Statement after sleeping for 5 seconds");
        try {
            Thread.sleep(5000);
        }catch (InterruptedException ie){
            System.out.println("Interrupted Exception");
        }
    }
}
