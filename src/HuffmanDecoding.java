import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HuffmanDecoding {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String line = scanner.nextLine();
    int k = Integer.parseInt(line.trim().split(" ")[0]);
    int l = Integer.parseInt(line.trim().split(" ")[1]);
    Map<String, String> map = new HashMap<>();
    for(int i = 0;i<k;i++) {
      line = scanner.nextLine();
      map.put(line.trim().split(": ")[1], line.trim().split(": ")[0]);
    }
    line = scanner.nextLine();

    int maxKeyLength = map.entrySet().stream().max(Comparator.comparing(x->x.getKey().length())).get().getKey().length();

    for (int i =0; i< line.length(); ) {
      for (int j =maxKeyLength; j>0; j--) {
        if (j<=line.length()-i) {
          if (map.containsKey(line.substring(i, i + j))) {
            System.out.print(map.get(line.substring(i, i + j)));
            i += j;
            j = 0;
          }
        }
      }
    }
  }
}
