import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;
import java.util.stream.Collectors;

//Additional code
//        1.Using ListIterator iterate over the elements of list from the beginning to the end and after each word "Hip" add "Hop"
//        2.Using ListIterator print the all elements(using .println())
//
//        Sample Input:
//
//        Iterator Hip Hoi Hap Iterator Hip Hi
//        Sample Output:
//
//        Iterator
//        Hip
//        Hop
//        Hoi
//        Hap
//        Iterator
//        Hip
//        Hop
//        Hi

public class ListIteratorAddOutput {

  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    List<String> list = Arrays.stream(reader.readLine().split("\\s")).collect(Collectors.toList());
    ListIterator<String> listIterator = list.listIterator();

    while(listIterator.hasNext()) {
      String line = listIterator.next();
      System.out.println(line);
      if (line.equals("Hip")) {
        if (listIterator.hasNext()&&!listIterator.next().equals("Hop")) {
          listIterator.previous();
          listIterator.add("Hop");
          listIterator.previous();
        }
        else {
          listIterator.add("Hop");
          listIterator.previous();
        }
      }
    }
    //paste your code here
  }
}
