import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//Input, separated by spaces: the number of rows of the matrix, the number of columns of the matrix, then go the elements of the two-dimensional matrix itself, row by row.
//
//        Output: the result of the transposition of the matrix (row by row).
//
//        Sample Input:
//
//        2 3 1 2 3 4 5 6
//        Sample Output:
//
//        1 4 2 5 3 6

public class TranspositionOfTheMatrix {

  public static void main(String[] args) {
//        int v = Arrays.asList(1,2,3,4,5).parallelStream().reduce(Math::max).get();
    Scanner scanner = new Scanner(System.in);
    List<Integer> list = Stream.of(scanner.nextLine().trim().split(" ")).mapToInt(Integer::parseInt).boxed().collect(Collectors.toList());
    int[][] array = new int[list.get(0)][list.get(1)];
    for (int i = 0,k=2; i < array.length; i++) {
      for (int j = 0; j < array[0].length; j++,k++) {
        array[i][j] = list.get(k);
      }
    }
    for (int i = 0; i < array[0].length; i++) {
      for (int j = 0; j < array.length; j++) {
        System.out.print(array[j][i]+" ");
      }
    }
  }


}
