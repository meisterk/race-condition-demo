public class Task implements Runnable {
    private int count;

    public Task() {
        count = 0;
    }

    @Override
    public void run() {
        //increment();
        synchronized (this) {
            count++; // Critical Code
            System.out.println(count);
        }
    }

//    private synchronized void increment() {
//        count++; // Critical Code
//        System.out.println(count);
//    }
}
