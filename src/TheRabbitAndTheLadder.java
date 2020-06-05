import java.math.BigInteger;
import java.util.Scanner;

//The rabbit and the ladder
//
//        The rabbit appeared in the Zoo. He was placed in a cage, and the Director of the Zoo ordered to put a ladder in his cage, so that he could entertain himself. Now our rabbit can jump up the ladder, jumping over the steps. The ladder has the particular number of stairs NN. In one jump the rabbit can jump over not more than КК steps. To make it more fun, the rabbit each time tries to find a new way to the top of the ladder. The Director is interested in how many different ways does the rabbit have to reach the top of the ladder for a given values KK and NN. Help the Director to write a program that will compute this number.
//
//        For example, if K=3 and N=4, the following ways exist: 1+1+1+1, 1+1+2, 1+2+1, 2+1+1, 2+2, 1+3, 3+1. Therefore for the given values the rabbit has only 7 different ways to reach the top of the ladder.
//
//        Input data
//
//        The single line contains the two integers KK and NN (1 \le K \le N \le 300)(1≤K≤N≤300). КК - the maximum number of steps, which rabbit can overcome in one jump, NN – the total number of the steps.
//
//        Output data
//
//        Output a single integer – number of different ways the rabbit can reach the top of the ladder, without leading zeros.
//
//        Sample Input:
//
//        3 4
//        Sample Output:
//
//        7

public class TheRabbitAndTheLadder {

  public static BigInteger VariantCalculaiton(int maxjump, int stairs)
  {
    // Creating array for all possible variants
    BigInteger[] variants = new BigInteger[stairs + 1];
    // First level have only 1 variant
    variants[0] = BigInteger.valueOf(1);
    variants[1] = BigInteger.valueOf(1);
    // Calculating in 10^9 system for improving speed of calculating(max 450000 operations for case k=300, n=300)
    // Calculating variants where rabbit can jump from begin of the stairs
    for (int i = 2; i <= maxjump; i++)
    {
      variants[i] = variants[i - 1].shiftLeft(1);
    }
    // Continue calculating for cases where rabbit jump from other levels
    for (int i = maxjump + 1; i <= stairs; i++)
    {
      variants[i] = (variants[i - 1].shiftLeft(1)).subtract (variants[i - maxjump - 1]);
    }

    return variants[stairs];
  }

  public static void main(String[] args) {
  Scanner scanner = new Scanner(System.in);
  String line = scanner.nextLine();
  int k = Integer.parseInt(line.split(" ")[0]);
  int n = Integer.parseInt(line.split(" ")[1]);

    System.out.println(VariantCalculaiton(k,n));
  }
}
