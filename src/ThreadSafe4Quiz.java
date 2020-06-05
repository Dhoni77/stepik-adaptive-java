import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
public class ThreadSafe4Quiz {
  public static class ThreadSafe4 {
    private List< String > recipe = new ArrayList<>();
    private final Lock lock = new ReentrantLock();
    public void add(final String ingredient) {
      lock.lock();

      try
      {
        recipe.add(ingredient);
      }
      finally
      {
        lock.
                unlock()
        ;
      }
    }
  }
}
