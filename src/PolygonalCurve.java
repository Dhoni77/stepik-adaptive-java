import java.util.Comparator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

//Given N points on the plane. Find the (N-1)-components not self-intersecting open polygonal curve, passing through all these points.
//
//        Construct the polygonal curve in the order of increasing x-coordinate. If there are two points with the same x-coordinate, position earlier that point, which has the smaller y-coordinate.
//
//        Use heapsort to sort the points.
//
//        Sample Input:
//        4
//        0 0
//        1 1
//        1 0
//        0 1
//        Sample Output:
//        0 0
//        0 1
//        1 0
//        1 1

public class PolygonalCurve {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = Integer.parseInt(scanner.nextLine());
    class Coordinates {
      int x;
      int y;

      public int getX() {
        return x;
      }

      public int getY() {
        return y;
      }

      public Coordinates(int x, int y) {
        this.x = x;
        this.y = y;
      }

      @Override
      public String toString() {
        return x + " " + y;
      }
    }
    Set<Coordinates> queue = new TreeSet<>(Comparator.comparing(Coordinates::getX).thenComparing(Coordinates::getY));

    for (int i =0; i < n; i++) {
      String line = scanner.nextLine().trim();
      queue.add(new Coordinates(Integer.parseInt(line.split(" ")[0]), Integer.parseInt(line.split(" ")[1])));
    }
    queue.forEach(x->System.out.println(x.toString()));// put your code here
  }
}
