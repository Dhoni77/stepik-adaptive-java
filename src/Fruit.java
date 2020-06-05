// This implementaion allows comparison of apples and oranges

//There are different points of view on "Apples and Oranges" problem. You are provided with implementation that allows comparison of apples with oranges, the task is to redesign type system and implementation in a classical way that prohibits comparison of Oranges and Apples.
//
//        Following requirements exists:
//
//        Comparison of Apples with Apples and Oranges with Oranges should be allowed
//        Comparison of Apples with Oranges and Oranges with Apples should be restricted at a compile time
//        Class hierarchy should be preserved
//        Fruits comparison doesn't matter, you may disable it
//        Solution should not raise compile-time warnings (e.g. "raw types")

class Fruit {

  private final int weigth;

  public Fruit(int weight) {
    this.weigth = weight;
  }

  public int getWeigth() {
    return this.weigth;
  }

}

class Apple extends Fruit implements Comparable<Apple> {

  public Apple(int weight) {
    super(weight);
  }

  @Override
  public int compareTo(Apple other) {
    return Integer.compare(this.getWeigth(), other.getWeigth());
  }

}

class Orange extends Fruit implements Comparable<Orange> {

  public Orange(int weight) {
    super(weight);
  }

  @Override
  public int compareTo(Orange other) {
    return Integer.compare(this.getWeigth(), other.getWeigth());
  }

}