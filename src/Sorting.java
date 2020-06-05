//Given an array of integers. You should sort it (in a non-decreasing order), and then for each element display its index in the initial array (starting from 1).
//
//        For example, let's have an array 50 98 17 79 that should be sorted to 17 50 79 98. And now:
//
//        17 was a 3-rd element of the initial array
//        50 was a 1-st element
//        79 was a 4-th element
//        98 was a 2-nd element
//        Therefore the result will be 3 1 4 2.
//
//        Input contains the size of the array in the first line, and in the second line – the elements of the array (integers, space separated).
//
//        Output should contain the list of sorted elements' indices in the initial array; space separated.
//
//        Sample Input:
//
//        4
//        50 98 17 79
//        Sample Output:
//
//        3 1 4 2

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Sorting {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = Integer.parseInt(scanner.nextLine());
    if (n>0) {
      List<Integer> list = Stream.of(scanner.nextLine()
              .trim()
              .split(" "))
              .mapToInt(Integer::parseInt)
              .boxed()
              .collect(Collectors.toList());
      List<Integer> list2 = list.stream()
              .sorted()
              .collect(Collectors.toList());

      list2.stream()
              .map(s -> list.indexOf(s) + 1 + " ")
              .forEach(System.out::print);
    }
  }
}
