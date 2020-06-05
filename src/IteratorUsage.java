import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.Stream;

//Using BufferedReader read one string with numbers written across the space ("1 2 3 4 5 ...").
//
//        Put this numbers to any Collection of Integers.Sort this collection!
//
//        Using Iterator remove all even annoying numbers(death for elem%2=0 !) from your Collection
//
//        Print all remaining elements to console (use System.out.println() method)
//
//        Sample Input:
//
//        1 2 3 4 5 6 7 8 9 10
//        Sample Output:
//
//        1
//        3
//        5
//        7
//        9

public class IteratorUsage {

  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    Stream.of(reader.readLine()
            .trim()
            .split(" "))
            .mapToInt(Integer::parseInt)
            .filter(x -> x % 2 != 0)
            .sorted()
            .forEach(System.out::println);
  }
}
