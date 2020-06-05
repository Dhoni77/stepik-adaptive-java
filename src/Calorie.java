import java.util.List;
import java.util.stream.Collectors;

public interface Calorie extends Comparable<Calorie> {
    int compareTo(Calorie object);
    int getCalories();
}

// Examples of classes CaloryGrader is supposed to work with
class Drink implements Calorie {
    @Override
    public int compareTo(Calorie object) {
        return 0;
    }

    @Override
    public int getCalories() {
        return 0;
    }
    // Some implemenation...
}

class Bakery implements Calorie {
    @Override
    public int compareTo(Calorie object) {
        return 0;
    }

    @Override
    public int getCalories() {
        return 0;
    }
    // Some implementation...
}

class Cake extends Bakery {
    @Override
    public int getCalories() {
        return super.getCalories();
    }
    // Some implementation...
}

class Box<T> {
    private T item;

    public void put(T item) {
        this.item = item;
    }

    public T get() {
        return this.item;
    }
}

class CaloryGrader {

    /**
     * Returns sorted in ascending order copy of items list.
     *
     * Sort order is defined by item calories.
     *
     * @param items collection of items to sort
     * @return sorted copy
     */
    public List grade(List <? extends Calorie> items) {
        return items.stream().sorted().collect(Collectors.toList());
        // Add implementation
    }
    public <T extends Calorie> List grade1 (List<T> items) {
        // Add implementation
        return items.stream()
                .sorted()
                .collect(Collectors.toList());
    }

    public void deliver(Box<? extends Bakery> box) {

        // He knows how to do this, leave unchanged
    }
    public <T extends Bakery>T bake(Class<T> order) throws IllegalAccessException, InstantiationException {
        return order.newInstance();
    }

}

class QualityControl {

    public static boolean check(List<Box<? extends Bakery>> boxes) {
        boolean result = true;

        try {
            for (Box<? extends Bakery> box : boxes) {
                Bakery item = box.get();
            }
        } catch (ClassCastException|NullPointerException e) {
            result = false;
        }
        return result;// Add implementation here
    }

}

