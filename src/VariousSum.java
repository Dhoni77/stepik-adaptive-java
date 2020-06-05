import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//Given N integers A1, A2, ..., AN. You should find the number of various sum values of k1A1 + k2A2 + ... + kNAN.
//
//        Input data
//
//        The first line contains number N, the second – A1, A2, ..., AN separated by a space. All numbers are integers:
//
//        1 ≤ N ≤ 500,
//
//        0 ≤ Ai ≤100,
//
//        0 ≤ ki ≤ 1.
//
//        Output data
//
//        Output the number of the various sum values.
//
//        Sample Input:
//
//        3
//        1 2 3
//        Sample Output:
//
//        7

public class VariousSum {

  public static int variousSum(List<Integer> sequence) {
    Set<Integer> ds = new HashSet<>();
    ds.add(0);
    Set<Integer> curSums = new HashSet<>();

    for (Integer elem : sequence) {
      for (Integer s : ds) {
        curSums.add(elem + s);
      }
      ds.addAll(curSums);
    }
    return ds.size();
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = Integer.parseInt(scanner.nextLine());
    List<Integer> list = Stream.of(scanner.nextLine()
            .split(" "))
            .mapToInt(Integer::parseInt)
            .boxed()
            .collect(Collectors.toList());
    System.out.println(variousSum(list));
  }
}
