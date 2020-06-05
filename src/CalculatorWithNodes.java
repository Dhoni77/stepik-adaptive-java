import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

import static java.util.Arrays.asList;

//Calculator
//
//        You have a basic calculator, which has only three operations with the current number xx: replace xx by 2x2x, 3x3x or x+1x+1. Given the integer 1 \le n \le 10^51≤n≤10
//        5
//        , find the minimum number of kk operations, necessary to get nn from 1. Output kk and the sequence of intermediate numbers.
//
//        Sample Input 1:
//
//        1
//        Sample Output 1:
//
//        0
//        1
//        Sample Input 2:
//
//        5
//        Sample Output 2:
//
//        3
//        1 2 4 5
//        Sample Input 3:
//
//        96234
//        Sample Output 3:
//
//        14
//        1 3 9 10 11 22 66 198 594 1782 5346 16038 16039 32078 96234

class CalculatorWithNodes {

  private static class Node {

    private Node parent;
    private Node child;
    private int value;

    private Node(int value) {
      this.value = value;
    }

    public Node getChild() {
      return child;
    }

    public void setChild(Node child) {
      this.child = child;
      child.parent = this;
    }

    @Override
    public boolean equals(Object o) {
      if (this == o) {
        return true;
      }
      if (o == null || getClass() != o.getClass()) {
        return false;
      }

      Node node = (Node) o;

      return value == node.value;
    }

    @Override
    public int hashCode() {
      return value;
    }

    public void setParent(Node parent) {
      this.parent = parent;
      parent.child = this;
    }
  }

  private static Collection<Integer> calc(Integer start) {
    Set<Node> terminals = new HashSet<>(asList(new Node(start)));
    Node finishNode = null;
    if (start == 1) {
      finishNode = new Node(start);
    }
    while (finishNode == null) {
      Set<Node> newTerminals = new HashSet<>();
      for (Node node : terminals) {
        final int value = node.value;
        if (value % 3 == 0) {
          Node newNode = new Node(value / 3);
          newNode.setParent(node);
          newTerminals.add(newNode);
          if (newNode.value == 1) {
            finishNode = newNode;
            break;
          }
        }
        if (value % 2 == 0) {
          Node newNode = new Node(value / 2);
          newNode.setParent(node);
          newTerminals.add(newNode);
          if (newNode.value == 1) {
            finishNode = newNode;
            break;
          }
        }
        Node newNode = new Node(value - 1);
        newNode.setParent(node);
        newTerminals.add(newNode);
        if (newNode.value == 1) {
          finishNode = newNode;
          break;
        }
      }
      terminals = newTerminals;
    }
    List<Integer> result = new LinkedList<>();
    Node it = finishNode;
    while (it != null) {
      result.add(it.value);
      it = it.parent;
    }
    return result;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Collection<Integer> result = calc(sc.nextInt());
    System.out.println(result.size() - 1);
    String res = result.stream().map(Object::toString)
            .collect(Collectors.joining(" "));
    System.out.println(res);
  }
}
