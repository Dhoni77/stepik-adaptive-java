import java.util.*;

//MKAD
//
//        The length of the Moscow Ring Road (MKAD) is 109 kilometers. Biker Vasya starts from the zero kilometer of MKAD and drives with a speed of V kilometers per hour. On which mark will he stop after T hours?
//
//        Input data format
//
//        The program gets integers V and T as input. If V > 0, then Vasya moves in a positive direction along MKAD, if the value of V < 0 – in the negative direction. 0 ≤ T ≤ 1000, -1000 ≤ V ≤ 1000.
//
//        Output data format
//
//        The program should output an integer from 0 to 108 - the mark on which Vasya stops.
//
//        Sample Input 1:
//
//        60
//        2
//        Sample Output 1:
//
//        11
//        Sample Input 2:
//
//        -1
//        1
//        Sample Output 2:
//
//        108

public class MKAD {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int m = scanner.nextInt();
    int round = 109;
    if (n>0) {
      if (n*m>round&&n*m%round!=0)
        System.out.println(n*m%round);
      else if(n*m<round&&n*m%round!=0)
        System.out.println(n*m);
      else
        System.out.println(0);
    }
    else if (n<0) {
      if (Math.abs(n) * m > round&&n*m%round!=0)
        System.out.println(round + (n * m % round));
      else if (Math.abs(n) * m < round&&n*m%round!=0)
        System.out.println(round + (n * m));
      else
        System.out.println(0);
    }
    else
      System.out.println(0);
  }
}
