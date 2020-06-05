import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BInarySearch2 {
  //Advanced task

//Given the sorted array of various integers A[0..n-1] and the array of integers B[0..m-1]. For each of the element of the array B[i] find the minimum index of the array element A[k], nearest to B[i].
//
//        Search operation time for each element B[i] should be O(log(k)).
//
//        Hint. Please note that the time complexity should depend on the response index – k. To achieve this asymptotic behaviour try to find an interval in the form of
//                [2^p, 2^{p+1}][2p,2p+1] , containing the resulting point, and only after this perform a traditional binary search.

  public static int search(int value, int[] a) {

    if(value < a[0]) {
      return a[0];
    }
    if(value > a[a.length-1]) {
      return a[a.length-1];
    }

    int lo = 0;
    int hi = a.length - 1;

    while (lo <= hi) {
      int mid = (hi + lo) / 2;

      if (value < a[mid]) {
        hi = mid - 1;
      } else if (value > a[mid]) {
        lo = mid + 1;
      } else {
        return a[mid];
      }
    }
    // lo == hi + 1
    return (a[lo] - value) < (value - a[hi]) ? a[lo] : a[hi];
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int n = Integer.valueOf(scanner.nextLine());
    int[] array = Stream.of(scanner.nextLine().trim().split(" ")).mapToInt(Integer::parseInt).sorted().toArray();
    int m = Integer.valueOf(scanner.nextLine());
    int[] array2 = Stream.of(scanner.nextLine().trim().split(" ")).mapToInt(Integer::parseInt).toArray();

    List<Integer> list = Arrays.stream(array).boxed().collect(Collectors.toList());
    for (int i = 0; i < array2.length; i++) {
      System.out.print(list.indexOf(search(array2[i], array))+" ");
    }
  }
}
