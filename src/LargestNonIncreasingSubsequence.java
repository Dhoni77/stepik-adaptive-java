import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class LargestNonIncreasingSubsequence {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Integer[] list = Stream.of(scanner.nextLine()
                .trim()
                .split(" "))
                .map(Integer::parseInt)
                .toArray(Integer[]::new);
        printResult(findNonIncreasing(list));
    }


    private static void printResult(int[] result) {
        System.out.println(result.length);
        StringBuilder sb = new StringBuilder();
        for (int elem :
                result) {
            sb.append(elem);
            sb.append(" ");
        }
        System.out.println(sb);
    }

    private static int[] findNonIncreasing(Integer[] arrToSearch) {
        int[] dyn = new int[arrToSearch.length + 1];
        Arrays.fill(dyn, Integer.MIN_VALUE);
        dyn[0] = Integer.MAX_VALUE;
        int[] posOfTails = new int[arrToSearch.length + 1];
        int[] ancestors = new int[arrToSearch.length];


        for (int i = 0; i < arrToSearch.length; i++) {
            int j = getFirstLess(dyn, arrToSearch[i]);
            dyn[j] = arrToSearch[i];
            posOfTails[j] = i;
            ancestors[i] = posOfTails[j - 1];
        }

        int length = dyn.length - 1;
        for (; length >= 0; length--) {
            if (dyn[length] > Integer.MIN_VALUE) break;
        }
        int minIndex = posOfTails[length];

        int[] result = new int[length];
        for (int i = result.length - 1; i >= 0; i--) {
            result[i] = minIndex + 1;
            minIndex = ancestors[minIndex];
        }
        return result;
    }

    private static int getFirstLess(int[] arr, Integer value) {
        int l = 0;
        int r = arr.length - 1;
        while (l < r) {
            int m = (l + r) / 2;
            if (arr[m] >= value) {
                l = m + 1;
            } else {
                r = m;
            }
        }
        return l;
    }
}
