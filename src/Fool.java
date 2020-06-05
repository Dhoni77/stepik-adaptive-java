import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//The card deck to play Fool contains 36 cards. Each of the cards has a
//
//        suit: clubs, diamonds, hearts and spades (marked as C, D, H, S);
//        face value: values from 6 to 10, jack, queen, king, ace (marked as 6, 7, 8, 9, 10, J, Q, K, A).
//        During calculations, the card values are used as described above: 6 has the lowest value, and ace - the highest.
//
//        Write a program, which decides whether one cards beats another one.
//        If there are two cards of the same suit, wins the one having the higher face value;
//        If the cards belong to the different suits, wins the one having the trump suit;
//        If the cards belong to the different suits and there are no cards from the trump suit, nobody wins.
//
//        Input format:
//        First line specifies the two cards in the <value><suit> format separated by a space, and the next line specifies the trump suit.
//
//        Output format:
//        The program should output a single word:
//
//        First, if the first card beats the second one,
//        Second, if the second card beats the first one,
//        Error, if none of the cards can beat the other one.
//        Sample Input 1:
//
//        AH JH
//        D
//        Sample Output 1:
//
//        First
//        Sample Input 2:
//
//        AH JS
//        S
//        Sample Output 2:
//
//        Second
//        Sample Input 3:
//
//        7C 10H
//        S
//        Sample Output 3:
//
//        Error

public class Fool {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String line = scanner.nextLine();
    String first = line.split(" ")[0].trim();
    String second = line.split(" ")[1].trim();
    String trumpSuit = scanner.nextLine();

    Map<String,Integer> map = new HashMap<>();
    map.put("6", 6);
    map.put("7", 7);
    map.put("8", 8);
    map.put("9", 9);
    map.put("10", 10);
    map.put("J", 11);
    map.put("Q", 12);
    map.put("K", 13);
    map.put("A", 14);

    if (first.substring(first.length()-1).equals(trumpSuit)&&second.substring(second.length()-1).equals(trumpSuit)) {
      System.out.println(map.get(first.substring(0,first.length()-1))>map.get(second.substring(0,second.length()-1))?"First":"Second");
    }
    else if(!first.substring(first.length()-1).equals(trumpSuit)&&!second.substring(second.length()-1).equals(trumpSuit)) {
      if (!first.substring(first.length()-1).equals(second.substring(second.length()-1))){
        System.out.println("Error");
      }
      else {
        System.out.println(map.get(first.substring(0,first.length()-1))>map.get(second.substring(0,second.length()-1))?"First":"Second");
      }
    }
    else if (first.substring(first.length()-1).equals(trumpSuit)&&!second.substring(second.length()-1).equals(trumpSuit)) {
      System.out.println("First");
    }
    else if (!first.substring(first.length()-1).equals(trumpSuit)&&second.substring(second.length()-1).equals(trumpSuit)) {
      System.out.println("Second");
    }
  }
}
