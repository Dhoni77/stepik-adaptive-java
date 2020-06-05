import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//Given an array of strings,
//
//        On wordCount() : return a
//        SortedMap<String, Integer> with a key for each different string, with the value the number of times that string appears in the array.
//
//        On printMap(): Using System.out.println() print all items of the Map ("key : value")
//        Sample Input:
//
//        a b b c d a b
//        Sample Output:
//
//        a : 2
//        b : 3
//        c : 1
//        d : 1

public class MapBasicMethods {
  public static SortedMap<String, Integer> wordCount(String[] strings) {

    return new TreeMap<String, Integer>(Stream.of(strings)
            .collect(Collectors.groupingBy(Object::toString, Collectors.reducing(0, e -> 1, Integer::sum))));
  }

  public static void printMap(Map<String, Integer> map) {
    map.forEach((k, v) -> System.out.println(k + " : " + v));
  }
}
