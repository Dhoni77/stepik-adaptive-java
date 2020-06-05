import java.util.ArrayList;
import java.util.*;

//On the input, the program gets a sequence of non-negative integers; each integer is written in a separate line. The sequence ends with an integer 0, when reading which the program should end its work and output the length of the sequence (not counting the final 0).
//
//        Don’t read numbers following the number 0.
//
//        Sample Input:
//
//        1
//        7
//        9
//        0
//        5
//        Sample Output:
//
//        3

public class LengthOfTheSequence {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    List<Integer> list = new ArrayList<Integer>();
    int m;
    while((m=scanner.nextInt())!=0) {
      list.add(m);
    }
    System.out.println(list.size());// put your code here
  }
}
