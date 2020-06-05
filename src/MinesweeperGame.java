import java.util.*;

//A field for the minesweeper game is a grid n \times mn×m in size.The cell of the grid may or may not contain a mine.
//
//        Write a program that outputs"solved"field,i.e.,for each cell,which is not a mine,it indicates the number of mines
//        in the neighbouring cells(including diagonal directions)
//
//        Input format:
//        The first line contains two natural numbers 1 \le n,m \le 1001≤n,m≤100,after which the nn lines contain
//        a description of the field in the form of a sequence of dots'.' and asterisks'*',where the dot denotes an empty cell,
//        and the asterisk – the cell with a mine.
//
//        Output format:
//        nn lines of the field,each cell of which will contain either a number from 0to 8,or a mine(marked by"*"),
//        wherein any number means the number of mines in the neighbouring cells.


public class MinesweeperGame {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String line = scanner.nextLine();
    int n = Integer.valueOf(line.trim()
            .split(" ")[0]);
    int m = Integer.valueOf(line.trim()
            .split(" ")[1]);
    char[][] array = new char[n][m];
    for (int i = 0; i < n; i++) {
      line = scanner.nextLine();
      for (int j = 0; j < m; j++) {
        array[i][j] = line.toCharArray()[j];
      }
    }
    int minesCount = 0;
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        if (array[i][j] == '.') {
          //right
          if (j < m - 1) {
            if (array[i][j + 1] == '*') minesCount++;
          }
          //rightdown
          if (j < m - 1 && i < n - 1) {
            if (array[i + 1][j + 1] == '*') minesCount++;
          }
          //down
          if (i < n - 1) {
            if (array[i + 1][j] == '*') minesCount++;
          }
          //downleft
          if (j > 0 && i < n - 1) {
            if (array[i + 1][j - 1] == '*') minesCount++;
          }
          //left
          if (j > 0) {
            if (array[i][j - 1] == '*') minesCount++;
          }
          //upLeft
          if (j > 0 && i > 0) {
            if (array[i - 1][j - 1] == '*') minesCount++;
          }
          //up
          if (i > 0) {
            if (array[i - 1][j] == '*') minesCount++;
          }
          //upRihgt
          if (i > 0 && j < m - 1) {
            if (array[i - 1][j + 1] == '*') minesCount++;
          }
          System.out.print(minesCount);
          minesCount = 0;
        } else {
          System.out.print(array[i][j]);
        }
      }
      System.out.println();
    }
  }
}
