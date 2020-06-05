import java.util.Arrays;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CountingValuesSortedMapUsage {

  public static SortedMap<String, Integer> wordCount(String[] strings) {

    return new TreeMap<String, Integer>(Stream.of(strings)
            .collect(Collectors.groupingBy(Object::toString, Collectors.reducing(0, e -> 1, Integer::sum))));
  }

  public static SortedMap<String, Integer> wordCount2(String[] strings) {
    SortedMap<String, Integer> map = new TreeMap<>();
    for (String s : strings){
      map.merge(s, 1, Integer::sum);
    }
    return map;
  }

  public static SortedMap<String, Integer> wordCount3(String[] strings) {
    return new TreeMap<>(Arrays.stream(strings).collect(Collectors.toMap(k -> k, v -> 1, Integer::sum)));
  }

  public static SortedMap<String, Integer> wordCount4(String[] strings) {
    return java.util.stream.Stream.of(strings).collect(Collectors.groupingBy(java.util.function.Function.identity(),
            TreeMap::new,
            Collectors.collectingAndThen(Collectors.counting(), Long::intValue)));
  }

  public static void printMap(Map<String, Integer> map) {
    map.forEach((k, v) -> System.out.println(k + " : " + v));
  }


}
