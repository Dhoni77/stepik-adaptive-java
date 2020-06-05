import java.util.*;

//Given a rectangle array n×m in size. Rotate it by 90 degrees clockwise,
// by recording the result into the new array m×n in size.
//
//        Input data format
//
//        Input the two numbers n and m, not exceeding 100, and then an array n×m in size.
//
//        Output data format
//
//        Output the resulting array. Separate numbers by a single space in the output.
//
//        Sample Input:
//
//        3 4
//        11 12 13 14
//        21 22 23 24
//        31 32 33 34
//        Sample Output:
//
//        31 21 11
//        32 22 12
//        33 23 13
//        34 24 14

public class RotateARectangleArray {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String line = scanner.nextLine();
    int n = Integer.parseInt(line.split(" ")[0]);
    int m = Integer.parseInt(line.split(" ")[1]);
    int [][] array = new int[m][n];
    for (int j = n-1; j >=0; j--) {
      String temp = scanner.nextLine();
      for (int i = 0 ,a=0; i <m & a<m; i++, a++) {
        array[i][j]=Integer.parseInt(temp.trim().split(" ")[a]);
      }
    }
    for (int i = 0; i <array.length; i++) {
      for (int j = 0; j <array[0].length; j++) {
        System.out.print(array[i][j]+" ");
      }
      System.out.println(" ");
    }// put your code here
  }
}
