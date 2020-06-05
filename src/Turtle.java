import java.util.*;

//The biologists group at the Bioinformatics Institute got a turtle.
//
//        After training the turtle learned to understand and remember instructions, which look like the following:
//        North 10
//        West 20
//        South 30
//        East 40
//        where the first word is a direction, in which the turtle should move, and the number after the word — the positive distance in centimeters, which the turtle should pass.
//        Nevertheless, issuing commands is fast, but the turtle moves slowly. That is why programmers figured out that they could write a program that determines to where eventually the biologists will lead the turtle. To do this, programmers ask you to write a program that outputs the point at which the turtle will arrive after performing all of the issued commands. For simplicity, they have decided to assume that the movement starts at the point (0, 0), and the movement to the east increases the first coordinate, to the north – the second one.
//
//        The program gets a number of commands nn as input, which should be performed by the turtle, followed by the nn lines with the commands themselves. You need to output two numbers in the single line: the first and the second coordinate of the final point for the turtle. All coordinates are integers.
//
//        Sample Input:
//
//        4
//        North 10
//        West 20
//        South 30
//        East 40
//        Sample Output:
//
//        20 -20

public class Turtle {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int n=Integer.parseInt(scanner.nextLine());
//        Map<String, Integer> map =new HashMap<>();
    List<String> list = new ArrayList<>();

    for (int i=0; i<n; i++) {
      String a = scanner.nextLine();
      list.add(a);
    }

    int x=0;
    int y=0;
    for (String s : list) {
      String direction = s.split(" ")[0];
      int distance = Integer.valueOf(s.split(" ")[1]);

      switch (direction) {
        case "North": y=y+distance;break;
        case "South": y=y-distance;break;
        case "East": x=x+distance;break;
        case "West": x=x-distance;break;
      }
    }

    System.out.println(x+" "+y);
  }
}
