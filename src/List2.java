import java.util.Arrays;
import java.util.Scanner;

//You are given an integer number A and an array ending with 0. You must count how many times A appears in the array.
//
//        INPUT
//
//        User firstly inputs A, and then the array of indefinite length ending with 0.
//
//        OUTPUT
//
//        The number of times A appears in the array.  
//
//        Sample Input 1:
//
//        1
//        10 1 9 9 13 7 0
//        Sample Output 1:
//
//        1
//        Sample Input 2:
//
//        11
//        11 9 12 12 8 1 11 5 8 3 6 7 3 4 11 13 0
//        Sample Output 2:
//
//        3
//        Sample Input 3:
//
//        11
//        11 10 5 6 9 7 12 11 3 1 7 13 11 3 6 8 14 6 9 0
//        Sample Output 3:
//
//        3

public class List2 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = Integer.parseInt(scanner.nextLine());
    System.out.println(Arrays.asList(scanner.nextLine().trim().split(" ")).stream().mapToInt(Integer::parseInt).boxed().filter(x->x==n).count());
    // put your code here
  }
}
