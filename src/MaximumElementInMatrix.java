import java.util.*;

//Find the indexes of the initial appearance of the maximum element in a matrix.
//
//        Input data format
//
//        On the input, the program receives the size of matrix n and m,
//        and then n lines having m integer numbers in each. n and m do not exceed 100.
//
//        Output data format
//
//        Output two numbers: the row number and the column number,
//        in which the greatest item in the two-dimensional array (matrix) is located.
//        If there are several such elements, output the one, which has the smaller row number;
//        and if row numbers are the same - the one having the smaller column number.
//
//        Sample Input:
//
//        3 4
//        0 3 2 4
//        2 3 5 5
//        5 1 2 3
//        Sample Output:
//
//        1 2

public class MaximumElementInMatrix {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String n = scanner.nextLine();
    int[][] array = new int[Integer.parseInt(n.trim().split(" ")[0])][Integer.parseInt(n.trim().split(" ")[1])];
    int max= Integer.MIN_VALUE;
    int x=0;
    int y=0;

    for (int i = 0; i < array.length; i++) {
      String line = scanner.nextLine();
      for (int j = 0; j < array[0].length; j++) {
        array[i][j] = Integer.parseInt(line.trim().split(" ")[j]);
        if (array[i][j]>max) {
          max = array[i][j];
          x = i;
          y = j;
        }
      }
    }

    System.out.println(x+" "+y);// put your code here
  }
}
