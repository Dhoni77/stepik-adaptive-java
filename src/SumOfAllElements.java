import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//Find the sum of all elements of the sequence, ending with the number 0.
//
//        The number 0 itself is not included into the sequence and serves as a sign of cessation.
//
//        Sample Input:
//
//        3
//        6
//        8
//        0
//        Sample Output:
//
//        17

public class SumOfAllElements {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    List<Integer> list = new ArrayList<>();
    int a;
    while((a=scanner.nextInt())!=0) {
      list.add(a);
    }
    System.out.println(list.stream().mapToInt(Integer::intValue).sum());// put your code here
  }
}
