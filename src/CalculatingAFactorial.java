import java.util.stream.LongStream;

//Many java developers wrote methods to calculate a factorial value using a recursive or iterative algorithm. It's time to do it with streams.
//
//        The factorial of n is calculated by the product of integer number from 1 to n (inclusive). The factorial of 0 is equal to 1.
//
//        Important. Use the given template for your factorial method. Pay attention to type of an argument and the returned value. Please, don't use cycles or recursion.
//
//        Sample Input 1:
//
//        0
//        Sample Output 1:
//
//        1
//        Sample Input 2:
//
//        1
//        Sample Output 2:
//
//        1
//        Sample Input 3:
//
//        2
//        Sample Output 3:
//
//        2

public class CalculatingAFactorial {
  public static long factorial(long n) {
    if (n==0) return 1;
    else
      return LongStream.range(1,n+1).reduce(1,(a, b)->a*b);
    // write your code here
  }
}
