import java.util.*;

//The number of tens
//
//        Given a non-negative integer N (0 ≤ N ≤ 1000000), find the number of tens in it (i.e. next to last digit of the number). If there is no next to last digit, you can consider that the number of tens equals to zero.
//
//        Sample Input:
//
//        173
//        Sample Output:
//
//        7

public class TheNumberOfTens {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    System.out.println(String.valueOf(n/10).split("")[String.valueOf(n/10).length()-1]);// put your code here
  }
}
