import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TwolettersZ {
//  Given a sequence of lines.
//
//  Output the lines, containing two letters "z" between which there are exactly three characters.
//
//  Sample Input:
//  zabcz
//  zzz
//  zzxzz
//  zz
//  zxz
//  zzxzxxz
//  Sample Output:
//  zabcz
//  zzxzz
public static void main(String[] args) {
  Scanner scanner = new Scanner(System.in);
  List<String> list = new ArrayList<>();
  while(scanner.hasNextLine()) {
    list.add(scanner.nextLine());
  }
  list.stream().filter(x -> x.matches(".*[z]{1}.{3}[z]{1}.*"))
          .forEach(System.out::println);

}
}
