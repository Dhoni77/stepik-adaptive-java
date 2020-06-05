import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//Write a program that takes a list of integers as input, and outputs the values that are repeated in it more than once.
//
//        You may need the list method sort to solve this problem.
//List
//        Input format:
//        One line with integers, separated by a space.
//
//        Output format:
//        A line with integers, separated by a space. The numbers must not be repeated, the output order can be arbitrary.
//
//        Sample Input:
//
//        4 8 0 3 4 2 0 3
//        Sample Output:
//
//        0 3 4

public class RepeatedValues {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    List<Integer> list = Stream.of(scanner.nextLine().trim().split(" ")).mapToInt(Integer::parseInt).sorted().boxed().collect(Collectors.toList());

    List<Integer> list1 = list.stream()
            .filter(s -> list.stream()
                    .mapToInt(Integer::intValue)
                    .filter(i -> i == s)
                    .count() > 1).distinct().collect(Collectors.toList());
    list1.forEach(x->System.out.print(x+" "));// put your code here
  }
}
