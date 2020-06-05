import java.util.*;

public class HeronsFormula {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int a = scanner.nextInt();
    int b = scanner.nextInt();
    int c = scanner.nextInt();

    double p = (a + b + c) / 2.0;

    double triangleSq = Math.sqrt(p*(p-a)*(p-b)*(p-c));
    System.out.println(triangleSq); // put your code here
  }
}
