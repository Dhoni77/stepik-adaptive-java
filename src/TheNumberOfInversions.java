import java.util.Arrays;
import java.util.Scanner;

//The number of inversions
//
//        First line contains number 1 \le n \le 10^51≤n≤10
//        5
//        , second one — array A[1\ldots n]A[1…n], containing natural numbers not greater than 10^910
//        9
//        . You need to calculate the number of pairs of indices 1 \le i \lt j \le n1≤i<j≤n, for which A[i] \gt A[j]A[i]>A[j]. (Such pair of elements is called the inversion. The number of inversion in the array is in some way its measure of random nature: for example, there are no inversions at all in an array arranged in a nondecreasing order, and in an array, arranged in descending order, each two elements form an inversion.)
//
//        Sample Input:
//
//        5
//        2 3 9 2 9
//        Sample Output:
//
//        2

public class TheNumberOfInversions {

  private static long mergeAndCount(int[] arr, int l, int m, int r)
  {

    // Left subarray
    int[] left = Arrays.copyOfRange(arr, l, m + 1);

    // Right subarray
    int[] right = Arrays.copyOfRange(arr, m + 1, r + 1);

    int i = 0, j = 0, k = l;
    long swaps = 0;

    while (i < left.length && j < right.length) {
      if (left[i] <= right[j])
        arr[k++] = left[i++];
      else {
        arr[k++] = right[j++];
        swaps += (m + 1) - (l + i);
      }
    }

    // Fill from the rest of the left subarray
    while (i < left.length)
      arr[k++] = left[i++];

    // Fill from the rest of the right subarray
    while (j < right.length)
      arr[k++] = right[j++];

    return swaps;
  }

  // Merge sort function
  private static long mergeSortAndCount(int[] arr, int l, int r)
  {

    // Keeps track of the inversion count at a
    // particular node of the recursion tree
    long count = 0;

    if (l < r) {
      int m = (l + r) / 2;

      // Total inversion count = left subarray count
      // + right subarray count + merge count

      // Left subarray count
      count += mergeSortAndCount(arr, l, m);

      // Right subarray count
      count += mergeSortAndCount(arr, m + 1, r);

      // Merge count
      count += mergeAndCount(arr, l, m, r);
    }

    return count;
  }
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = Integer.parseInt(scanner.nextLine());
    String m = scanner.nextLine();
    int [] array = Arrays.stream(m.trim().split(" ")).mapToInt(Integer::parseInt).toArray();

    System.out.println(mergeSortAndCount(array, 0, n - 1));
  }

}
