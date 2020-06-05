import java.util.*;
import java.util.stream.Stream;

public class TheLargestConsecutiveDivisibleSubsequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int[] array = Stream.of(scanner.nextLine()
                .trim()
                .split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        System.out.println(findLargest(array));
    }

    static int findLargest(int[] arr) {
        List<Integer> list = new ArrayList<>();
        // array that maintains the maximum index
        // till which the condition is satisfied
        int divCount[] = new int[arr.length];

        // we will always have atleast one
        // element divisible by itself
        Arrays.fill(divCount, 1);

        // maintain the index of the last increment
        int prev[] = new int[arr.length];
        Arrays.fill(prev, -1);

        // index at which last increment happened
        int max_ind = 0;

        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < i; j++) {

                // only increment the maximum index if
                // this iteration will increase it
                if (arr[i] % arr[j] == 0 &&
                        divCount[i] < divCount[j] + 1) {
                    prev[i] = j;
                    divCount[i] = divCount[j] + 1;
                }

            }
            // Update last index of largest subset if size
            // of current subset is more.
            if (divCount[i] > divCount[max_ind])
                max_ind = i;
        }

        // Print result
        int k = max_ind;
        while (k >= 0) {
//            System.out.print(arr[k] + " ");
            list.add(k);
            k = prev[k];
        }
        return list.size();
    }
}
