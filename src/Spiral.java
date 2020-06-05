import java.util.*;

//Output the matrix of size n \times nn×n, filled by the integers from 11 to n^2n
//        2
//        in a spiral, coming from the top left corner and twisted clockwise, as shown in the example (here n=5n=5).
//
//        Sample Input:
//
//        5
//        Sample Output:
//
//        1 2 3 4 5
//        16 17 18 19 6
//        15 24 25 20 7
//        14 23 22 21 8
//        13 12 11 10 9

public class Spiral {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();

    int result = 0;
    int[][] array = new int[n][n];
    for (int i = 0, j=0; i < n; i++, j++,n--) {
      int a=i;
      int b=j;
      for (; j < n; ) {
        result++;
        if (j==n-1&i!=n-1) {
          array[i][j]=result;
          i++;
        }
        else if (i==n-1& j!=b) {
          array[i][j]=result;
          j--;
        }
        else if (j==b&i>a){
          array[i][j]=result;
          i--;
          if (i==a) j=n;
        }
        else {
          array[i][j] = result;
          j++;
        }
      }
      j=b;
    }

    for (int i=0;i<array.length;i++) {
      for (int j=0;j<array[0].length;j++){
        System.out.print(array[i][j]+" ");
      }
      System.out.println();
    }// put your code here
  }
}
