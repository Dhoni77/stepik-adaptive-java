import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//Write a program, which turns a sequence of integers x_1, x_2, \ldots, x_nx
//        1
//        ​
//        ,x
//        2
//        ​
//        ,…,x
//        n
//        ​
//        into the sequence (x_1 + x_n), (x_2+x_{n-1}), (x_3 + x_{n-2}), \ldots(x
//        1
//        ​
//        +x
//        n
//        ​
//        ),(x
//        2
//        ​
//        +x
//        n−1
//        ​
//        ),(x
//        3
//        ​
//        +x
//        n−2
//        ​
//        ),… of length \lceil n/2 \rceil⌈n/2⌉.
//
//        Input format: input is a positive integer n\lt 10^6n<10
//        6
//        , next go the nn integers separated by spaces, corresponding to x_1,\ldots,x_nx
//        1
//        ​
//        ,…,x
//        n
//        ​
//        .
//
//        Output format: the output should be the \lceil n / 2 \rceil⌈n/2⌉ space-separated integers, corresponding to the sequence (x_1 + x_n), (x_2+x_{n-1}), (x_3 + x_{n-2}), \ldots(x
//        1
//        ​
//        +x
//        n
//        ​
//        ),(x
//        2
//        ​
//        +x
//        n−1
//        ​
//        ),(x
//        3
//        ​
//        +x
//        n−2
//        ​
//        ),…. In the case if number nn is an odd one, x_{(n + 1)/2}x
//        (n+1)/2
//        ​
//        (i.e. the middle number in the array) should serve as the last element of the sequence.
//
//        Sample Input:
//
//        10 30 32 43 65 -32 54 34 -23 11 9
//        Sample Output:
//
//        39 43 20 99 22

public class SequenceReversal {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String line = scanner.nextLine();
    int n = Integer.parseInt(line.trim().split(" ")[0]);
    List<Integer> list = Stream.of(line
            .trim()
            .split(" "))
            .mapToInt(Integer::parseInt)
            .skip(1)
            .boxed()
            .collect(Collectors.toList());

    //3 1 0 1
    //5 1 2 3 4 5
    //1 1
    int k = n/2;
    if (n%2!=0) {
//            k = (n+1)/2;
//            int m=k/2;
//            if (k%2!=0) m=k/2+1;
//            for (int i=0; i<m; i++) {
//                System.out.print(list.get(k-i-1)+list.get(i)+" ");
//            }
      k = n/2;
      for (int i=0; i<k; i++) {
        System.out.print(list.get(i)+list.get(list.size()-1-i)+" ");
      }
      System.out.print(list.get(n/2));

    }
    else {
      for (int i=0; i<k; i++) {
        System.out.print(list.get(list.size()-1-i)+list.get(list.size()-k*2+i)+" ");
      }
    }
  }
}
