import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

//Write a program to calculate the integer-valued logarithm to base 2 (binary logarithm).
//
//        Input – first line contains an integer TT, next go the TT lines with tests. Each tests consists of one positive integer a_i \lt 10^{9}a
//        i
//        ​
//<10
//        9
//        . For each a_ia
//        i
//        ​
//        you need to output on a separate line such largest number pp, that 2^p \le a_i2
//        p
//        ≤a
//        i
//        ​
//        . It is guaranteed that a_i \ge 1a
//        i
//        ​
//        ≥1. While solving this problem, you can define any functions you need any. Moreover, it is recommended to put the calculation of the logarithm into a separate function.
//
//        Sample Input:
//
//        5
//        4640
//        8246
//        45213
//        40075
//        58341
//        Sample Output:
//
//        12
//        13
//        15
//        15
//        15

public class BinaryLogarithm {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    IntStream.range(0, n)
            .map(i -> (int) (Math.log(scanner.nextInt()) / Math.log(2))).boxed().collect(Collectors.toList())
            .forEach(System.out::println); // put your code here
  }
}
