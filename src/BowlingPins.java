import java.util.*;
import java.util.stream.IntStream;

//N bowling pins were put in one row and numbered from left to right with numbers from 1 to N. Then K balls were thrown at this row; i-th ball knocked down all pins with numbers from li to ri  inclusive. Find which pins remained standing.
//
//
//        Input data format
//
//        On input the program gets the number of pins N and the number of throws K. Next go K pairs of numbers li, ri, with 1 ≤ li, ri ≤ N.
//
//        Output data format
//
//        The program should output the sequence of N characters, where j-th symbol is “I”, if j-th pin remained standing, or “.”, if j-th pin was knocked down.
//
//        Sample Input:
//
//        10 3
//        8 10
//        2 5
//        3 6
//        Sample Output:
//
//        I.....I...

public class BowlingPins {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String line = scanner.nextLine();
    int n = Integer.parseInt(line.trim().split(" ")[0]);
    int k = Integer.parseInt(line.trim().split(" ")[1]);
    int[] array = new int[n];
    for (int i = 0; i <k; i++) {
      line = scanner.nextLine();
      for (int j =Integer.parseInt(line.trim().split(" ")[0])-1; j<=Integer.parseInt(line.trim().split(" ")[1])-1; j++) {
        array[j]=1;
      }
    }
    IntStream.range(0, array.length)
            .forEachOrdered(i -> {
              if (array[i] == 0) System.out.print("I");
              else System.out.print(".");
            });// put your code here
  }
}
