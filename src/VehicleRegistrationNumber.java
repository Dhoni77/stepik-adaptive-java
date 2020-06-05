import java.util.*;

//Write a program that uses regular expressions to check whether the input string is a vehicle registration number.
//        Vehicle registration number has the following format: ?***??, where ? – a Latin symbol
//        from the set [A, B, E, K, M, H, O, P, C, T, Y, X], and * – any digit from 0 to 9.
//        The program should output Yes or No.
//        Sample Input:
//        X777XX
//        Sample Output:
//        Yes

public class VehicleRegistrationNumber {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String line = scanner.nextLine();
    System.out.println(line.matches("[A, B, E, K, M, H, O, P, C, T, Y, X]{1}[0-9]{3}[A, B, E, K, M, H, O, P, C, T, Y, X]{2}")?"Yes":"No");
  }
}
