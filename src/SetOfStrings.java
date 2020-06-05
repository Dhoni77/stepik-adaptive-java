import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//Implement the data structure "set of strings" based on a dynamic hash table with open addressing. Stored strings are not empty and contain lowercase Latin letters. The initial size of the table should be equal to 8. Perform rehashing only in the case when the table-filling coefficient reaches 3/4.
//
//        The structure of the data should support the operation of adding a string to the set, deleting a string from the set and membership testing of this string to the set.
//
//        Use quadric probing to resolve collisions, i-th sample
//
//        g(k, i)=g(k, i-1) + i\;\; (mod\; m)g(k,i)=g(k,i−1)+i(modm), m - power of 2.
//
//        Each line of the input data sets one operation over the set. The record of the operation consists of the type of operation, a space, and a string, which is a subject for this operation.
//
//        Type of operation - one of the following three symbols:
//        + means adding this string to the set;
//        - means deleting this string from the set;
//        ? means membership testing of this string to the set.
//
//        When adding an element to the set IT IS NOT GUARANTEED that this element is not already present in the set. When deleting an element from the set IT IS NOT GUARANTEED that this element is present in this set.
//
//        For each of the operations the program should display one of the two lines OK or FAIL, depending on whether this word is found in our set.
//
//        Sample Input:
//
//        + hello
//        + bye
//        ? bye
//        + bye
//        - bye
//        ? bye
//        ? hello
//        Sample Output:
//
//        OK
//        OK
//        OK
//        FAIL
//        OK
//        FAIL
//        OK

public class SetOfStrings {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    List<String> list = new ArrayList<>();
    while (scanner.hasNextLine()) {
      list.add(scanner.nextLine());
    }

    List<String> table = new ArrayList<String>();
    for (String s : list) {
      String operation = s.split(" ")[0];
      String toAdd = s.split(" ")[1];
      switch (operation) {
        case "+":
          if (table.contains(toAdd)) {
            System.out.println("FAIL");
          } else {
            table.add(toAdd);
            System.out.println("OK");
          }
          break;
        case "-":
          if (!table.contains(toAdd)) {
            System.out.println("FAIL");
          } else {
            table.remove(toAdd);
            System.out.println("OK");
          }
          break;
        case "?":
          if (!table.contains(toAdd)) {
            System.out.println("FAIL");
          } else {
            System.out.println("OK");
          }
          break;
      }
    }
  }
}
