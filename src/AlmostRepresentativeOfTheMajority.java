import java.util.Comparator;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//Almost representative of the majority
//
//        Given the natural integer and the sequence of integers .
//        Output 1, is the sequence contains an integer, occurring strictly more than n/3 times, and 0 otherwise.
////        Sample Input:
//        5
//        2 3 9 1 2
//        Sample Output:
//        1

public class AlmostRepresentativeOfTheMajority {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = Integer.parseInt(scanner.nextLine());
    System.out.println(Stream.of(scanner.nextLine()
            .trim()
            .split(" "))
            .map(Integer::parseInt)
            .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
            .entrySet()
            .stream()
            .max(Comparator.comparing(Map.Entry::getValue))
            .get().getValue()>n/3?"1":"0");
  }
}
