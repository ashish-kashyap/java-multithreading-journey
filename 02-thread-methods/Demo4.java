public class Demo4 {
    public static void main(String[] args) throws InterruptedException{
        Thread t1 = new Thread(() -> {
            // while(true) {
            //     System.out.println("Running");
            // }
            while(!Thread.currentThread().interrupted()) {
                System.out.println("Running");
            }
        });

        t1.start();

        Thread.sleep(2000);

        t1.interrupt();
    }
}

/*
    Thread --> interrupt flag (by default false)

    t1.interrupt() --> sends a signal to t1 thread that it should stop doing what it is doing

    We can gracefully handle
    --> You can make a thread run until a condition
    --> Cancelling a long running task
    --> use to stop Thread Pool

    isInterrupted() --> return interrupt flag value (T/F)
    interrupted() --> return interrupt flag value (T/F) but also set it back to false

    --> sleep(), join(), wait() : TIMED_WAITING, WAITING --> can't call interrupt() method
                                  otherwise we'll get Interrupted exception

*/
