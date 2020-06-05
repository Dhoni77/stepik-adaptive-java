import java.util.*;

//Output the prime factorization of the natural number n > 1.
// Prime multipliers should be listed in ascending order and separated by spaces.
//
//        Sample Input:
//
//        75
//        Sample Output:
//
//        3 5 5

public class PrimeFactorization {
  public static void primeFactors(int n)
  {
    // Print the number of 2s that divide n
    while (n%2==0)
    {
      System.out.print(2 + " ");
      n /= 2;
    }

    // n must be odd at this point.  So we can
    // skip one element (Note i = i +2)
    for (int i = 3; i <= Math.sqrt(n); i+= 2)
    {
      // While i divides n, print i and divide n
      while (n%i == 0)
      {
        System.out.print(i + " ");
        n /= i;
      }
    }

    // This condition is to handle the case whien
    // n is a prime number greater than 2
    if (n > 2)
      System.out.print(n);
  }
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    primeFactors(n);
  }
}
