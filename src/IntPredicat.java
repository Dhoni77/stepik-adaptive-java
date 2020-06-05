import java.util.Arrays;
import java.util.List;
import java.util.function.IntPredicate;

public class IntPredicat {
    public static IntPredicate disjunctAll(List<IntPredicate> predicates) {
        return predicates == null ? value -> false : predicates.stream().reduce(value -> false, IntPredicate::or);
    }

    public static void main(String[] args) {

        IntPredicate one = x -> x % 2 == 0;
        IntPredicate two = y -> y - 3 > 0;
        List<IntPredicate> predList = Arrays.asList(one, two);

        System.out.println(disjunctAll(null).test(45));
        System.out.println(disjunctAll(predList).test(20));
    }
}
