import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//Input of the program is a line containing the words separated by a space. The program should output the information of lengths of words in the given line, from the shortest to the longest word (see the example).
//
//        A word is a sequence of arbitrary characters surrounded by spaces or line boundaries. Note that punctuation marks also belong to a word.
//
//        Input format:
//        A string containing a sequence of Latin characters and punctuation marks, separated by a space.
//
//        Output format:
//        For each word length that appears in the original string, you need to specify the number of words with such length in a format:
//        length: amount
//
//        Output this information in the order of increasing length.
//        Sample Input:
//
//        Beautiful is better than ugly. Explicit is better than implicit.
//        Sample Output:
//
//        2: 2
//        4: 2
//        5: 1
//        6: 2
//        8: 1
//        9: 2

public class ContainingTheWords {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    List<String> list = Stream.of(scanner.nextLine()
            .trim()
            .split("[ \n]"))
            .map(String::trim)
            .sorted(Comparator.comparingInt(String::length))
            .collect(Collectors.toList());

    Map<Integer, Long> map = list
            .stream()
            .collect(Collectors.groupingBy(String::length, Collectors.counting()));
    map.forEach((k,v)-> System.out.println(k+": "+v)); // put your code here
  }
}
