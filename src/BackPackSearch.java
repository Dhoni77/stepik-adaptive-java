import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class BackPackSearch {
    private List<Item> bestItems = new ArrayList<>();

    private int maxVolume;
    private double bestPrice;

    public BackPackSearch(int maxVolume) {
        this.maxVolume = maxVolume;
    }

    private double CalcVolume(List<Item> items) {
        double sumVolume = 0;
        for (Item i : items) {
            sumVolume += i.getVolume();
        }
        return sumVolume;
    }

    private double CalcPrice(List<Item> items) {
        double sumPrice = 0;
        for (Item i : items) {
            sumPrice += i.getPrice();
        }
        return sumPrice;
    }

    private void CheckSet(List<Item> items) {
        if (bestItems.size() == 0) {
            if (CalcVolume(items) <= maxVolume) {
                bestItems = items;
                bestPrice = CalcPrice(items);
            }
        } else {
            if (CalcVolume(items) <= maxVolume && CalcPrice(items) > bestPrice) {
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

    static class Item {
        private double price;
        private int volume;

        public Item(double price, int volume) {
            this.price = price;
            this.volume = volume;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public int getVolume() {
            return volume;
        }

        public void setVolume(int volume) {
            this.volume = volume;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        int n = Integer.parseInt(line.trim()
                .split(" ")[0]);
        BackPackSearch backPackSearch = new BackPackSearch(Integer.parseInt(line.trim()
                .split(" ")[1]));
        List<Item> items = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            line = scanner.nextLine();
            items.add(new Item(Double.parseDouble(line.trim()
                    .split(" ")[0]), Integer.parseInt(line.trim()
                    .split(" ")[1])));
        }
        backPackSearch.MakeAllSets(items);
        System.out.printf("%.3f", backPackSearch.bestPrice);
    }
}
