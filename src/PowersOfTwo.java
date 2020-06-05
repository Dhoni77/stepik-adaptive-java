import java.util.*;

//Given number N. Print all integer powers of two, not exceeding N, in ascending order.
//
//        Sample Input:
//
//        50
//        Sample Output:
//
//        1
//        2
//        4
//        8
//        16
//        32

public class PowersOfTwo {
  public static List<Integer> listOfPower (int n) {
    List<Integer> list = new ArrayList<Integer>();
    int a = 1;
    list.add(a);
    while(a*2<=n) {
      a = a * 2;
      list.add(a);
    }
    return list;
  }
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();

    listOfPower(n).forEach(System.out::println);
    // put your code here
  }
}
