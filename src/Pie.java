import java.util.Scanner;
import java.util.stream.IntStream;

//In the Bioinformatics Institute a competition is held between the computer science and biology students. The winners will get a large and tasty pie. The team of biology students consists of aa students, computer science team — bb students.
//
//        It is necessary to pre-cut the pie so that it would be possible to distribute the pieces of the pie to any team that won the competition, with each member of this team should get the same number of pieces of the pie. And since you do not want to cut the pie into the too many small pieces, you need to find the minimum suitable number.
//
//        Write a program, which helps to find this number.
//
//        The program gets the size of the teams (two positive integers aa and bb, each number is entered in a separate line) and should output the smallest number dd, which is divisible by both numbers without remainder.
//
//        Sample Input 1:
//
//        7
//        5
//        Sample Output 1:
//
//        35
//        Sample Input 2:
//
//        15
//        15
//        Sample Output 2:
//
//        15
//        Sample Input 3:
//
//        12
//        16
//        Sample Output 3:
//
//        48

public class Pie {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int a = scanner.nextInt();
    int b = scanner.nextInt();

    IntStream.range(1, Integer.MAX_VALUE)
            .filter(i -> Math.min(a, b) * i % Math.max(a, b) == 0)
            .findFirst()
            .ifPresent(i -> System.out.println(Math.min(a, b) * i)); // put your code here
  }
}
