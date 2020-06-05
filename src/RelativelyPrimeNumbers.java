import java.util.Scanner;

//For each of the entered number N, find the number of integers from 1 to N, relatively prime (coprime) to N.
//
//        Sample Input:
//
//        748337821
//        Sample Output:
//
//        557766000

public class RelativelyPrimeNumbers {
  public static int phi (int n) {
    int result = n;
    for (int i=2; i*i<=n; ++i)
      if (n % i == 0) {
        while (n % i == 0)
          n /= i;
        result -= result / i;
      }
    if (n > 1)
      result -= result / n;
    return result;
  }
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();

    System.out.println(phi(n));// put your code here
  }
}
