import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

//Given single line with integers, separated by a space.
//
//        Output the elements from the even positions, each on a separate line, and the sum of the even elements.
//        The positions are numbered starting with 1.
//
//        Sample Input:
//
//        0 1 2 3 4 5 6 7 8 9 10 20 30
//        Sample Output:
//
//        1
//        3
//        5
//        7
//        9
//        20
//        80


public class ListUsage {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    List<Integer> list = Stream.of(scanner.nextLine()
            .trim()
            .split(" "))
            .mapToInt(Integer::parseInt)
            .boxed()
            .collect(Collectors.toList());

    IntStream.range(0, list.size())
            .filter(i -> i % 2 != 0)
            .mapToObj(list::get)
            .forEach(System.out::println);
    System.out.println(list.stream()
            .mapToInt(Integer::intValue)
            .filter(i -> i % 2 == 0)
            .sum());// put your code here
  }
}
