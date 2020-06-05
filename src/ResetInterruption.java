import java.util.concurrent.TimeUnit;

public class ResetInterruption {
    public static void main(final String[] args) throws Exception {
        final Thread thread = new Thread((Runnable) new ResetInterruption());
        thread.start();
        thread.join();
        System.out.printf("Interrupted %b%n", thread.isInterrupted());
    }

    public void run() {
        try {
            // The interrupted status of the current thread is cleared when InterruptedException is thrown by sleep() method.
            TimeUnit.SECONDS.sleep(10);
        } catch (final InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }
}
