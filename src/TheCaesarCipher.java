import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

//The Caesar cipher is to replace each character of the input string to the symbol, located several positions to the left or right of it in the alphabet.
//
//        The shift is the same for all symbols. The shift the cyclical, i.e. if the single right shift is applied to the last alphabet character, it will be replaced by the first character (and vice versa for the single left shift).
//
//        Write a program, which encodes the text by the Caesar cipher.
//
//        The alphabet contains space and all lowercase letters of the Latin alphabet: 'abcdefghijklmnopqrstuvwxyz'
//
//        Input format:
//        The first line contains the encryption cypher: a positive number corresponds to the shift to the right, negative – to the left. The second line contains the non-empty encryption phrase. Leading and ending spaces should not be considered.
//
//        Output format:
//        Single line with a phrase: Result: "..." , where the encrypted sequence is written inside the quotation marks instead of three dots.
//
//        Sample Input 1:
//
//        3
//        i am caesar
//        Sample Output 1:
//
//        Result: "lcdpcfdhvdu"
//        Sample Input 2:
//
//        -2
//        az
//        Sample Output 2:
//
//        Result: "zx"
//        Sample Input 3:
//
//        27
//        abc
//        Sample Output 3:
//
//        Result: "abc"

public class TheCaesarCipher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String line = scanner.nextLine().trim();
        Character[] alfabet = new Character[]{' ','a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        List<Character> list = Arrays.asList(alfabet);
        StringBuilder sb = new StringBuilder();
        for (Character s : line.toCharArray()){
            if (list.contains(s)) {
                if (Math.abs(n)>list.size())n=n%list.size();
                if (list.indexOf(s)+n<list.size()&&list.indexOf(s)+n>=0) {
                    sb.append(list.get(list.indexOf(s)+n));
                }
                else if(list.indexOf(s)+n>=list.size()){
                    sb.append(list.get(list.indexOf(s)+n-list.size()));
                }
                else
                    sb.append(list.get(list.size()+list.indexOf(s)+n));
            }
        }
        System.out.print("Result: \""+sb+"\"");
    }
}
