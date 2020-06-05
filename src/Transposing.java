import java.util.*;

//Write a program that takes a matrix as input, performs its transposing and outputs the result.
//
//        Input format:
//        In the first line – two integers nn and mm – the number of rows and columns, respectively.
//        Next go nn lines, with mm integers each, separated by a space.
//
//        Output format:
//        The program should output mm lines of the content of transposed matrix. Elements of the matrix should be separated by a space.
//
//        Sample Input 1:
//
//        2 3
//        1 2 3
//        4 5 6
//        Sample Output 1:
//
//        1 4
//        2 5
//        3 6
//        Sample Input 2:
//
//        2 2
//        1 2
//        3 4
//        Sample Output 2:
//
//        1 3
//        2 4

public class Transposing {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String n =scanner.nextLine();
    int[][] array = new int[Integer.parseInt(n.trim().split(" ")[1])][Integer.parseInt(n.trim().split(" ")[0])];

    for (int i = 0; i < array[0].length; i++) {
      String line = scanner.nextLine().trim();
      for(int j = 0; j < array.length; j++) {
        array[j][i] = Integer.parseInt(line.split(" ")[j]);
      }
    }

    for(int i = 0; i <array.length; i++) {
      for (int j = 0; j < array[0].length; j++) {
        System.out.print(array[i][j]+" ");
      }
      System.out.println();
    }// put your code here
  }
}
