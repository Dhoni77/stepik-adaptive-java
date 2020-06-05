import java.util.*;

//Write a program that uses regular expressions to check whether the input string is a phone number.
//        A phone number has the following form: 19*********19∗∗∗∗∗∗∗∗∗, where *∗ is any number from 0 to 9, otherwise it's not a phone number.
//
//        The program should print Yes or No.
//
//        Sample Input:
//
//        19123456789
//        Sample Output:
//
//        Yes

public class PhoneNumber {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String n = scanner.nextLine();
    System.out.println(n.matches("19\\d{9}")?"Yes":"No");
  }
}
