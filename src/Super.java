public class Super {
  static {
    System.out.println("Super Static");
  }

  {
    System.out.println("Super non-static");
  }

  public Super() {
    System.out.println("Super Constructor");
  }
}

class Child extends Super {
  static {
    System.out.println("Child Static");
  }

  {
    System.out.println("Child non-static");
  }

  public Child() {
    System.out.println("Child Constructor");
  }
}

class Test {
  public static void main(String[] args) {
    Child t = new Child();
  }
}
