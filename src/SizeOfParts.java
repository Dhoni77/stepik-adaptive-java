import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

//A detector compares the size of parts produced by a machine with the reference standard.
//
//        If the size of the part is larger, it can be sent to be fixed, and the detector prints the number 1.
//        If the size of the part is smaller, it is removed as reject, and the detector prints the number -1.
//        If the part was made perfect, it is sent to the box with ready products, and the detector prints 0.
//
//        Write a program, which takes the number of parts n as input, and then the sequence of detector prints. The program should output numbers in a single line – the number of ready parts, the number of parts to be fixed, and the number of rejects.
//
//        Sample Input:
//
//        13
//        0
//        -1
//        1
//        -1
//        0
//        0
//        1
//        -1
//        -1
//        -1
//        -1
//        0
//        0
//        Sample Output:
//
//        5 2 6

public class SizeOfParts {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = Integer.parseInt(scanner.nextLine());

    List<Integer> list = IntStream.range(0, n)
            .mapToObj(i -> scanner.nextLine()
                    .trim())
            .map(Integer::parseInt)
            .collect(Collectors.toList());
    System.out.println(list.stream().filter(x->x==0).count()+" "+
            list.stream().filter(x->x==1).count()+" "+
            list.stream().filter(x->x==-1).count());// put your code here
  }
}
