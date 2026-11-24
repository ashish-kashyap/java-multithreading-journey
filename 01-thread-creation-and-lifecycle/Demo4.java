public class Demo4 {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            System.out.println("Current thread is " + Thread.currentThread().getName());
        });

        t1.start();
        t1.run(); // when we do not do t1.start() it won't create a new thread and it will consider it to be main thread
    }
}

// can we start same thread twice? -> No