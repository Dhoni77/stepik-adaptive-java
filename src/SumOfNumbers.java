import java.util.Scanner;

//Given the sequence of numbers, ending with number 0. Find the sum of all these numbers without using a loop.
//
//        Sample Input:
//
//        1
//        7
//        9
//        0
//        Sample Output:
//
//        17

public class SumOfNumbers {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int i=scanner.nextInt();
    int sum=i;
    while(i!=0) {
      i=scanner.nextInt();
      sum=sum+i;
    }
    System.out.println(sum);
  }
}
