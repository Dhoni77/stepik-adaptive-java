import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamConcatUse {
    public static Set<Integer> symDifference(Set<Integer> set1, Set<Integer> set2){
        return Stream.concat(set1.stream(), set2.stream())
                .filter(n -> !(set1.contains(n) && set2.contains(n)))
                .collect(Collectors.toSet());
    }

    public static Set<Integer> symDifference2(Set<Integer> set1, Set<Integer> set2){
        return Stream.of(set1, set2)
                .flatMap(Collection::stream)
                .filter(v -> !(set1.contains(v) && set2.contains(v)))
                .collect(Collectors.toSet());
    }

    public static Set<Integer> symDifference3(Set<Integer> set1, Set<Integer> set2){
        // find union
        Set<Integer> set3 = new HashSet<>(set1);
        set3.addAll(set2);
        // find intersection
        set1.retainAll(set2);
        // remove intersection from union
        set3.removeAll(set1);

        return set3;
    }

    public static void main(String[] args) {

    }
}
