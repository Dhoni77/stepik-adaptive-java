public interface Incrementable {
  int base = 0;
  int increment();
}

//class Incrementator implements Incrementable {
//  @Override
//  public int increment() {
//    return base++;
//  }
//
//  public static void main(String[] args) {
//    Incrementator incrementator = new Incrementator();
//    int i = incrementator.increment();
//    System.out.println(i);
//  }
//}
