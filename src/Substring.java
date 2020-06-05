import java.util.*;

//Write a program that finds all occurrences of the given substring in the string.
//
//        Input format:
//        The first line of input contains the original string, the second line contains the substring, the positions of which you should find. The lines consist of Latin characters only.
//
//        Output format:
//        A single line with the indices (indexing starts with zero) of the occurrences of the given substring in the string, separated by a space, or number -1 when the substring is absent.
//
//        Sample Input 1:
//
//        abacabadaba
//        aba
//        Sample Output 1:
//
//        0 4 8
//        Sample Input 2:
//
//        aaaa
//        aa
//        Sample Output 2:
//
//        0 1 2
//        Sample Input 3:
//
//        abc
//        d
//        Sample Output 3:
//
//        -1

public class Substring {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String n = scanner.nextLine();
    String m = scanner.nextLine();

    int count = 0;
    int first = 0;
    boolean isUpsent = true;
    for (int i = 0; i <n.toCharArray().length; i++) {
      int a=i;
      if (n.toCharArray()[i]==m.toCharArray()[0]) {
        first=i;
        for (int j = 0; j<m.toCharArray().length&i<n.toCharArray().length; j++,i++) {
          if (m.toCharArray()[j]==n.toCharArray()[i]) {
            count++;
          }
          if (count==m.toCharArray().length) {
            System.out.print(first+" ");
            isUpsent=false;
          }
        }
        count=0;
        i=a;
      }
    }
    if (isUpsent) System.out.println(-1);
  }
}
