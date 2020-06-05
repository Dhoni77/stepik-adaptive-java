import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//Cyclically shift the elements of the list to the right (A[0] goes to the place of A[1], A[1] - to the place of A[2], ..., and the last element goes to the place of A[0]).
//
//        Input data format
//
//        The first line of the input contains the number of elements in the array. The second line – the elements of the array.
//
//        Sample Input:
//
//        5
//        1 2 3 4 5
//        Sample Output:
//
//        5 1 2 3 4

public class CyclicallyShift {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = Integer.parseInt(scanner.nextLine());
    List<Integer> list = Stream.of(scanner.nextLine()
            .trim()
            .split(" "))
            .mapToInt(Integer::parseInt)
            .boxed()
            .collect(Collectors.toList());
    list.add(0, list.get(list.size()-1));
    list.remove(list.size()-1);
    list.forEach(x->System.out.print(x+" "));
  }
}
