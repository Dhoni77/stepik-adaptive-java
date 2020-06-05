import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//Additional code,Soldier!
//        Given one input string as "1 2 3 4 5;6 7 8 9 10;11 12 13 14 15"(it's 3 lists)
//        1.String[] sets consists of these lists. Add all elements from each list to correct set(see the comments in the code) sets[0] = {"1 2 3 4 5"} - its string and so on
//        *use split(" ") to separate elements from string
//        2.On unionTreeLargeNumber(Set<Integer> set1,Set<Integer> set2,Set<Integer> set3):
//        1)In each Set find the maximum element
//        2)create TreeSet, add the resulting elements to TreeSet
//        3)return this TreeSet with elements sorted in descending order:
//                  *you can use special method from class TreeSet or rather NavigableSet interface to change the order of storage on the reverse
//3.Using System.out.println() print elements of resultTreeSet
//        Sample Input:
//
//        6 11 9 18 10;12 13 19 8 16;3 4 5 15 20
//        Sample Output:
//
//        20
//        19
//        18

public class TreeSetFromSeveralToOne {
  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    String[] sets = reader.readLine().split(";");

    Set<Integer> set1=new TreeSet<>();
    set1.addAll(Stream.of(sets[0].split(" ")).mapToInt(Integer::parseInt).boxed().collect(Collectors.toSet()));

    //your code(add elements to set1 from sets[0])

    Set<Integer> set2=new TreeSet<>();
    set2.addAll(Stream.of(sets[1].split(" ")).mapToInt(Integer::parseInt).boxed().collect(Collectors.toSet()));
    //your code(add elements to set2 from sets[1])

    Set<Integer> set3=new TreeSet<>();
    set3.addAll(Stream.of(sets[2].split(" ")).mapToInt(Integer::parseInt).boxed().collect(Collectors.toSet()));

    //your code(add elements to set3 from sets[2])


    Set<Integer> resultTreeSet = unionTreeLargeNumber(set1,set2,set3);
    resultTreeSet.forEach(System.out::println);

  }

  public static TreeSet<Integer> unionTreeLargeNumber(Set<Integer> set1,Set<Integer> set2,Set<Integer> set3){
    TreeSet<Integer> resultSet = new TreeSet<>(Collections.reverseOrder());
    resultSet.add(set1.stream().mapToInt(Integer::intValue).max().getAsInt());
    resultSet.add(set2.stream().mapToInt(Integer::intValue).max().getAsInt());
    resultSet.add(set3.stream().mapToInt(Integer::intValue).max().getAsInt());
    return resultSet;
  }
}
