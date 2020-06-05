import java.util.Scanner;

//Given real numbers a, b, c, where a ≠ 0.
//
//        Solve the quadratic equation ax2 + bx + c = 0 and output all of its roots.
//
//        If the equation has two roots, output these two roots in ascending order;
//        if one root - output a single number; if no roots – do not output anything.
//
//        Sample Input:
//
//        1
//        -1
//        -2
//        Sample Output:
//
//        -1 2

public class QuadraticEquation {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    double a=scanner.nextDouble();
    double b=scanner.nextDouble();
    double c=scanner.nextDouble();

    double D = Math.pow(b,2) - 4*a*c;

    if (D>0&a!=0) {
      double x1= (-b+Math.sqrt(D))/(2*a);
      double x2= (-b-Math.sqrt(D))/(2*a);
      System.out.println(x1<x2?x1+" "+x2:x2+" "+x1);
    }
    else if (D==0&a!=0) {
      double x=(-b+Math.sqrt(D))/(2*a);
      System.out.println(x);
    }
  }
}
