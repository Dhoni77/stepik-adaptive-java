import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//Given string as "JButton Button JMenu..." to stdin of your programm
//
//        Add all elements from this string to List<String>
//Next, using Stream API remove all items not starting with J and items beginning with J replace with the same elements but without the J ,for example JFrame -> Frame
//        next, print all the remaining elements in reverse order(using .println())
//        *in the lesson ListIterator. set() it was necessary to perform the same logic ,but using ListIterator. You can compare these 2 solutions
//
//        Sample Input:
//
//        ImageButton JTextField JTextArea CheckBox JMenu
//        Sample Output:
//
//        Menu
//        TextArea
//        TextField

public class UsingStreamAPIWithCollections {
  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    List<String> list= Stream.of(reader.readLine().trim().split(" ")).map(String::valueOf).collect(Collectors.toList());
    list=list.stream().filter(x->x.substring(0,1).equals("J")).map(x->x.substring(1)).collect(Collectors.toList());
    Collections.reverse(list);
    list.forEach(System.out::println);
  }
}
