import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.Stream;


/*
        В первой строке даны целое число n и массив A[1…n] из n различных натуральных
        чисел в порядке возрастания, во второй — целое число k и k натуральных чисел
        b1,…,bk. Для каждого i от 1 до k необходимо вывести индекс j, для которого
        A[j]=bi, или −1, если такого j нет.
         */

public class BinarySearch {
  public static void binarySearch(int[] array, int start, int end, int value) {
    int position;

    position = (start + end) / 2;

    while ((array[position]) != value && (start <= end)) {
      if (array[position] > value) {
        end = position - 1;
      } else {
        start = position + 1;
      }
      position = (start + end) / 2;
    }
    if (start <= end) {
      System.out.print(position + 1 + " ");
    } else
      System.out.print("-1 ");
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int[] array = Stream.of(scanner.nextLine()
            .trim()
            .split(" "))
            .skip(1)
            .mapToInt(Integer::parseInt)
            .sorted()
            .toArray();
    int[] array2 = Stream.of(scanner.nextLine()
            .trim()
            .split(" "))
            .skip(1)
            .mapToInt(Integer::parseInt)
            .toArray();

    IntStream.range(0, array2.length)
            .forEachOrdered(i -> binarySearch(array, 0, array.length - 1, array2[i]));
  }
}
