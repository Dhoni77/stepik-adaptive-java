import java.util.*;

//Write a program that reads a three digit number, calculates the new number by reversing its digits,
// and outputs a new number.
//
//        Sample Input:
//
//        682
//        Sample Output:
//
//        286

public class Reversing {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int n=scanner.nextInt();

    System.out.println(Integer.parseInt(new StringBuilder(String.valueOf(n)).reverse().toString()));
    // put your code here
  }
}
