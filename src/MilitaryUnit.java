import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.NavigableSet;
import java.util.Scanner;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

//In one military unit, it was decided to stand in a single line according to height. As the discipline was not the best feature of this unit, some soldiers were late, and some had to be excluded from the activity due to their dirty boots. Nevertheless, when soldiers left and arrived they had to stand according to their height - the tallest in the beginning, and the shortest - in the end. The chief warrant officer was responsible for the procedure and he noticed an interesting feature – all soldiers in this military units had the different height. Your task is to help him correctly arrange the soldiers, namely: for every arriving soldier you need to specify in front of which soldier he has to stand. You need to find it within O(\log n)O(logn) time.
//
//        Input data format.
//
//        The first line contains number N – the number of commands (1 ≤ N ≤ 30 000). Each of the next lines contains the description of the command: the number 1 and X if the soldier stands into the line (X – the height of the soldiers, a natural number up to 100 000 inclusive) or the number 2 and Y if the soldier, standing on the Y place in the line, needs to be removed from this single line. Soldiers in the line are numbered from zero.
//
//        Output data format.
//
//        For each command 1 (add to the line) you need to output the number K – the position, where this soldier has to stand (all soldiers standing behind him, have to move back).
//        Sample Input:
//
//        5
//        1 100
//        1 200
//        1 50
//        2 1
//        1 150
//        Sample Output:
//
//        0 0 2 1

public class MilitaryUnit {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = Integer.parseInt(scanner.nextLine());
    List<String> list = IntStream.range(0, n)
            .mapToObj(i -> scanner.nextLine())
            .collect(Collectors.toList());

    NavigableSet<Integer> units = new TreeSet<>(Collections.reverseOrder());
    for (String s : list) {
      int position = Integer.parseInt(s.split(" ")[0]);
      int heightOrPosition = Integer.parseInt(s.split(" ")[1]);
      if (position == 1) {
        units.add(heightOrPosition);
        System.out.print(new ArrayList<>(units).indexOf(heightOrPosition) + " ");
      }
      if (position == 2) {
        units.remove(new ArrayList<>(units).get(heightOrPosition));
      }
    }
  }
}
