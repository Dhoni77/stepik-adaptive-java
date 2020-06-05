import java.util.Scanner;

//Given a two-dimensional array (matrix) and the two numbers: i and j.
// Swap the columns with indices i and j within the matrix.
//
//Input contains matrix dimensions n and m, not exceeding 100, then the elements of the matrix,
// then the indices i and j.
//
//        Sample Input 1:
//
//        3 4
//        11 12 13 14
//        21 22 23 24
//        31 32 33 34
//        0 1
//        Sample Output 1:
//
//        12 11 13 14
//        22 21 23 24
//        32 31 33 34
//        Sample Input 2:
//
//        10 1
//        1
//        2
//        3
//        4
//        5
//        6
//        7
//        8
//        9
//        10
//        0 0
//        Sample Output 2:
//
//        1
//        2
//        3
//        4
//        5
//        6
//        7
//        8
//        9
//        10

public class SwapTheColumns {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int m = scanner.nextInt();

    int[][] array=new int[n][m];

    for (int i=0; i<n; i++){
      for (int j=0; j<m; j++){
        array[i][j]=scanner.nextInt();
      }
    }

    int i = scanner.nextInt();
    int j = scanner.nextInt();

    for (int a=0; a<n; a++){
      int x=array[a][i];
      array[a][i]=array[a][j];
      array[a][j]=x;
    }// put your code here
    for(int a=0;a<n;a++){
      for(int b=0;b<m;b++){
        System.out.print(array[a][b]+" ");
      }
      System.out.println();
    }
  }
}
