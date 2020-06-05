import java.util.*;

//In the Roman numbering system, the following symbols are used to represent numbers (on the right are the numbers, which correspond to these symbols in the decimal system):
//
//        I = 1
//        V = 5
//        X = 10
//        L = 50
//        C = 100
//        D = 500
//        M = 1000
//
//        We use an option in which the numbers 4, 9, 40, 90, 400 and 900 are represented by a subtraction of a smaller number from a larger one: IV, IX, XL, XC, CD and CM, respectively.
//
//        Write a program that converts the number from Roman system into the decimal one.
//
//        Input format:
//        The string, containing the number, encoded into the Roman numbering system. It is guaranteed that this number is less than 4000.
//
//        Output format:
//        The string, containing the number in the decimal numbering system, which corresponds to the input.
//
//        Sample Input 1:
//
//        MCMLXXXIV
//        Sample Output 1:
//
//        1984
//        Sample Input 2:
//
//        IX
//        Sample Output 2:
//
//        9
//        Sample Input 3:
//
//        III
//        Sample Output 3:
//
//        3

public class FromRomanSystemIntoTheDecimal {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    char[] n =scanner.nextLine().toCharArray();

    Map<Character, Integer> map = new HashMap<>();
    map.put('I',1);
    map.put('V',5);
    map.put('X',10);
    map.put('L',50);
    map.put('C',100);
    map.put('D',500);
    map.put('M',1000);

//        MCMLXXXIV
    int result=0;
    if (n.length>=2) {
      for (int i = 0; i < n.length; i++) {
        if (i + 1 < n.length) {
          if (map.get(n[i]) >= map.get(n[i + 1])) {
            result = result + map.get(n[i]);
          } else
            result = result - map.get(n[i]);
        }
        else
          result = result + map.get(n[i]);
      }
      System.out.println(result);
    }
    else
      System.out.println(map.get(n[0]));// put your code here
  }
}
