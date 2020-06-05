import java.io.IOException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.IntBinaryOperator;
import java.util.function.IntUnaryOperator;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

import static java.lang.Math.pow;


public class Main {

  public static IntBinaryOperator sumF(IntUnaryOperator f) {
    return (a, b) -> f.applyAsInt(a) + f.applyAsInt(b);
  }

  public static final List<Integer> getNaturalNumbersWhichAreSummaryOfInput(int n) {
    List<Integer> list = new ArrayList<>();

    int total = 0;
    int increment = 1;
    int count = 0;
    while (total + increment <= n) {
      total = total + increment;
      list.add(increment);
      increment = increment + 1;
      count = count + 1;
    }
    list.set(count - 1, list.get(count - 1) + n - total);
    return list;
  }

  public static BigInteger calcBigIntegerFactorial(int n) {
    if (n == 0) return BigInteger.ONE;
    return BigInteger.valueOf(n)
            .multiply(calcBigIntegerFactorial(n - 1));
    // type your java code here
  }

  public static long factorial(long n) {
    if (n == 0) return 1;
    else
      return LongStream.range(1, n + 1)
              .reduce(1, (a, b) -> a * b);// write your code here
  }

  public static float f(float x) {
    if (x <= -2) {
      return (float) (1 - pow(x + 2, 2));
    } else if (-2 < x && x <= 2) {
      return -(x / 2);
    } else
      return (float) (pow(x - 2, 2)) + 1;
  }

  static int countWaysUtil(int n, int m) {
    if (n <= 1)
      return n;
    int res = 0;
    for (int i = 1; i <= m && i <= n; i++)
      res += countWaysUtil(n - i, m);
    return res;
  }

  // Returns number of ways to reach s'th stair
  static int countWays(int s, int m) {
    return countWaysUtil(s + 1, m);
  }

  public static LongStream createPrimesFilteringStream(long rangeBegin, long rangeEnd) {
    return LongStream.rangeClosed(rangeBegin, rangeEnd)
            .parallel()
            .filter(x -> x < 10);
  }

  public static TreeSet<Integer> unionTreeLargeNumber(Set<Integer> set1, Set<Integer> set2, Set<Integer> set3) {
    TreeSet<Integer> resultSet = new TreeSet<>(Collections.reverseOrder());
    resultSet.add(set1.stream()
            .mapToInt(Integer::intValue)
            .max()
            .getAsInt());
    resultSet.add(set2.stream()
            .mapToInt(Integer::intValue)
            .max()
            .getAsInt());
    resultSet.add(set3.stream()
            .mapToInt(Integer::intValue)
            .max()
            .getAsInt());
    return resultSet;
  }

  public void getMaxMapKeyValue(Map map) {
//    System.out.println(Collections.max(map.entrySet(), Comparator.comparingInt(Map.Entry::getValue)).getKey());
  }

  public static IntStream createFilteringStream(IntStream evenStream, IntStream oddStream) {
    return IntStream.concat(evenStream.filter(i -> i % 3 == 0 && i % 5 == 0)
                    .sorted(),
            oddStream.filter(i -> i % 3 == 0 && i % 5 == 0)
                    .sorted()).sorted().skip(2);// write your stream here
  }

  static public final void main(String[] args) throws IOException {
        int v = Arrays.asList(1,2,3,4,5).parallelStream().reduce(Math::max).get();
  }
}