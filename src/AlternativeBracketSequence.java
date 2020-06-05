import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;

public class AlternativeBracketSequence {

  //Works with all tests
  public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);
    String line = scanner.nextLine();
    Stack<Character> a = new Stack<>();
    Stack<Character> s = new Stack<>();
    char[] valArray = line.toCharArray();
    boolean possible = true;
    for (char i : valArray) {
      if (i == '(' || i == '[' || i == '{') {
        s.push(i);
      }
      if ( i == ')' || i == ']' || i == '}') {
        if (s.isEmpty()) {
          a.push(i);
        }
        else {
          char temp = s.pop();
          if ((i == ')' && temp != '(') || (i == ']' && temp != '[') || (i == '}' && temp != '{')) {
            possible = false;
            break;
          }
        }
      }
    }
    if (possible) {
      while(!a.isEmpty()) {
        char temp = a.pop();
        if (temp == ']') temp = '[';
        if (temp == ')') temp = '(';
        if (temp == '}') temp = '{';
        System.out.print(temp);
      }
      System.out.print(line);
      while(!s.isEmpty()) {
        char temp = s.pop();
        if (temp == '[') temp = ']';
        if (temp == '(') temp = ')';
        if (temp == '{') temp = '}';
        System.out.print(temp);
      }

    } else
      System.out.println("IMPOSSIBLE");

  }

  private static Set<Character> openBracket = new HashSet<>();
  private static Set<Character> closeBracket = new HashSet<>();
  private static Map<Character, Character> oppositeBracket = new HashMap<>();

  static {
    openBracket.add('{');
    openBracket.add('[');
    openBracket.add('(');
    closeBracket.add('}');
    closeBracket.add(']');
    closeBracket.add(')');
    oppositeBracket.put('{', '}');
    oppositeBracket.put('[', ']');
    oppositeBracket.put('(', ')');
    oppositeBracket.put(')', '(');
    oppositeBracket.put(']', '[');
    oppositeBracket.put('}', '{');
  }
}
