import java.math.BigDecimal;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Messages {
//  In the message, consisting of the capital letters of the English alphabet, each letter was replaced by its number in the alphabet (A - 1, B - 2, ..., Z - 26), and the space was replaced by as zero.
//
//  By a given sequence of numbers, you should find the number of the initial messages, from which it could be obtained.
//
//          Input data
//
//  The input line contains a sequence of no more than 100 digits.

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String line = scanner.nextLine();
    BigDecimal result = countMessages(line);
    System.out.println(result);
  }

  public static BigDecimal countMessages(String line) {
    BigDecimal a1 = BigDecimal.valueOf(1);
    BigDecimal a2 = BigDecimal.valueOf(1);
    List<BigDecimal> list = Stream.of(line.split("")).map(BigDecimal::new).collect(Collectors.toList());

    for(int i = 1;i<line.length();i++) {
    BigDecimal temp = a2;
    a2 = a1;
    String forConcat="";
    for (int j = i-1;j<i+1;j++) {
      forConcat=forConcat.concat(String.valueOf(list.get(j)));
    }
    BigDecimal condition=BigDecimal.ZERO;
    if (!forConcat.isEmpty()) condition = new BigDecimal(forConcat);
      if (BigDecimal.valueOf(9).compareTo(condition)==-1&&condition.compareTo(BigDecimal.valueOf(27))==-1) a1 = a1.add(temp);
    }

    return a1;
  }
}
