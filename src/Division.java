import java.util.*;

//You are given an integer number of indefinite length. Check, whether this number divides by 3 or not, without using the remainder (%) operation.
//
//        Print "YES" if the number divides by 3 and "NO" if it doesn't.
//
//        Note: What happens, when you divide, say, 17 by 3? And then back.
//
//        Sample Input 1:
//
//        48
//        Sample Output 1:
//
//        YES
//        Sample Input 2:
//
//        14
//        Sample Output 2:
//
//        NO
//        Sample Input 3:
//
//        39
//        Sample Output 3:
//
//        YES

public class Division {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = Integer.parseInt(scanner.nextLine());
    if (n==(n/3)*3) System.out.println("YES");
    else System.out.println("NO");
// put your code here
  }
}
