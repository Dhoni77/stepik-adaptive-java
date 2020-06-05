import java.util.Scanner;

//Fractional part 2
//
//        Given a positive real number X. Output its first digit after the decimal point.
//
//        Sample Input:
//
//        1.79
//        Sample Output:
//
//        7

public class FractionalPart2 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    double n = Double.parseDouble(scanner.nextLine().trim());
    System.out.println(String.valueOf((int)(n*10.0)).toCharArray()[String.valueOf((int)(n*10.0)).length()-1]);// put your code here
  }
}
