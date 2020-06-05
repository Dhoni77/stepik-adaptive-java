import java.util.Scanner;

//Given positive integer N.
// Find the number of positive integers less than N such that their sum of digits (in decimal notation)
// is equal to the sum of digits in the number N. Output the number of such integers.
//
//        Sample Input:
//
//        123
//        Sample Output:
//
//        9

public class FindNumber {
  public static int getSum(int n)
  {
    int sum = 0;

    while (n != 0)
    {
      sum = sum + n % 10;
      n = n/10;
    }

    return sum;
  }
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();

    int count=0;
    int sum=0;

    for (int i=n-1;i>0;i--) {
      if (getSum(n)==getSum(i)) count++;
    }

    System.out.println(count);// put your code here
  }
}
