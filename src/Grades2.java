import java.util.*;
import java.util.stream.Stream;

//Write a program which finds the percentage of students who have received the A grade.
//
//        Used the five-point grading scale with grades A, B, C, D and F.
//
//        Input format:
//
//        A single line with student grades separated by a space. There is at least one grade.
//
//        Output format:
//        The floating point number.
//
//        Sample Input 1:
//
//        F B A A B C A D
//        Sample Output 1:
//
//        0.375
//        Sample Input 2:
//
//        B C B
//        Sample Output 2:
//
//        0.0
//        Sample Input 3:
//
//        A D
//        Sample Output 3:
//
//        0.5

public class Grades2 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String n = scanner.nextLine();
    float result= (Stream.of(n.split(" ")).filter(x->x.equals("A")).count()/(float)n.split(" ").length);
    System.out.println(result);// put your code here
  }
}
