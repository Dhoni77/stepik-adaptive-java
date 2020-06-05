import java.util.*;

//At some point in the Bioinformatics Institute biology students no longer understood what did the computer science students said: they spoke a strange set of sounds.
//
//        And one of the biologists had suddenly discovered the secret of computer science students: they used the substitution cipher in their communication, i.e. they replaced each symbol of the initial message to the corresponding other symbol. Biologists gained the key to the cipher and now they need help:
//
//        Write a program that can encode and decode the substitution cipher. The program accepts two input strings of the same length; the first line contains the characters of the original alphabet, the second line - the symbols of a resulting alphabet, then goes a line you need to encode by the transmitted key, and another line to be decrypted.
//
//        For example, the program takes the following input:
//        abcd
//        *d%#
//        abacabadaba
//        #*%*d*%
//        It means that symbol a of the initial message is changed to symbol * in the cipher, b changed to d, c — to% and d — to #. You need to encode the string abacabadaba and decode the string #*%*d*% using this cipher. So you get the following lines, which you should be the output of the program:
//
//        *d*%*d*#*d*
//        dacabac
//        Sample Input 1:
//
//        abcd
//        *d%#
//        abacabadaba
//        #*%*d*%
//        Sample Output 1:
//
//        *d*%*d*#*d*
//        dacabac
//        Sample Input 2:
//
//        dcba
//        badc
//        dcba
//        badc
//        Sample Output 2:
//
//        badc
//        dcba

public class SubstitutionCipher {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    char[] a = scanner.nextLine().toCharArray();;
    char[] b = scanner.nextLine().toCharArray();;
    Map<Character, Character> mapDecode = new HashMap<>();
    Map<Character, Character> mapEncode = new HashMap<>();
    for (int i = 0; i < a.length; i++) {
      mapDecode.put(a[i], b[i]);
      mapEncode.put(b[i], a[i]);
    }

    char[] c = scanner.nextLine().toCharArray();;
    char[] d = scanner.nextLine().toCharArray();;

    StringBuilder a1 = new StringBuilder();
    StringBuilder a2 = new StringBuilder();
    for (int i = 0; i <c.length; i++) {
      a1.append(mapDecode.get(c[i]));
    }
    for (int i = 0; i <d.length; i++) {
      a2.append(mapEncode.get(d[i]));
    }

    System.out.println(a1);
    System.out.println(a2);// put your code here
  }
}
