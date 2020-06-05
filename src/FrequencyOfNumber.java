import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.function.Function;

//Given the natural number  and the array of integers . Output 1, if the array contains the number occurring strictly more than n/2 times,
// and output 0 otherwise.
//        Sample Input:
//        5
//        2 3 9 2 2
//        Sample Output:
//        1

public class FrequencyOfNumber {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = Integer.parseInt(scanner.nextLine());
    System.out.println(Stream.of(scanner.nextLine()
            .trim()
            .split(" "))
            .mapToInt(Integer::parseInt)
            .boxed()
            .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
            .entrySet()
            .stream()
            .max(Comparator.comparing(Map.Entry::getValue)).get().getValue()>n/2?"1":"0");
  }
}
