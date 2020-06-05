import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class MakeTheFollowingCodeThreadSafe6 {
  public static class ThreadSafe6 {
    private final Map< String, String > data = new
            ConcurrentHashMap
                    < >();
    public void putIfAbsent(final String key, final String value) {
      data.putIfAbsent(key, value);
    }
  }
}
