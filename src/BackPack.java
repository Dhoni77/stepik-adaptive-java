import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class BackPack {

  private List<Item> bestItems = new ArrayList<>();

  private int maxW;
  private int bestPrice;

  static class Item {
    int weight;

    public int getWeight() {
      return weight;
    }

    public void setWeight(int weight) {
      this.weight = weight;
    }

    public Item(int weight) {
      this.weight = weight;
    }
  }

  public BackPack(int maxW) {
    this.maxW = maxW;
  }

  private int CalcWeight(List<Item> items) {
    int sumWeight = 0;
    for (Item i : items) {
      sumWeight += i.getWeight();
    }
    return sumWeight;
  }

  private int CalcPrice(List<Item> items) {
    int sumWeight = 0;
    for (Item i : items) {
      sumWeight += i.getWeight();
    }
    return sumWeight;
  }

  private void CheckSet(List<Item> items) {
    if (bestItems.size() == 0) {
      if (CalcWeight(items) <= maxW) {
        bestItems = items;
        bestPrice = CalcPrice(items);
      }
    } else {
      if (CalcWeight(items) <= maxW && CalcPrice(items) > bestPrice) {
        bestItems = items;
        bestPrice = CalcPrice(items);
      }
    }
  }

  public void MakeAllSets(List<Item> items) {
    if (items.size() > 0) { CheckSet(items); }
    for (int i = 0; i < items.size(); i++) {
      List<Item> newSet = new ArrayList<>(items);
      newSet.remove(i);
      MakeAllSets(newSet);
    }
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String line = scanner.nextLine();

    int w = Integer.parseInt(line.split(" ")[0]);
    int n = Integer.parseInt(line.split(" ")[1]);
    List<Item> goldenBars = Stream.of(scanner.nextLine().trim().split(" ")).map(x->new Item(Integer.parseInt(x))).collect(Collectors.toList());
    BackPack backPack = new BackPack(w);
    backPack.MakeAllSets(goldenBars);
    System.out.println(backPack.bestItems.stream().mapToInt(Item::getWeight).sum());
  }
}
