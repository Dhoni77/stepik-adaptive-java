import java.math.BigInteger;

//Implement a function to compute the double factorial, that is the product of natural numbers with the same parity and not exceeding a given number.
//
//        For example:
//        7!!=7⋅5⋅3⋅1
//        8!!=8⋅6⋅4⋅2
//
//        The function argument can be any non-negative integer.
//
//        Sample Input:
//
//        7
//        Sample Output:
//
//        105

public class DoubleFactorial {
  public static BigInteger calcDoubleFactorial(int n) {
    if (n==0) return BigInteger.ONE;
    if (n%2==0) {
      if (n==2) return BigInteger.valueOf(2);
    }
    if (n%2!=0) {
      if (n == 1) return BigInteger.valueOf(1);
    }
    return BigInteger.valueOf(n).multiply(calcDoubleFactorial(n - 2));
    // type your java code here
  }
}
