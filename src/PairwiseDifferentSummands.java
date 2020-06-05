import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PairwiseDifferentSummands {

//  Pairwise different summands
//
//  Given an integer 1 \le n \le 10^91≤n≤10
//          9
//  find the maximal number kk such that nn can be represented as a sum of pairwise different positive integers. In the first line output kk, in the next line output kk summands.
//
//  Sample Input 1:
//
//          4
//  Sample Output 1:
//
//          2
//          1 3
//  Sample Input 2:
//
//          6
//  Sample Output 2:
//
//          3
//          1 2 3

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = Integer.parseInt(scanner.nextLine());

    List<Integer> list = new ArrayList<>();

    int total = 0;
    int increment = 1;
    int count=0;
    while (total+increment<=n) {
      total = total + increment;
      list.add(increment);
      increment = increment + 1;
      count = count + 1;
    }
    list.set(count-1, list.get(count-1)+n-total);

    System.out.println(list.size());
    list.forEach(x->System.out.print(x+" "));// put your code here
  }
}
