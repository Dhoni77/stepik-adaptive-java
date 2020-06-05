import java.util.Scanner;
import java.util.stream.IntStream;

//Arithmetic average
//
//        Write a program that reads two numbers aa and bb from the keyboard, calculates and outputs to the console the arithmetic average of all numbers from the interval [a; b][a;b], which are divided by 33.
//
//        In the example below the arithmetic average is calculated for the numbers on the interval [-5; 12][−5;12]. Total numbers divided by 33 on this interval 66: -3, 0, 3, 6, 9, 12−3,0,3,6,9,12. Their arithmetic average equals to 4.54.5
//
//        The program input contains intervals, which always contain at least one number, which is divided by 33.
//
//        Sample Input:
//
//        -5
//        12
//        Sample Output:
//
//        4.5

public class ArithmeticAverage {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println(IntStream.range(scanner.nextInt(), scanner.nextInt() + 1)
            .filter(x -> x % 3 == 0)
            .boxed()
            .mapToInt(Integer::intValue)
            .average()
            .getAsDouble());// put your code here
  }
}
