public class Main {
    public static void main(String[] args) {
        Task task = new Task();

        for (int i = 0; i < 10000; i++) {
            Thread thread = new Thread(task);
            thread.start();
        }

    }
}