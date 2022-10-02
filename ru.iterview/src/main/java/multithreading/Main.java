package multithreading;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        //PingPong
        final PingPong pingPong = new PingPong();

        new Thread(new Runnable() {
            public void run() {
                pingPong.writePing();
            }
        }).start();

        new Thread(new Runnable() {
            public void run() {
                pingPong.writePong();
            }
        }).start();

        //Counter
        Counter counter = new Counter();
        for(int i=0; i<200; i++) {
            CounterThread ct = new CounterThread(counter);
            ct.start();
        }
        Thread.sleep(1000);
        System.out.println("Counter:" + counter.getCounter());
    }
}
