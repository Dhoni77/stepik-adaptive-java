import java.util.Scanner;

//Snail
//
//        Snail creeps up the vertical pole of height H feets. Per day it goes A feets up,
//        and per night it goes B feets down. In which day the snail will reach the top of the pole?
//
//        Input data format
//
//        On the input the program receives non-negative integers H, A, B, where H > B and A > B.
//        Every integer does not exceed 100.
//
//        Sample Input 1:
//
//        10
//        3
//        2
//        Sample Output 1:
//
//        8
//        Sample Input 2:
//
//        20
//        7
//        3
//        Sample Output 2:
//
//        5

public class Snail {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int H = scanner.nextInt();
    int A = scanner.nextInt();
    int B = scanner.nextInt();

    int pos=0;
    for (int i=1; ; i++) {
      pos = pos+A;
      if (pos >= H) {
        System.out.println(i);
        break;
      }
      pos = pos - B;
    }
    // put your code here
  }
}
