import java.util.Scanner;

public class TheMinimumNumberOfCoins {
  private static int result = -1;

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
//    int[][] rectangle = new int[scanner.nextInt()][scanner.nextInt()];
    int n = 3;
    int m = 4;
    int[][] rectangle = {
            {1, 1, 1, 1},
            {5, 2, 2, 100},
            {9, 4, 2, 1},};
//    for (int i = 0; i < rectangle.length; i++) {
//      for (int j = 0; j < rectangle[i].length; j++) {
//        rectangle[i][j] = scanner.nextInt();
//      }
//    }

    checkNextStep(rectangle, 0, 0, 0);
    System.out.println(result);
  }

  public static void checkNextStep(int[][] rectangle, int currentSum, int nextI, int nextJ){
    int newSum = currentSum + rectangle[nextI][nextJ];
    if (nextI == rectangle.length - 1 && nextJ == rectangle[0].length - 1) {
      if (result == -1 || result > newSum) {
        result = newSum;
      }
    } else {
      if (nextI < rectangle.length - 1) {
        checkNextStep(rectangle, newSum, nextI + 1, nextJ);
      }

      if (nextJ < rectangle[0].length - 1) {
        checkNextStep(rectangle, newSum, nextI, nextJ + 1);
      }
    }
  }
}
