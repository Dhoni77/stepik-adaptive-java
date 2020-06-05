import java.util.*;

//Given the number n, not greater than 100. Create the matrix of size n×n and fill it by the following rule. Numbers 0 should be stored on the primary diagonal. The two diagonals, adjacent to the primary one, should contain numbers 1. The next two diagonals - numbers 2, etc.
//
//        Sample Input:
//
//        5
//        Sample Output:
//
//        0 1 2 3 4
//        1 0 1 2 3
//        2 1 0 1 2
//        3 2 1 0 1
//        4 3 2 1 0

public class Matrix2 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();

    int[][]array= new int[n][n];
    for (int i=0, j =0; i<n; i++) {
      int a=i;
      int b=j;
      for (;j < n;){
        if (i==j)  {
          array[i][j]=a;
          i++;
          j++;
          if (i==n-1&j==n-1) {
            i=a;
            j=n;
          }
        }
        else {
          array[i][j]=a;
          array[j][i]=a;
          i++;
          j++;
          if (i==n) {
            i=a;
            j=n;
          }
        }

      }
      j=b;
    }
    for (int i=0; i<n; i++) {
      for (int j=0; j<n; j++){
        System.out.print(array[i][j]+" ");
      }
      System.out.println();
    } // put your code here
  }

}
