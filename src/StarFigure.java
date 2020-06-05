import java.util.*;

//Given an odd number n, not exceeding 15. Create a two-dimensional array (matrix) from n×n elements, by filling it with "." symbols (each element of the matrix is a string containing a single symbol). Then fill the middle row of the matrix, the middle column, and the main and the secondary diagonals with the "*" symbols. As a result, all "*"s in the array must form the star figure. Output this matrix; elements of the array should be space separated.
//
//        Sample Input:
//
//        5
//        Sample Output:
//
//        * . * . *
//        . * * * .
//        * * * * *
//        . * * * .
//        * . * . *

public class StarFigure {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = Integer.parseInt(scanner.nextLine());
    for(int i = 0; i<n; i++) {
      for(int j = 0; j<n;j++) {
        if ((i==j)||i==n/2||j==n/2||i+j==n-1) {
          System.out.print('*');
          System.out.print(' ');
        }
        else {
          System.out.print('.');
          System.out.print(' ');
        }
      }
      System.out.println();
    }  // put your code here
  }
}
