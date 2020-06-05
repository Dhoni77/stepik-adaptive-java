import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

//The simplest spell checker is based on a list of known words. Every word in the checked text is searched for in this list and, if such a word was not found, it is marked as erroneous.
//
//        Write this spell checker.
//
//        The first line of the input contains dd – number of records in the list of known word. Next go dd lines contain one known word per line, next — the number ll of lines of the text, after which — ll lines of the text.
//
//        Write a program that outputs those words from the text, which are not found in the dictionary (i.e. erroneous). Your shell checker should be case insensitive. The words are entered in an arbitrary order. Words, which are not found in the dictionary, should not be duplicated in the output.
//
//        Sample Input:
//
//        3
//        a
//        bb
//        cCc
//        2
//        a bb aab aba ccc
//        c bb aaa
//        Sample Output:
//
//        aaa
//        aab
//        aba
//        c

public class SpellChecker {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = Integer.parseInt(scanner.nextLine());
    Set<String> vocab = IntStream.range(0,n).mapToObj(x->scanner.nextLine().trim().toLowerCase()).collect(Collectors.toSet());
    int m = Integer.parseInt(scanner.nextLine());
    Set<String> book = new TreeSet<>();
    IntStream.range(0, m)
            .mapToObj(i -> Stream.of(scanner.nextLine()
                    .trim()
                    .toLowerCase()
                    .split(" "))
                    .collect(Collectors.toSet()))
            .forEach(book::addAll);
    book.stream()
            .filter(s -> !vocab.contains(s))
            .forEach(System.out::println);// put your code here
  }
}
