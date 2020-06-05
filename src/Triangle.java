import java.util.*;

//  Triangle
//
//          Given three natural numbers A, B, C. Define if the triangle with such sides exists.
//
//          If the triangle exists - output the YES string, otherwise - output NO.
//
//          Triangle is a three points that are not located on a single straight line.
public class Triangle {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int a = scanner.nextInt();
    int b = scanner.nextInt();
    int c = scanner.nextInt();
    System.out.println(a+b>c&&a+c>b&&b+c>a?"YES":"NO");
  }
}
