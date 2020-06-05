import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//The lucky ticket
//
//        Paul loves to ride public transport and after receiving the ticket, he immediately checks whether he got the lucky one. A ticket is considered a lucky one if the sum of the first three numbers in this ticket matches the sum of the last three numbers in the same ticket.
//
//        However, Paul does not count well in head that is why he asks you to write the program, which will check the equality of the sums and display "Lucky" if the sums match, and "Regular" if the sums differ.
//
//        A string of six digits is provided as input to the program.
//
//        You need to print out only the word "Lucky" or "Regular" with a capital letter.
//
//        Sample Input 1:
//
//        090234
//        Sample Output 1:
//
//        Lucky
//        Sample Input 2:
//
//        123456
//        Sample Output 2:
//
//        Regular

public class TheLuckyTicket {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    List<Integer> list = Stream.of(scanner.nextLine().split("")).map(Integer::parseInt).collect(Collectors.toList());
    if (list.stream().skip(3).mapToInt(Integer::intValue).sum()==list.stream().mapToInt(Integer::intValue).limit(3).sum()) System.out.println("Lucky");
    else System.out.println("Regular");// put your code here
  }
}
