import java.util.*;

//Finite simple continued fraction (wiki) is the following fraction:
//
//        a_0 + \dfrac1{a_1 + \dfrac1{a_2 + \dfrac1{\ddots + \dfrac1{a_n}}}}a
//        0
//        ​
//        +
//        a
//        1
//        ​
//        +
//        a
//        2
//        ​
//        +
//        ⋱+
//        a
//        n
//        ​
//
//        1
//        ​
//
//        1
//        ​
//
//        1
//        ​
//
//        1
//        ​
//
//
//        It is known that any ordinary (standard) fraction can be written as a finite simple continued fraction.
//
//        Write a program, which will transform the ordinary fraction into a list of coefficients a_0, a_1, \ldots, a_na
//        0
//        ​
//        ,a
//        1
//        ​
//        ,…,a
//        n
//        ​
//        .
//
//        For example, fraction 239/30239/30 corresponds to a continued fraction
//
//        7 + \dfrac1{1 + \dfrac1{29}}7+
//        1+
//        29
//        1
//        ​
//
//        1
//        ​
//
//
//        accordingly, the coefficients will be equal to 7, 1 и 29.
//
//        Input format:
//        A single line with an fraction in the numerator/denominator format.
//
//        Output format:
//        A line with a list of coefficients, separated by a space.
//
//        Sample Input:
//
//        239/30
//        Sample Output:
//
//        7 1 29

public class FiniteSimpleContinuedFraction {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String line = scanner.nextLine();
    int n = Integer.parseInt(line.trim().split("\\/")[0]);
    int m = Integer.parseInt(line.trim().split("\\/")[1]);

    while(m!=0){
      System.out.print(n/m+" ");
      int temp=n;
      n=m;
      m=temp%m;
    }
  }
}
