import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Spliterator;

//On spliteratorWork( List<Double> lst ):
//        -using Spliterator add to List<Double> sqrts all square roots of items from lst ,if this item greater than 1
//        -use Math.sqrt(number) to find square root : Math.sqrt(4)-> 2.0
//        On print(List<Double> list):
//        -get spliterator() of given list
//        -divide spliterator into 2 parts ( use spliterator.trySplit())
//        -print all items which >=2 from first part (use .println())
//        -print empty string
//        -print all items which >=10 from second part (use .println())
//        *! remember when you use trySplit() method :
//        List<Integer> lst = new ArrayList<>(Arrays.asList(1,1,1,2,2,2,2));
//        Spliterator<Integer> split = lst.spliterator();
//        split.trySplit()...//-> 1 1 1 (its your first path of spliterator)
//        split...//2 2 2 2 (now split contains of second path)
//        Sample Input 1:
//
//        4 4 4 100 100 100
//        Sample Output 1:
//
//        2.0
//        2.0
//        2.0
//
//        10.0
//        10.0
//        10.0
//        Sample Input 2:
//
//        1 4 8 16 99 100 110 121
//        Sample Output 2:
//
//        2.0
//        2.8284271247461903
//        4.0
//
//        10.0
//        10.488088481701515
//        11.0

public class SpliteratorUsage {
    public static List<Double> spliteratorWork(List<Double> lst){
        List<Double> sqrs = new ArrayList<>();
        Spliterator<Double> split = lst.spliterator();
        Spliterator<Double> first = split.trySplit();
        first.forEachRemaining(x->sqrs.add(Math.sqrt(x)));
        split.forEachRemaining(x->sqrs.add(Math.sqrt(x)));
        return sqrs;
    }
    public static void print(List<Double> list){
        Spliterator<Double> spliterator = list.spliterator();
        spliterator.trySplit().forEachRemaining(x->{
            if (x>=2) System.out.println(x);
        });
        System.out.println();
        spliterator.forEachRemaining(x->{
            if (x>=10) System.out.println(x);
        });
    }

    public static void main(String[] args) {
        print(spliteratorWork(Arrays.asList(4d, 4d, 4d, 100d, 100d, 100d)));
    }
}
