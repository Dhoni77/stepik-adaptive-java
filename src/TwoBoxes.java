import java.util.*;

//There are two boxes. First one has the size of A1×B1×C1, second one – the size of A2×B2×C2. Find whether you can place one of these boxes inside the other one. You can turn the boxes only 90 degrees around the edges.
//
//        Input data format
//
//        The program gets six numbers A1, B1, C1, A2, B2, C2 on input.
//
//        Output data format
//
//        The program should output one of the following lines:
//        “Boxes are equal”, if the boxes are the same,
//        “The first box is smaller than the second one“ if the first box can be placed into the second one,
//        “The first box is larger than the second one”, if the second box can be placed into the first one,
//        “Boxes are incomparable", in any other cases.
//
//        Sample Input 1:
//
//        1
//        2
//        3
//        3
//        2
//        1
//        Sample Output 1:
//
//        Boxes are equal
//        Sample Input 2:
//
//        2
//        2
//        3
//        3
//        2
//        1
//        Sample Output 2:
//
//        The first box is larger than the second one

public class TwoBoxes {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int a = Integer.parseInt(scanner.nextLine());
    int b = Integer.parseInt(scanner.nextLine());
    int c = Integer.parseInt(scanner.nextLine());
    int x = Integer.parseInt(scanner.nextLine());
    int y = Integer.parseInt(scanner.nextLine());
    int z = Integer.parseInt(scanner.nextLine());

    if ( (a==x&&b==y&&c==z) || (a==y&&b==x&&c==z) || (a==z&&b==x&&c==y) ||
            (a==y&&b==z&&c==x) || (a==z&&b==y&&c==x) || (a==x&&b==z&&c==y) ) {
      System.out.println("Boxes are equal");
    }
    else if ( (a<x&&b<=y&&c<=z) || (a<x&&b<=z&&c<=y) || (a<y&&b<=x&&c<=z) || (a<y&&b<=z&&c<=x) || (a<z&&b<=x&&c<=y) || (a<z&&b<=y&&c<=x) ||
            (a<=x&&b<y&&c<=z) || (a<=z&&b<y&&c<=x) || (a<=y&&b<x&&c<=z) || (a<=z&&b<x&&c<=y) || (a<=x&&b<z&&c<=y) || (a<=y&&b<z&&c<=x) ||
            (a<=x&&b<=y&&c<z) || (a<=y&&b<=x&&c<z) || (a<=y&&b<=z&&c<x) || (a<=z&&b<=y&&c<x) || (a<=x&&b<=z&&c<y) || (a<=z&&b<=x&&c<y)) {
      System.out.println("The first box is smaller than the second one");
    }else if ((a>x&&b>=y&&c>=z) || (a>x&&b>=z&&c>=y) || (a>y&&b>=x&&c>=z) || (a>y&&b>=z&&c>=x) || (a>z&&b>=x&&c>=y) || (a>z&&b>=y&&c>=x) ||
            (a>=x&&b>y&&c>=z) || (a>=z&&b>y&&c>=x) || (a>=y&&b>x&&c>=z) || (a>=z&&b>x&&c>=y) || (a>=x&&b>z&&c>=y) || (a>=y&&b>z&&c>=x) ||
            (a>=x&&b>=y&&c>z) || (a>=y&&b>=x&&c>z) || (a>=y&&b>=z&&c>x) || (a>=z&&b>=y&&c>x) || (a>=x&&b>=z&&c>y) || (a>=z&&b>=x&&c>y) ) {
      System.out.println("The first box is larger than the second one");
    }else
      System.out.println("Boxes are incomparable");
  }
}
