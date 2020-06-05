import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

//Write a program, which takes the name and age of a person as input (in a single line, space-separated),
// and finds the year when this person turns 100 years old.
//        Let's assume that today is December 31, 2016.
//        P.S. The output must be exactly in the format which is specified in the example below.
//        Sample Input:
//        Vladimir 45
//        Sample Output:
//        Vladimir, You will be 100 years old in 2071 year.

public class OneHundredYearsOld {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM d yyyy");
    LocalDate today = LocalDate.parse("12 31 2016", formatter);
    String line = scanner.nextLine();
    String name = line.trim().split(" ")[0];
    int age = Integer.parseInt(line.trim().split(" ")[1]);
    LocalDate after100 = today.plusYears(100-age);
    System.out.println(name+", You will be 100 years old in "+after100.getYear()+" year.");
  }
}
