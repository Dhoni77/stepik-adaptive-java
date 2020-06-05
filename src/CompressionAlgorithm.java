import java.util.*;

//Upon learning that DNA is not a random string, freshmen of the Bioinformatics Institute from the informatics group suggested using a compression algorithm that compresses repeated characters in a string.
//
//        Encoding is performed as follows:
//        s = 'aaaabbсaa' is converted into 'a4b2с1a2', that is, the groups of the same characters of the input string are replaced by the symbol and the number of its repetitions in this string.
//
//        Write a program, which reads the string, encodes it by this algorithm and outputs the encoded sequence. Encoding must be case sensitive.
//
//        Sample Input 1:
//
//        aaaabbcaa
//        Sample Output 1:
//
//        a4b2c1a2
//        Sample Input 2:
//
//        abc
//        Sample Output 2:
//
//        a1b1c1

public class CompressionAlgorithm {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    char[] n = scanner.nextLine().toCharArray();;
    int counter = 1;
    for (int i = 0; i < n.length; i++) {
      char temp = n[i];
      if (n.length > (i + 1)) {
        if (n[i] == n[i + 1]) {
          counter++;
        }
        else {
          System.out.print(temp + "" + counter);
          counter = 1;
        }
      }
      else {
        System.out.print(temp + "" + counter);
        counter = 1;
      }
    }
  }
}
