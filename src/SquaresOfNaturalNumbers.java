import java.util.Scanner;
import java.util.stream.IntStream;

//Given integer N. Print all the squares of natural numbers, not exceeding N, in ascending order.
//
//        Sample Input:
//
//        50
//        Sample Output:
//
//        1
//        4
//        9
//        16
//        25
//        36
//        49

public class SquaresOfNaturalNumbers {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    IntStream.range(1,(int)Math.sqrt(n)+1).filter(x->Math.pow(x,2)<=n).map(x->(int)Math.pow(x,2)).forEach(System.out::println);
// put your code here
  }
}
