public class Demo5 {
    public static void main(String[] args) {
        
        Thread t1 = new Thread(() -> Counter1.increment());
        Thread t2 = new Thread(() -> Counter1.increment());

        t1.start();
        t2.start();
    }
}

// Static synchronization

class Counter1 {
    static int count = 0;

    synchronized static void increment() {
        try {
            Thread.sleep(2000);
        }
        catch(Exception e) {}

        count++;
        System.out.println(count);
    }
}
