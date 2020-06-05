import java.util.*;

//Write a program that prints a part of the sequence 1 2 2 3 3 3 4 4 4 4 5 5 5 5 5 ...
// (the number is repeated as many times, to what it equals to).
// Input to the program is a positive integer n – the number of the elements of the sequence the program should print.
// On the output, it is expected to get the sequence of numbers, written in a single line, space-separated.
//        For example, if n = 7, then the program should output 1 2 2 3 3 3 4.

public class Sequence {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();

    int count = 0;
    for(int i = 1; i <=n; i++) {
      for (int j = 0; j < i; j++) {
        System.out.print(i+" ");
        count++;
        if(count==n) return;
      }

    }// put your code here
  }

}
