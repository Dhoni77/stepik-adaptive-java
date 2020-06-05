import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//Given natural number n. Generate a sequence of integers, described in the Collatz conjecture:
//
//        If n is an even number, divide it in half, if it is odd, multiply it by 3 and add 1.
//        Repeat this operation until we get the number 1 as a result.
//
//        For example, if the number n = 17, then the sequence looks as the following:
//        17 52 26 13 40 20 10 5 16 8 4 2 1
//        Such a sequence will stop at number 1 for any primary natural number n.
//
//        Output format:
//        Sequence of integers in a single line, separated by spaces.
//
//        Sample Input 1:
//
//        17
//        Sample Output 1:
//
//        17 52 26 13 40 20 10 5 16 8 4 2 1
//        Sample Input 2:
//
//        1
//        Sample Output 2:
//
//        1

public class CollatzConjecture {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();

    List<Integer> list = new ArrayList<>();
    list.add(n);

    for (int i=0; ; i++) {
      if(n==1) break;

      if (n%2==0) {
        n=n/2;
        list.add(n);
      }
      else {
        n=n*3+1;
        list.add(n);
      }

    }


    for(int s:list) {
      System.out.print(s+" ");
    }// put your code here
  }
}
