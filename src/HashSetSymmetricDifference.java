import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

//Symmetrical difference
//        https://en.wikipedia.org/wiki/Symmetric_difference﻿
//
//        1.Find Symmetrical difference of sets on symDifference(Set<T> set1, Set<T> set2) and return it.
//        ﻿* For example ﻿sets:{1 2 3 4} {3 4 5 6} --> Symmetrical difference = ﻿{1 2 5 6}
//        ﻿
//        Sample Input:
//
//        3 14 16 5 13 2 20 10 6 9;2 4 6 8 10 12 14 16 18 20
//        Sample Output:
//
//        3
//        4
//        5
//        8
//        9
//        12
//        13
//        18

public class HashSetSymmetricDifference {

  public static Set<Integer> symDifference(Set<Integer> set1, Set<Integer> set2) {
    Set<Integer> set = new TreeSet<>();
    set.addAll(set1.stream()
            .filter(x -> !set2.contains(x))
            .collect(Collectors.toSet()));
    set.addAll(set2.stream()
            .filter(x -> !set1.contains(x))
            .collect(Collectors.toSet()));
    //Enter your code below
    return set;
  }
}
