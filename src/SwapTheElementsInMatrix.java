import java.util.*;

//Write a program, which inputs the rectangular matrix from a sequence of lines, ending with a line, containing the only word "end" (without the quotation marks).
//
//        The program should output the matrix of the same size, where each elements in the position (i, j) is equal to the sum of the elements from the first matrix on the positions (i-1, j), (i+1, j), (i, j-1), (i, j+1). Boundary elements have neighbours on the opposite side of the matrix. In the case with one row or column, the element itself maybe its neighbour.
//
//        Sample Input 1:
//
//        9 5 3
//        0 7 -1
//        -5 2 9
//        end
//        Sample Output 1:
//
//        3 21 22
//        10 6 19
//        20 16 -1
//        Sample Input 2:
//
//        1
//        end
//        Sample Output 2:
//
//        4

public class SwapTheElementsInMatrix {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    List<int[]> list = new ArrayList<>();
    String l = "";
    while(!(l=scanner.nextLine()).equals("end")) {
      int [] line = Arrays.stream(l.split(" ")).mapToInt(Integer::parseInt).toArray();
      list.add(line);
    }
    int[][] array = new int[list.size()][list.get(0).length];

    for (int i=0; i<array.length; i++) {
      for (int j=0; j<array[0].length; j++) {
        array[i][j] = list.get(i)[j];
      }
    }
    for (int i=0; i<array.length; i++) {
      for (int j=0; j<array[0].length; j++) {
        int a=i-1;
        int b=j-1;
        int c=i+1;
        int d=j+1;
        if (i==0) a=array.length-1;
        if (i==array.length-1) c=0;

        if (j==0) b=array[0].length-1;
        if (j==array[0].length-1) d=0;
        //(i-1, j), (i+1, j), (i, j-1), (i, j+1)
        System.out.print(array[a][j]+array[c][j]+array[i][b]+array[i][d]+" ");
      }
      System.out.println(" ");
    }
  }
}
