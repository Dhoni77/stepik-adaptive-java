import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

//Deposit 1
//
//        The interest rate on the deposit is P percent per annum,
//        which are added to the deposit amount at the end of the year. The deposit is X dollars and Y cents.
//        Find the deposit amount a year after.
//
//        You are not allowed to use conditional statements and loops when solving this problem.
//
//        Input data format
//
//        Given integers P, X, Y.
//        Output data format
//
//        The program should output two numbers: the size of the deposit in dollars and cents after one year.
//        The fractional part of cents should be discarded.
//
//        After solving this problem,
//        you will need to submit your solution for review and you will need to review 3 other solutions!
//        After reviewing 3 other solutions, please proceed to the next problem
//        (your solution will be reviewed by following users later).
//
//        Sample Input:
//
//        12
//        179
//        0
//        Sample Output:
//
//        200
//        48

public class Deposit {

    static public final void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int p = Integer.parseInt(scanner.nextLine());
        int x = Integer.parseInt(scanner.nextLine());
        int y = Integer.parseInt(scanner.nextLine());

        BigDecimal p1 = BigDecimal.valueOf(p).divide(BigDecimal.valueOf(100)).setScale(10, RoundingMode.FLOOR).add(BigDecimal.ONE);
        BigDecimal x1 = BigDecimal.valueOf(x);
        BigDecimal y1 = BigDecimal.valueOf(y).divide(BigDecimal.valueOf(100)).setScale(10, RoundingMode.FLOOR);
        BigDecimal afterYear = x1.add(y1).multiply(p1).setScale(2,RoundingMode.FLOOR);
        System.out.println(afterYear.intValue());
        System.out.println(afterYear.remainder(BigDecimal.ONE).multiply(BigDecimal.valueOf(100)).intValue());
    }
}
