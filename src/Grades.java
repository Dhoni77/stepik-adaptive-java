import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

//Find the number of "Ds", "Cs", "Bs" and "As" for the last test on informatics in the class consisting of n students. The program gets number n as input, and then gets the grades themselves (one by one). The program should output four numbers in a single line - the number of "D", the number of "C", the number of "B" and the number of "A" grades.
//
//        Sample Input:
//
//        10
//        2
//        5
//        4
//        3
//        2
//        4
//        5
//        4
//        4
//        5
//        Sample Output:
//
//        2 1 4 3

public class Grades {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = Integer.parseInt(scanner.nextLine());
    List<Integer> list = IntStream.range(0,n)
            .mapToObj(i->scanner.nextLine().trim())
            .map(Integer::parseInt).collect(Collectors.toList());

    System.out.println(list.stream().filter(x->x==2).count()+" "+
            list.stream().filter(x->x==3).count()+" "+
            list.stream().filter(x->x==4).count()+" "+
            list.stream().filter(x->x==5).count()); // put your code here
  }
}
