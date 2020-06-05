import java.util.Scanner;

//Symmetrical number
//
//        Given a four-digit number. Determine whether its decimal notation is symmetric. If the number is symmetrical, output 1, otherwise output any other integer. The number may have less than four digits, then you should assume that its decimal notation is complemented by insignificant zeros on the left.
//
//        Sample Input 1:
//
//        2002
//        Sample Output 1:
//
//        1
//        Sample Input 2:
//
//        2008
//        Sample Output 2:
//
//        37

public class SymmetricalNumber {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String n = String.valueOf(scanner.nextInt());
    if (n.toCharArray().length<4) {
      while (n.toCharArray().length<4) {
        n="0".concat(n);
      }
    }

    if (n.toCharArray()[0]==n.toCharArray()[3]&&n.toCharArray()[1]==n.toCharArray()[2]) System.out.println(1);
    else System.out.println(37);
  }
}
