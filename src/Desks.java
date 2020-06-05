import java.util.*;

//Desks
//
//        Some school have decided to create three new math groups and equip classrooms for them with the new desks.
//        Only two students may sit at any desk. The number of students in each of the three groups is known.
//        Output the smallest amount of desks, which will need to be purchased. Each new group sits in its own classroom.
//
//        Input data format
//
//        The program receives the input of the three non-negative integers:
//        the number of students in each of the three classes (the numbers do not exceed 1000).
//
//        Sample Input 1:
//
//        20
//        21
//        22
//        Sample Output 1:
//
//        32
//        Sample Input 2:
//
//        16
//        18
//        20
//        Sample Output 2:
//
//        27

public class Desks {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int m = scanner.nextInt();
    int k = scanner.nextInt();
    int result=0;
    result +=n%2==0?n:n+1;
    result +=m%2==0?m:m+1;
    result +=k%2==0?k:k+1;
    System.out.println(result/2);
  }
}
