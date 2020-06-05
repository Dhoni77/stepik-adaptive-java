import java.util.*;

//Calculator
//
//        Write a simple calculator that reads the three input lines: the first number, the second number and the operation, after which it applies the operation to the entered numbers ("first number" "operation" "second number") and outputs the result to the screen. Note that the numbers can be real.
//
//        Supported operations: +, -, /, *, mod, pow, div; where
//        mod — taking the residue,
//        pow — exponentiation,
//        div — integer division.
//
//        If a user performs the division and the second number is 0, it is necessary to output the line "Division by 0!".
//
//        Sample Input 1:
//
//        5.0
//        0.0
//        mod
//        Sample Output 1:
//
//        Division by 0!
//        Sample Input 2:
//
//        -12.0
//        -8.0
//        *
//        Sample Output 2:
//
//        96.0
//        Sample Input 3:
//
//        5.0
//        10.0
//        /
//        Sample Output 3:
//
//        0.5


public class Calculator {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    double a = Double.parseDouble(scanner.nextLine());
    double b = Double.parseDouble(scanner.nextLine());
    String n = scanner.nextLine();

    switch (n){
      case "+": {
        double result = a+b;
        System.out.println(result);
        break;
      }
      case "-":{
        double result = a-b;
        System.out.println(result);
        break;
      }
      case "*":{
        double result = a*b;
        System.out.println(result);
        break;
      }
      case "/":{
        if (b!=0.0) {
          double result = a / b;
          System.out.println(result);
        }
        else
          System.out.println("Division by 0!");
        break;
      }
      case "mod":{
        if (b!=0.0) {
          System.out.println(Math.floorMod((long)a, (long)b));
        }
        else
          System.out.println("Division by 0!");
        break;
      }
      case "pow": {
        double result = Math.pow(a,b);
        System.out.println(result);
        break;
      }
      case "div": {
        if (b!=0.0) {
          System.out.println(Math.floorDiv((long) a, (long) b));
        }
        else
          System.out.println("Division by 0!");
        break;
      }
    }
  }

}
