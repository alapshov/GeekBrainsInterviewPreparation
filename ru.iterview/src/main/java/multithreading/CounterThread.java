package multithreading;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class CounterThread extends Thread {

    private Counter counter;
    private Lock lock = new ReentrantLock();

    public CounterThread(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            try {
                if (lock.tryLock(10, TimeUnit.SECONDS)) {
                    counter.increaseCounter();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }
        }

    }
}
