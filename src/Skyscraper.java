import java.util.Scanner;

//The skyscraper has n floors. It is known that if you drop the glass ball from the floor p and it breaks, if you drop it from the floor p+1 it will also break. It is also known that the ball always breaks if you drop it from the last floor. You need to determine the minimum floor number, falling from which the ball will break. You have two balls to perform the experiment. You can break them both, but you need to provide the exact correct number after that.
//
//        Find out what number of throws is enough to solve this task.
//
//
//        Input data format
//        Program gets the number of floors in the skyscraper.
//
//        Output data format
//        You need to output the smallest amount of throws, using which you can always solve this task.
//
//        Note                                                       Comment to the first example. You need to drop a ball from the second floor. If it breaks, we drop the second ball from the first floor; if it does not break - we drop the ball from the third floor.
//
//        Hints
//        1. How should you act if there was only one ball?
//        2. Let there be two balls and we dropped one of the balls from the floor k. How we act depending on whether a ball is broken or not?
//        3. Let f(n) be the minimum amount of throws, enough to find out the needed floor, if the skyscraper has n floors. Express f(n) through the values f(a) for the smaller values of a.
//
//        Sample Input 1:
//
//        4
//        Sample Output 1:
//
//        2
//        Sample Input 2:
//
//        5
//        Sample Output 2:
//
//        3

class Skyscraper {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println(solve(in.nextInt() - 1, 0, 1));
    in.close();
  }

  private static long solve(int remains, int res, int step) {
    if (remains < 1) {
      return res;
    } else {
      return solve(remains - step, res + 1, step + 1);
    }
  }
}
