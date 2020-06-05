import java.util.*;
import java.util.stream.Stream;

public class LongestIncSubsequenceTab {
    private static int[] longestIncSubsequenceTab(int[] arr) {
        if (arr.length == 1) return arr;
        else {
            int[] lis = new int[arr.length];
            String[] pathLIS = new String[arr.length];

            lis[0] = 1;
            pathLIS[0] = "" + arr[0];

            int maxLength = Integer.MIN_VALUE;
            String longestSubs = "";

            for (int i = 1; i < arr.length; i++) {
                for (int j = 0; j <= i - 1; j++) {
                    // only those elements may participate that are smaller than this element
                    if (arr[j] < arr[i]) { // are you valid ?
                        if (lis[j] > lis[i]) {  // are you longer ?
                            lis[i] = lis[j]; // if yes, update myself, with your values
                            pathLIS[i] = pathLIS[j]; // and my path
                        }
                    }
                }
                // the inner loop finds the largest subsequence BEFORE i, so now we add 1 to its length and current val to path
                lis[i] = lis[i] + 1;
                pathLIS[i] = pathLIS[i] + " " + arr[i];

                if (lis[i] > maxLength) {
                    maxLength = lis[i];
                    longestSubs = pathLIS[i];
                }
            }
            return Stream.of(longestSubs.trim()
                    .split(" "))
                    .filter(s -> s.matches("[0-9]+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        int[] array = Stream.of(line.trim()
                .split(" "))
                .filter(s -> s.matches("[0-9]+"))
                .mapToInt(Integer::parseInt)
                .toArray();
        Arrays.stream(longestIncSubsequenceTab(array))
                .forEach(x -> System.out.print(x + " "));
    }
}
