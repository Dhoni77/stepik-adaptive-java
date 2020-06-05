import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//When Anthony read "War and Peace", he wondered how many words and how much of them were used in this book.
//
//        Help Anthony to write a simplified version of a program that can count the words, separated by a space and output the resulting statistics.
//
//        The program must read one line from the standard input and for each unique word in this line output the count of its repeated occurrence (case insensitive) in the "word amount" format (see the output example).
//
//        The order of words output may be arbitrary. Each unique word must appear in the output only once.
//
//        Sample Input 1:
//
//        a aa abC aa ac abc bcd a
//        Sample Output 1:
//
//        bcd 1
//        aa 2
//        a 2
//        abc 2
//        ac 1
//        Sample Input 2:
//
//        a A a
//        Sample Output 2:
//
//        a 3

public class WarAndPeace {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Stream.of(scanner.nextLine()
            .trim().toLowerCase()
            .split(" "))
            .collect(Collectors.groupingBy(String::valueOf, Collectors.counting()))
            .forEach((k, v) -> System.out.println(k + " " + v));// put your code here
  }
}
