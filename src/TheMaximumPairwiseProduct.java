import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

//The maximum pairwise product
//
//        The first input line contains an integer 2 \le n \le 2\cdot 10^52≤n≤2⋅10
//        5
//        , the second — the sequence of integers 0 \le a_1, a_2, \dots, a_n \le 10^50≤a
//        1
//        ​
//        ,a
//        2
//        ​
//        ,…,a
//        n
//        ​
//        ≤10
//        5
//        .
//
//        Print the maximum pairwise product of the two elements of the sequence, i.e. \max\limits_{1 \le i \neq j \le n}a_ia_j
//        1≤i
//        
//        =j≤n
//        max
//        ​
//        a
//        i
//        ​
//        a
//        j
//        ​
//        .
//
//        Sample Input 1:
//
//        3
//        1 2 3
//        Sample Output 1:
//
//        6
//        Sample Input 2:
//
//        2
//        0 1
//        Sample Output 2:
//
//        0
//        Sample Input 3:
//
//        2
//        100000 90000
//        Sample Output 3:
//
//        9000000000

public class TheMaximumPairwiseProduct {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    long n = Long.parseLong(scanner.nextLine());
    List<Long> list = Arrays.stream(scanner.nextLine().trim().split(" ")).mapToLong(Long::parseLong).sorted().boxed().collect(Collectors.toList());
    System.out.println(list.get(list.size()-1)*list.get(list.size()-2));
  }
}
