import java.util.*;

public class kCombinationsOfNElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        int n = Integer.parseInt(line.trim().split(" ")[0]);
        int k = Integer.parseInt(line.trim().split(" ")[1]);
        List<int[]> combinations = generate(k, n);
        for (int[] combination : combinations) {
            Arrays.stream(combination).forEach(x->System.out.print(x+" "));
            System.out.println();
        }
    }
    private static void helper(List<int[]> combinations, int data[], int start, int end, int index) {
        if (index == data.length) {
            int[] combination = data.clone();
            combinations.add(combination);
        } else if (start <= end) {
            data[index] = start;
            helper(combinations, data, start + 1, end, index + 1);
            helper(combinations, data, start + 1, end, index);
        }
    }
    public static List<int[]> generate(int n, int r) {
        List<int[]> combinations = new ArrayList<>();
        helper(combinations, new int[r], 0, n-1, 0);
        return combinations;
    }
}

