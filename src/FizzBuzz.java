import java.util.*;

//Fizz Buzz is a classic programming problem. Here is its slightly modified version.
//
//        Write a program that takes the input of two integers: the beginning and the end of the interval
//        (both numbers belong to the interval).
//
//        The program should output the numbers from this interval, but if the number is divisible by 3,
//        you should output Fizz instead of it, if the number is divisible by 5 - output Buzz,
//        and if it is divisible both by 3 and by 5 - output FizzBuzz.
//
//        Output each number or the word on a separate line.
//
//        Sample Input:
//
//        8 16
//        Sample Output:
//
//        8
//        Fizz
//        Buzz
//        11
//        Fizz
//        13
//        14
//        FizzBuzz
//        16

public class FizzBuzz {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String line = scanner.nextLine();
    for (int i = Integer.parseInt(line.trim()
            .split(" ")[0]); i < Integer.parseInt(line.trim()
            .split(" ")[1])+1; i++) {
      if (i%3==0&i%5!=0) {
        System.out.println("Fizz");
      }
      else if (i%3!=0&i%5==0) {
        System.out.println("Buzz");
      }
      else if (i%3==0&i%5==0) {
        System.out.println("FizzBuzz");
      }
      else
        System.out.println(i);
    }// put your code here
  }
}
