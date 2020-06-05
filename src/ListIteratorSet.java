import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

//Given string as "JButton Button JMenu..." to stdin of your programm
//        1.Add all elements from this string to List<String>
//2.Next, using ListIterator remove all items not starting with J
// and items beginning with J replace with the same elements but without the J ,for example JFrame -> Frame
//        3.next, print all the remaining elements in reverse order(using .println())
//
//
//        Sample Input:
//
//        ImageButton JTextField JTextArea CheckBox JMenu
//        Sample Output:
//
//        Menu
//        TextArea
//        TextField

public class ListIteratorSet {
  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    List<String> list;
    list = new ArrayList<>(Arrays.asList(reader.readLine()
            .trim()
            .split(" ")));
//        list.removeIf(x->!x.substring(0,1).equals("J"));
    list=list.stream()
            .filter(x -> x.substring(0, 1)
                    .equals("J"))
            .map(x -> x.replaceFirst("J", "")).collect(Collectors.toList());
    Collections.reverse(list);
    list
            .forEach(System.out::println);
    //enter your code here

  }
}
