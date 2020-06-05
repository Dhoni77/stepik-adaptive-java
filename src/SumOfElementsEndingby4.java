import java.util.Scanner;
import java.util.stream.IntStream;

public class SumOfElementsEndingby4 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println(IntStream.range(0, Integer.parseInt(scanner.nextLine()))
            .map(i -> Integer.parseInt(scanner.nextLine()))
            .filter(s -> String.valueOf(s)
                    .matches("\\d*4"))
            .sum());// put your code here
  }
}
