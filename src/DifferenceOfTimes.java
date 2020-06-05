import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

//Difference of times
//
//        Given the values of the two moments in time in the same day: hours, minutes and seconds for each of the time moments.
//        It is known that the second moment in time happened not earlier than the first one.
//        Find how many seconds passed between these two moments of time.
//        Input data format
//        The program gets the input of the three integers: hours, minutes, seconds,
//        defining the first moment of time and three integers that define the second moment time.
//        Output data format
//        Output the number of seconds between these two moments of time.
//        Sample Input 1:
//        1
//        1
//        1
//        2
//        2
//        2
//        Sample Output 1:
//        3661
//        Sample Input 2:
//        1
//        2
//        30
//        1
//        3
//        20
//        Sample Output 2:
//        50

public class DifferenceOfTimes {
  public static void main(String[] args) throws ParseException {
    Scanner scanner = new Scanner(System.in);
    SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");
    String start = Integer.parseInt(scanner.nextLine())+":"+ Integer.parseInt(scanner.nextLine())+":"+Integer.parseInt(scanner.nextLine());
    String end = Integer.parseInt(scanner.nextLine())+":"+ Integer.parseInt(scanner.nextLine())+":"+Integer.parseInt(scanner.nextLine());
    Date date1 = format.parse(start);
    Date date2 = format.parse(end);
    System.out.println((date2.getTime()-date1.getTime())/1000);
  }
}
