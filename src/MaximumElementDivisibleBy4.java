import java.util.Scanner;

//Given a sequence of natural numbers, not exceeding 30000. Find the its maximum element divisible by 4.
// As input, the program gets the number of elements in the sequence, and then the elements themselves.
// In the sequence, there is always an element divisible by 4. The number of elements does not exceed 1000.
// The program should print the single number – the maximum element of the sequence divisible by 4.
//
//        Sample Input:
//
//        10
//        83
//        68
//        58
//        44
//        47
//        59
//        36
//        13
//        12
//        16
//        Sample Output:
//
//        68

public class MaximumElementDivisibleBy4 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int number = scanner.nextInt();
    int max = 0;
    int nextNumber = 0;

    for (int i = 0; i < number; i++) {
      nextNumber = scanner.nextInt();
      if (nextNumber % 4 == 0) {
        if (max < nextNumber) {
          max = nextNumber;
        }
      }
    }
    System.out.println(max); // put your code here
  }
}
