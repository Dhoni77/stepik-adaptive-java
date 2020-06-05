import java.util.*;
import java.util.stream.LongStream;


public class TheSmallestInteger {
  public static long factorial(long n) {
    if (n == 0) return 1;
    else
      return LongStream.range(1, n + 1)
              .reduce(1, (a, b) -> a * b);// write your code here
  }
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    long m = Long.parseLong(scanner.nextLine());
    for (long i = 0; i < m; i++) {
      if (factorial(i)>m){
        System.out.println(i);
        return;
      }
    }
  }
}
