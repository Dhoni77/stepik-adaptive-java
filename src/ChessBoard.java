import java.util.*;

//You are given coordinates of two queens on a chess board. Find out, whether they hit each other or not.
//
//        INPUT
//        Four integer numbers x_1, y_1, x_2, y_2x
//        1
//        ​
//        ,y
//        1
//        ​
//        ,x
//        2
//        ​
//        ,y
//        2
//        ​
//        are being typed.
//
//        OUTPUT
//        Type "YES" (uppercase) if they hit each other or "NO" if the don't.
//
//        You may need the function, that calculates the absolute magnitude of the number, here it is:
//        a = abs(a) # writes |a| into 'a' variable
//        Sample Input 1:
//
//        1 1 3 3
//        Sample Output 1:
//
//        YES
//        Sample Input 2:
//
//        1 1 4 3
//        Sample Output 2:
//
//        NO
//        Sample Input 3:
//
//        2 2 5 2
//        Sample Output 3:
//
//        YES

public class ChessBoard {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String line = scanner.nextLine();

    int x1=Integer.parseInt(line.trim().split(" ")[0]);
    int y1=Integer.parseInt(line.trim().split(" ")[1]);
    int x2=Integer.parseInt(line.trim().split(" ")[2]);
    int y2=Integer.parseInt(line.trim().split(" ")[3]);

    if (x1==x2||y1==y2||(Math.abs(x1-x2)==Math.abs(y1-y2))) {
      System.out.println("YES");
    }
    else
      System.out.println("NO");// put your code here
  }
}
