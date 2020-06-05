import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//The input for this program are two sets. Each set in a separate line; elements of the set are space separated.
//        Your program must output the symmetric difference of these sets.
//        Example
//        Symmetric difference of the sets {1, 2, 3} and {0, 1, 2} equals to {0, 3}.
//        Sample Input:
//        1 2 3
//        0 1 2
//        Sample Output:
//        0 3

public class SymmetricDifferenceOfSets {
  public static <T> Set<T> symmetricDifference(final Set<T> setOne, final Set<T> setTwo) {
    Set<T> result = new HashSet<T>(setOne);
    for (T element : setTwo) {
      if (!result.add(element)) {
        result.remove(element);
      }
    }
    return result;
  }
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Set<Integer> set1= Stream.of(scanner.nextLine().trim().split(" ")).mapToInt(Integer::parseInt).boxed().collect(Collectors.toSet());
    Set<Integer> set2=Stream.of(scanner.nextLine().trim().split(" ")).mapToInt(Integer::parseInt).boxed().collect(Collectors.toSet());
    symmetricDifference(set1,set2).forEach(x->System.out.print(x+" "));
  }
}
