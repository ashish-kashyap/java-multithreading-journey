public class Demo3 {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            for(int i=1; i<=10; i++) {
                System.out.println("T1 : " + i);
                Thread.yield(); // can't be used in production. can only be used in testing
            }
        });

        Thread t2 = new Thread(() -> {
            for(int i=1; i<=10; i++) {
                System.out.println("T2 : " + i);;
            }
        });

        t1.start();
        t2.start();
    }
}

/*
    Thread.yield() --> I am willing to give my CPU time to someone else with same priority and that wants to run

    1. OS can reject this because JAVA does not decide which thread to run when. It's upto OS and CPU
    2. It is just like a suggestion to OS.
    3. Current thread does not go to WAITING, TIMED_WAITING, BLOCKED state.
       It does go to RUNNABLE state.
*/
