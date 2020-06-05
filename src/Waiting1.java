import java.util.concurrent.TimeUnit;
public class Waiting1 {
  public static void main(final String[] args) throws Exception {
    final Thread thread = new Thread(() -> {
      try {
        TimeUnit.SECONDS.sleep(5);
      } catch (final InterruptedException ex) {
        // reset the interruption status
        Thread.currentThread().interrupt();
      }
      System.out.println("Exiting");
    });
    thread.start();
    // it is recommended, whenever is appropriate and possible, to use timed out version of the available JDK API around concurrency
    thread.
            join
                    (TimeUnit.SECONDS.toMillis(10));
    System.out.println("Done");
  }
}
