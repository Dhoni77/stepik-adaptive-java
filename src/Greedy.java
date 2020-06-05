import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//Greedy
//
//        Little Johnny eats fruits from his grandma's basket. There are fruits with different mass in this basket. Little Johnny can pick up not more than K ounces. Each fruit weights not more than K ounces. At a time, he chooses a few of the most heavy fruits, which he can pick up simultaneously, bites a half of each of them and puts what is left back into the basket. If the fruit weights odd number of ounces, he bites off its half, rounded up to the nearest whole number. He completely eats those fruits, which weight 1 ounce.
//        Find the number of attempts Little Johnny needs in order to eat all fruits in the basket.
//
//        Write your heap storage class, which implements priority queue.
//
//        Input data format. Integer n – the number of fruits, and the line with integer masses of fruits separated by space. Then in the separate line - the "lifting capacity".
//
//        Output data format. A non-negative number – the number of attempts to the basket.
//
//        Sample Input:
//
//        3
//        1 2 2
//        2
//        Sample Output:
//
//        4

public class Greedy {

  public static int biteCount (List<Integer> fruitsWeight, int biteCap) {
    Queue<Integer> queue = fruitsWeight.stream().collect(Collectors.toCollection(() -> new PriorityQueue<>(Collections.reverseOrder())));
    int bitesCounter = 0;

    while(queue.size()>0) {
      int curCap = 0;
      List<Integer> toEat = new ArrayList<>();

      while(queue.size()>0&&curCap<=biteCap) {
        if (curCap+queue.peek()>biteCap)break;
        curCap+=queue.peek();
        toEat.add(queue.poll());
      }
      for(Integer s:toEat) {
        if (s>1) {
          queue.add(Math.floorDiv(s,2));
        }
      }
      bitesCounter+=1;
    }
    return bitesCounter;
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int fruits = Integer.parseInt(scanner.nextLine());
    List<Integer> fruitsWeight = Stream.of(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).boxed().collect(Collectors.toList());
    int biteCap = Integer.parseInt(scanner.nextLine());
    System.out.println(biteCount(fruitsWeight,biteCap));
  }
}
