import java.util.*;

//Write a program that parses user commands and imitates their processing.
//
//        The program should output messages on its state in the following format:
//        When user enters a command, the content of which we denote as <command>, the program should print the phrase
//
//        Processing "<command>" command...
//        For example, a user has entered Come to me, in this case the following line should be printed
//
//        Processing "Come to me" command...
//        Reading of commands shall continue until the End command is entered, in such case the program should print the message
//
//        Good bye!
//        and end (see the example).
//
//        Use the input() function without arguments to read the commands.
//
//        Input format:
//        A sequence of commands, each on a separate line. A command consists of the letters of Latin alphabet, spaces and tab symbols. It is guaranteed that there are no spaces at the beginning and at the end of a line. End is always the last command.
//
//        Output format:
//        Messages while processing of commands, as specified in the problem statement; one message per line.
//
//        Sample Input:
//
//        Turn left
//        Move forward
//        Turn left
//        Move forward
//        Turn left
//        Move forward
//        Turn left
//        Move forward
//        End
//        Sample Output:
//
//        Processing "Turn left" command...
//        Processing "Move forward" command...
//        Processing "Turn left" command...
//        Processing "Move forward" command...
//        Processing "Turn left" command...
//        Processing "Move forward" command...
//        Processing "Turn left" command...
//        Processing "Move forward" command...
//        Good bye!

public class SmallParser {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    List<String> list = new ArrayList<String>();
    while(true) {
      String line=scanner.nextLine();
      if (!line.equals("End"))
        list.add("Processing \""+line+"\" command...");
      else {
        list.add("Good bye!");
        list.forEach(System.out::println);
        return;
      }
    }
  }
}
