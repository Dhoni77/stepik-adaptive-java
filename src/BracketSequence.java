import java.util.*;
import java.util.stream.Collectors;

public class BracketSequence {

  //Completely works, but tests don't pass
  public static void main(String[] args) throws Exception {
//    Scanner scanner = new Scanner(System.in);
//    System.out.println(continuedBrackets(scanner.nextLine()));
    String[] testArray = new String[8];
    testArray[0] = "}[[([{[]}";
    testArray[1] = "[]";
    testArray[2] = "{()[]}";
    testArray[3] = "[{)[]]";
    testArray[4] = "[[[";
    testArray[5] = "}[[([{[]}";
    testArray[6] = "{][[[[{}[]";
    testArray[7] = "{}[[([{[]}])]]";
//
//    List<String> list = Arrays.asList(testArray);
//    for (String x : list) {
//      System.out.println((continuedBrackets(x)));
//    }
    System.out.println(continuedBrackets(testArray[0]));
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
    oppositeBracket.put('{','}');
    oppositeBracket.put('[',']');
    oppositeBracket.put('(',')');
    oppositeBracket.put(')','(');
    oppositeBracket.put(']','[');
    oppositeBracket.put('}','{');
  }

  //Not for 1 symbol Bracket
  private static boolean impossibleToContinue (String value) {
    boolean result = false;
    char[] charArray = value.toCharArray();
    if (value.length()>1) {
      for (int i = 0; i < charArray.length - 1; i++) {
        Character c = charArray[i];
        Character next = charArray[i + 1];
        if (closeBracket.contains(next)&&c!=oppositeBracket.get(next)&&openBracket.contains(c)) {
          result = true;
        }
      }
    }
    return result;
  }

  private static String continuedBrackets(String value) throws Exception {
   if (impossibleToContinue(value)){ return "IMPOSSIBLE"; }
   if(bracesIsValid(value)) return value;
    for (Character c : value.toCharArray()) {
      if (!oppositeBracket.containsKey(c))
      { return "IMPOSSIBLE"; }
    }

    Deque<Character> result = value.chars().mapToObj(c->(char)c).collect(Collectors.toCollection(LinkedList::new));
    Stack<Character> tempStack = new Stack<>();
    char[] valArray = value.toCharArray();

      for (char bracket:valArray) {

        if(openBracket.contains(bracket)) {
          tempStack.push(bracket);
        }

        if (closeBracket.contains(bracket)) {
          if (tempStack.isEmpty()) {
            result.addFirst(oppositeBracket.get(bracket));
            tempStack.push(oppositeBracket.get(bracket));
          }
          char pairBracket = tempStack.peek(); //получаем верхний элемент
          if (pairBracket == oppositeBracket.get(bracket)) tempStack.pop();
          }
        }
      while (!tempStack.isEmpty()) {
        result.addLast(oppositeBracket.get(tempStack.pop()));
      }
    return result.stream().map(Object::toString).collect(Collectors.joining());
  }

  private static boolean bracesIsValid(String value) throws Exception {
    Stack<Character> stack = new Stack<Character>();
    boolean isValid = false;
      isValid = true;
      char[] valArray = value.toCharArray();
      if (valArray.length % 2 != 0) {
        isValid = false;
      } else {
        for (char bracket:valArray) {
          if (bracket == '{' || bracket == '[' || bracket == '(') {
            stack.push(bracket);
          }
          else if(bracket == '}' || bracket == ']' || bracket == ')') {

            if(stack.empty()) {
              isValid = false;
              return isValid;
            }

            char pairBracket = stack.peek();
            if (bracket == '}' && pairBracket == '{' ||
                    bracket == ')' && pairBracket == '(' ||
                    bracket == ']' && pairBracket == '[') {
              stack.pop();
            } else {
              isValid = false;
            }

          }
      }
    }
    return isValid;
  }
}
