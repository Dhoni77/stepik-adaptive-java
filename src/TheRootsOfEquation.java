import java.util.*;

//The roots of equation
//
//        Given the numbers a, b, c, da,b,c,d. Output in ascending order all the integers between 0 and 1000, which are the roots of the equation ax^3+bx^2+cx+d=0ax
//        3
//        +bx
//        2
//        +cx+d=0.
//
//        If the specified interval does not contain the roots of the equation, do not output anything.
//
//        Sample Input 1:
//
//        -1
//        1
//        -1
//        1
//        Sample Output 1:
//
//        1
//        Sample Input 2:
//
//        0
//        1
//        -6
//        5
//        Sample Output 2:
//
//        1
//        5
//        Sample Input 3:
//
//        1
//        1
//        1
//        1

public class TheRootsOfEquation {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int a = scanner.nextInt();
    int b = scanner.nextInt();
    int c = scanner.nextInt();
    int d = scanner.nextInt();


    for (int x = 0; x<=1000; x++) {
      if((a*Math.pow(x, 3) + b*Math.pow(x, 2) + c*x + d)==0)
        System.out.println(x);
    }// put your code here
  }
}
