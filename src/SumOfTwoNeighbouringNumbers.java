import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//Write a program the input of which is the list of numbers in one line. For each elements of this list, the program should output the sum of its two neighbouring numbers. For list item that is first or last, an element from the opposite end of the list is considered in place of a missing neighbour. For example, if the input list is "1 3 5 6 10", the expected output list is "13 6 9 15 7" (without quotation marks).
//
//        If only one number serves as input, the output shall display the same one number.
//
//        The output must contain one line with the numbers from the new list, separated by space.
//
//        Sample Input 1:
//
//        1 3 5 6 10
//        Sample Output 1:
//
//        13 6 9 15 7
//        Sample Input 2:
//
//        10
//        Sample Output 2:
//
//        10

public class SumOfTwoNeighbouringNumbers {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    List<Integer> list = Stream.of(scanner.nextLine()
            .trim()
            .split(" "))
            .mapToInt(Integer::parseInt)
            .boxed()
            .collect(Collectors.toList());
    if (list.size()==1) {
      System.out.println(list.get(0));
    }
    else {
      StringBuilder sb = new StringBuilder();
      for (int i=0 ;i<list.size();i++) {
        int firstIndex=0;
        int lastIndex=0;
        if (i==0){
          firstIndex=list.get(list.size()-1);
          lastIndex=list.get(i+1);
        }
        else if (i==list.size()-1) {
          firstIndex = list.get(i - 1);
          lastIndex = list.get(0);
        }
        else {
          firstIndex=list.get(i-1);
          lastIndex=list.get(i+1);
        }
        System.out.print(firstIndex+lastIndex+" ");
      }
    }
  }
}
