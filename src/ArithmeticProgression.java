import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//Given a sequence of natural numbers from the range [1, 2147483647].
//
//        Find whether you can represent these numbers as arithmetic progression. You can change the order of numbers in the sequence, if necessary.
//
//        You should write a program to solve this problem.
//
//        Input data
//
//        Input line contains a sequence of natural numbers. The length of the sequence can be from 1 to 100 000. The numbers are separated by spaces.
//
//        Output data
//
//        The output should contain either «Yes» in the case of positive reply or «No» otherwise.
//
//        Sample Input:
//
//        10 30 40 20
//        Sample Output:
//
//        Yes

public class ArithmeticProgression {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    List<Integer> list = Stream.of(scanner.nextLine()
            .trim()
            .split(" "))
            .mapToInt(Integer::parseInt)
            .sorted()
            .boxed()
            .collect(Collectors.toList());
    if (list.size()>1) {
      boolean isSubSeq = true;
      int dif = list.get(0)-list.get(1);
      for (int i = 0; i < list.size()-1; i++) {
        if (list.get(i)-list.get(i+1)!=dif) isSubSeq=false;
      }
      System.out.println(isSubSeq?"Yes":"No");
    }
    else
      System.out.println("Yes");
  }
}
