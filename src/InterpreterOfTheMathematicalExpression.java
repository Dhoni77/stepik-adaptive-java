import java.util.*;

//Write a simple interpreter of the mathematical expression.
//
//        The input is a string with expression, consisting of two numbers, connected by a binary operator: a \texttt{ operator } ba operator b, where instead of \texttt{operator}operator the following words can be used: plus, minus, multiply, divide - for addition, subtraction, multiplication and integer division respectively.
//
//        Input format:
//        One line containing the expression in a form of a \texttt{ operator } ba operator b, 0 \le a,b\le10000≤a,b≤1000. The operator can be the following: plus, minus, multiply, divide.
//
//        Output format:
//        The line, containing an integer -− - the result of calculations.
//
//        Sample Input 1:
//
//        45 plus 8
//        Sample Output 1:
//
//        53
//        Sample Input 2:
//
//        12 minus 42
//        Sample Output 2:
//
//        -30
//        Sample Input 3:
//
//        451 multiply 2
//        Sample Output 3:
//
//        902
//        Sample Input 4:
//
//        13 divide 3
//        Sample Output 4:
//
//        4

public class InterpreterOfTheMathematicalExpression {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String line = scanner.nextLine();
    int a = Integer.parseInt(line.trim().split(" ")[0]);
    String operator = line.trim().split(" ")[1];
    int b = Integer.parseInt(line.trim().split(" ")[2]);

    switch(operator) {
      case "plus": {
        System.out.println(a+b);
        break;
      }
      case "minus": {
        System.out.println(a-b);
        break;
      }
      case "multiply": {
        System.out.println(a*b);
        break;
      }
      case "divide": {
        if (b!=0) System.out.println(Math.floorDiv(a,b));
        break;
      }
    }
  }
}
