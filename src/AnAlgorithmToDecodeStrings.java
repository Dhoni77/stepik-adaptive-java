import java.util.*;

//Run-length encoding is the basic algorithm of data compression.
//
//        In this problem, we will implement an algorithm to decode strings, encoded with one of its simplest versions.
//
//        On the input, the algorithm has a string containing the characters of the Latin alphabet. This string is split into the so-called "series", which are encoded by a number-symbol pair or just a symbol (in this case, the number is considered equal to one). The result must contain the series in the same order, in which they occur in the original string, and each series is disclosed into the sequence of characters of a corresponding length.
//
//        For example, let’s take the string
//
//        3ab4c2CaB
//
//        Split it down into series
//
//        3a b 4c 2C a B
//
//        Then transform the series and obtain the original encoded string:
//
//        aaabccccCCaB
//        Input format:
//        Single string, containing the encoded sequence.
//
//        Output format:
//        A string, containing the decoded sequence.
//
//        Sample Input:
//
//        3ab4c2CaB
//        Sample Output:
//
//        aaabccccCCaB

public class AnAlgorithmToDecodeStrings {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String line = scanner.nextLine();
    int count =1;
    StringBuilder sb = new StringBuilder();
    if (line.matches("[0-9a-zA-Z]+")) {
      for (Character s : line.toCharArray()) {
        if (Character.isDigit(s)) {
          sb.append(s);
          count = Integer.parseInt(sb + "");
        } else {
          for (int i = 0; i < count; i++) {
            System.out.print(s);
          }
          count = 1;
          sb.setLength(0);
        }
      }
    }
  }
}
