import java.util.*;

//Given the number n, not exceeding 10, and a matrix of size n × n. Check whether this matrix is symmetric in relation to the main diagonal. Output the word “YES”, if it is symmetric and the word “NO” otherwise.
//
//        Sample Input:
//
//        3
//        0 1 2
//        1 2 3
//        2 3 4
//        Sample Output:
//
//        YES

public class SymmetricMatrix {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = Integer.parseInt(scanner.nextLine());
    boolean is=true;
    int[][]array=new int[n][n];
    for (int i = 0; i < n; i++) {
      String m = scanner.nextLine();
      for (int j = 0; j < n; j++) {
        array[i][j] =Integer.parseInt(m.trim().split(" ")[j]);
      }
    }
    for (int i = 0,j = 0; i < n; i++) {
      for (; j < n; j++) {
        if (array[i][j]!=array[j][i]) is=false;
      }
      j=i;
    }
    System.out.println(is?"YES":"NO");// put your code here
  }
}
