import java.util.Scanner;
import java.util.Stack;
import java.util.stream.IntStream;

//Given the integer N (1<=N<=40). List all the decompositions of N into the whole positive addends.
//
//        The addends should go in non-ascending order within each decomposition.
//
//        Output all decompositions in the lexicographical order.
//
//        Sample Input:
//
//        5
//        Sample Output:
//
//        1 1 1 1 1
//        2 1 1 1
//        2 2 1
//        3 1 1
//        3 2
//        4 1
//        5

public class Decompositions {
  static void addArraytoStack(int p[], int n)
  {
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < n; i++)
      sb.append(p[i])
              .append(" ");
    stackArray.add(sb);
  }
  public static final Stack<StringBuilder> stackArray = new Stack<>();
  // Function to generate all unique partitions of an integer
  static void findAllUniqueParts(int n)
  {
    int[] p = new int[n]; // An array to store a partition
    int k = 0;  // Index of last element in a partition
    p[k] = n;  // Initialize first partition as number itself

    // This loop first prints current partition then generates next
    // partition. The loop stops when the current partition has all 1s
    while (true)
    {
      // print current partition
      addArraytoStack(p, k+1);

      // Generate next partition

      // Find the rightmost non-one value in p[]. Also, update the
      // rem_val so that we know how much value can be accommodated
      int rem_val = 0;
      while (k >= 0 && p[k] == 1)
      {
        rem_val += p[k];
        k--;
      }

      // if k < 0, all the values are 1 so there are no more partitions
      if (k < 0)  return;

      // Decrease the p[k] found above and adjust the rem_val
      p[k]--;
      rem_val++;


      // If rem_val is more, then the sorted order is violated.  Divide
      // rem_val in different values of size p[k] and copy these values at
      // different positions after p[k]
      while (rem_val > p[k])
      {
        p[k+1] = p[k];
        rem_val = rem_val - p[k];
        k++;
      }

      // Copy rem_val to next position and increment position
      p[k+1] = rem_val;
      k++;
    }
  }
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();


    findAllUniqueParts(n);


    IntStream.range(0, stackArray.size())
            .mapToObj(i -> stackArray.pop())
            .forEach(System.out::println);
    // put your code here
  }
}
