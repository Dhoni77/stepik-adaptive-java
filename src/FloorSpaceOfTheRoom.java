import java.util.Scanner;

//Floor-space of the room
//
//        Residents of the Malevia country often experiment with the plan of their rooms.
//        Rooms can be triangular, rectangular and round.
//        To quickly calculate the floorage it is required to write a program, which gets the type of the room shape
//        and the relevant parameters as input - the program should output the area of the resulting room.
//
//        The value of 3.14 is used instead of the number π in Malevia.
//
//        Input format used by the Malevians:
//
//        triangle
//        a
//        b
//        c
//        where a, b and c — lengths of the triangle sides.
//
//        rectangle
//        a
//        b
//        where a and b —lengths of the rectangle sides.
//
//        circle
//        r
//        where r — circle radius.
//        Sample Input 1:
//
//        rectangle
//        4
//        10
//        Sample Output 1:
//
//        40.0
//        Sample Input 2:
//
//        circle
//        5
//        Sample Output 2:
//
//        78.5
//        Sample Input 3:
//
//        triangle
//        3
//        4
//        5
//        Sample Output 3:
//
//        6.0

public class FloorSpaceOfTheRoom {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String type = scanner.nextLine();

    switch (type) {
      case "triangle": {
        double a=scanner.nextDouble();
        double b=scanner.nextDouble();
        double c=scanner.nextDouble();
        double p=(a+b+c)/2;
        double sq = Math.sqrt(p*(p-a)*(p-b)*(p-c));
        System.out.println(sq);
        break;
      }
      case "rectangle": {
        double a=scanner.nextDouble();
        double b=scanner.nextDouble();
        double sq = a*b;
        System.out.println(sq);
        break;
      }
      case "circle": {
        double r=scanner.nextDouble();
        double p=3.14;
        double sq = Math.pow(r,2)*p;
        System.out.println(sq);
        break;
      }
    }
  }
}
