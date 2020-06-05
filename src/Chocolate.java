import java.util.Scanner;

//Chocolate
//
//        A chocolate bar has a shape of rectangle, divided into NxM segments. You can break down this chocolate bar into two parts by a single straight line (only once). Find whether you can break off exactly K segments from the chocolate. Each segment is 1x1.
//
//        Input data format
//
//        The program gets an input of three integers: N, M, K
//
//        Output data format
//
//        The program must output one of the two words: YES or NO.
//
//        Sample Input 1:
//
//        4
//        2
//        6
//        Sample Output 1:
//
//        YES
//        Sample Input 2:
//
//        2
//        10
//        7
//        Sample Output 2:
//
//        NO

public class Chocolate {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int m = scanner.nextInt();
    int k = scanner.nextInt();

    if(n*m>=k){
      if (k%n==0||k%m==0) System.out.println("YES");
      else System.out.println("NO");
    }
    else System.out.println("NO");// put your code here
  }
}
