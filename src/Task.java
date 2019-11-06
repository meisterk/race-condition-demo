import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Task implements Runnable {
    private int count;
    private Lock lock;

    public Task() {
        count = 0;
        lock = new ReentrantLock();
    }

    @Override
    public void run() {
        version3();
        System.out.println(count);
    }

    private void version0() {
        count++;
    }

    private void version1() {
        increment();
    }

    private synchronized void increment() {
        count++; // Critical Code
    }

    private void version2() {
        synchronized (this) {
            count++;
        }
    }

    private void version3() {
        // Code sperren
        lock.lock();
        count++;
        // Code freigeben
        lock.unlock();
    }

}
