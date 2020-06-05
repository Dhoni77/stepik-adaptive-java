import java.util.Scanner;
import java.util.Arrays;

//Write a program that checks whether two given words are anagrams.
//
//        The program should output True in the case if entered words are anagrams, and False otherwise.
//
//        Input format:
//
//        Two words, each on a separate line. Words can only consist of Latin characters. Your solution should be case insensitive, i.e. characters' case should not affect the answer.
//
//        Sample Input 1:
//
//        silent
//        listen
//        Sample Output 1:
//
//        True
//        Sample Input 2:
//
//        AbaCa
//        AcaBa
//        Sample Output 2:
//
//        True
//        Sample Input 3:
//
//        abaca
//        acada
//        Sample Output 3:
//
//        False

public class Anagrams {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    char[] a = scanner.nextLine().toLowerCase().toCharArray();
    char[] b = scanner.nextLine().toLowerCase().toCharArray();
    Arrays.sort(a);
    Arrays.sort(b);

    if(Arrays.equals(a,b)) {
      System.out.println("True");
    }
    else
      System.out.println("False");// put your code here
  }
}
