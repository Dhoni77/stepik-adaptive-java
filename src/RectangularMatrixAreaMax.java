import java.util.Scanner;

//Given rectangular array (matrix) MMx NN with integer elements. Find a rectangular area of this matrix, the sum of whose elements is maximum.
//
//        Input data
//
//        The first line contains the two natural numbers NN and MM (1 \le N, M \le 100)(1≤N,M≤100) – the number of rows and columns of the rectangular matrix. Next go NN lines with MM numbers each, separated by a space – the elements of the matrix, integers, not exceeding 100100 by absolute value.
//
//        Output data
//
//        Output a single integer – the sum of the elements of the found rectangular sub-matrix.
//
//        Sample Input:
//
//        2 3
//        1 -2 3
//        4 5 6
//        Sample Output:
//
//        17

public class RectangularMatrixAreaMax {
//    1 1 2 3 4 5 6
//    3 4 5 6 7 8 9
//    1 2 3 4 5 6 7
//    2 3 4 5 6 7 8

    private static int maxSumRectangle(int [][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int preSum[][] = new int[m+1][n];

        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                preSum[i+1][j] = preSum[i][j] + mat[i][j];
            }
        }

        int maxSum = -1;
        int minSum = Integer.MIN_VALUE;
        int negRow = 0, negCol = 0;
        int rStart = 0, rEnd = 0, cStart = 0, cEnd = 0;
        for(int rowStart = 0; rowStart < m; rowStart++) {
            for(int row = rowStart; row < m; row++){
                int sum = 0;
                int curColStart = 0;
                for(int col = 0; col < n; col++) {
                    sum += preSum[row+1][col] - preSum[rowStart][col];
                    if(sum < 0) {
                        if(minSum < sum) {
                            minSum = sum;
                            negRow = row;
                            negCol = col;
                        }
                        sum = 0;
                        curColStart = col+1;
                    }
                    else if(maxSum < sum) {
                        maxSum = sum;
                        rStart = rowStart;
                        rEnd = row;
                        cStart = curColStart;
                        cEnd = col;
                    }
                }
            }
        }
        return maxSum == -1 ? minSum : maxSum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        int n = Integer.parseInt(line.trim().split(" ")[0]);
        int m = Integer.parseInt(line.trim().split(" ")[1]);
        int[][] array = new int[n][m];
        for (int i = 0; i <n; i++) {
            line = scanner.nextLine();
            for(int j = 0; j <m; j++){
                array[i][j] = Integer.parseInt(line.trim().split(" ")[j]);
            }
        }
        System.out.println(maxSumRectangle(array));
    }
}
