import java.util.*;

//Input a single character and change its register. That is, if the lowercase letter has been entered – make it uppercase, and vice versa. Characters that are not Latin ones need to stay unchanged.
//
//        Sample Input:
//
//        b
//        Sample Output:
//
//        B

public class Uppercase {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    char n = scanner.nextLine().toCharArray()[0];
    if(String.valueOf(n).matches("\\p{IsLatin}"))
      System.out.println(Character.isLowerCase(n)?Character.toUpperCase(n):Character.toLowerCase(n));
    else
      System.out.println(n);
  }
}
