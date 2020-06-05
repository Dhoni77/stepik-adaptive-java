import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//In the internet, each computer is assigned a four-byte code (IP address), which is usually written as four numbers, each of which can take the values from 0 to 255, separated by periods. Below are the examples of the correct IP addresses:
//        127.0.0.0
//        192.168.0.1
//        255.0.255.255
//
//        Write a program to determine whether the specified string is a correct IP address.
//
//        The program should take a string of arbitrary characters as input. If this string is a correct record of an IP address - output YES, otherwise - output NO.
//
//        Note
//
//        In order to convert string to number it is convenient to use the int function, which takes one string as an argument and returns a number.
//
//        Sample Input:
//
//        127.0.0.1
//        Sample Output:
//
//        YES

public class IPAddress {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String line = scanner.nextLine();
    List<String> list = Stream.of(line.split("\\.")).map(String::valueOf).collect(Collectors.toList());
    boolean is = true;
    if(line.substring(0,1).matches("[.]")||line.substring(line.length()-1).matches("[.]")||list.size()!=4) is=false;
    for (String s:list) {
      try {
        int n = Integer.parseInt(s);
        if (s.length()!=String.valueOf(n).length()) is=false;
        if (n>255||n<0) is=false;
      } catch (NumberFormatException e) {
        is=false;
      }
    }
    System.out.println(is?"YES":"NO");
  }
}
