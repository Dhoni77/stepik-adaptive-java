import java.util.*;

//You need to sort the time moments, specified in hours, minutes and seconds.
//
//        Input data
//
//        The first line contains number N (1 <= N <= 100), and the next N lines – N time intervals. Each time interval is set by three integers - hours (from 0 to 23), minutes (from 0 to 59) and seconds (from 0 to 59).
//
//        Output data
//
//        Output the time intervals, sorted in nondecreasing order without leading zeroes.
//
//        Sample Input:
//
//        3
//        13 15 0
//        9 45 0
//        23 59 59
//        Sample Output:
//
//        9 45 0
//        13 15 0
//        23 59 59

public class SortTheTimeMoments {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = Integer.parseInt(scanner.nextLine());
    Map<Integer,String> set = new TreeMap<>();
    for(int i = 0; i < n; i++) {
      String s=scanner.nextLine();
      set.put(Integer.parseInt(s.replaceAll(" ", "")), s);
    }

    set.forEach((key, value) -> System.out.println(value));// put your code here
  }
}
