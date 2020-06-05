import java.util.*;

//Given a string. Find whether it is a palindrome, i.e. it reads the same both left-to-right and right-to-left. Output “yes” if the string is a palindrome and “no” otherwise.
//
//        Sample Input:
//
//        kayak
//        Sample Output:
//
//        yes

public class Palindrome {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    String s = scanner.nextLine();

    System.out.println(s.contentEquals(new StringBuilder(s).reverse())?"yes":"no");// put your code here
  }
}
