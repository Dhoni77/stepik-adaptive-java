import java.util.*;

//The average value
//
//        Given the sequence of integers, ending with number 0. Find the average value of all elements in this sequence.
//
//        The number 0 itself is not included into the sequence and serves just as a sign of cessation.
//
//        Sample Input:
//
//        1
//        7
//        9
//        0
//        Sample Output:
//
//        5.66666666667

public class TheAverageValue {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n=scanner.nextInt();
    List<Integer> list = new ArrayList<>();
    list.add(n);
    while((n=scanner.nextInt())!=0) {
      list.add(n);
    }
    double result = (double)list.stream().mapToInt(Integer::intValue).sum()/list.size();
    System.out.println(result);
  }
}
