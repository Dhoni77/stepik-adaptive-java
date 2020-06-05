import java.util.Scanner;

public class CatalanNumbers {

  public static final long TASK_MODULO = 1000000007;

  public static long modularBinomial(long n, long k, long mod) {
    if(n>k) {
      long num =1;
      long den = 1;
      if (k>n-k) {
        k = n-k;
      }
      for(long i=0; i<k; i++) {
        num = (num * (n - i)) % mod;
      }

      for(long i = 1; i<k+1; i++) {
        den = (den * i) % mod;
      }

      return num*modularPow(den,mod-2,mod)%mod;
    }
    return 0;
  }

  public static long modularPow(long num, long exp, long mod) {
    long result=1;

    while(exp>0) {
      if(exp%2!=0) {
        result =(result*num) % mod;
      }
      num = (num*num)%mod;
      exp= exp / 2;
    }
    return result % mod;
  }

  public static long catalanN(int n) {
    return (modularBinomial(2*n,n,TASK_MODULO) * modularPow(n+1, TASK_MODULO-2,TASK_MODULO) % TASK_MODULO);
  }

  public static long catalanNum(int n){
    long catalanN = 1;
    for(int i =0;i<n;i++){
      catalanN = (((4 * i + 2) * modularPow(i +2, TASK_MODULO -2, TASK_MODULO))% TASK_MODULO * catalanN % TASK_MODULO);
    }
    return catalanN;
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    System.out.println(catalanNum(n));

//    int n = new Scanner(System.in).nextInt();
//    BigInteger pred = BigInteger.ONE;
//    BigInteger p = BigInteger.valueOf(1000000007);
//    BigInteger a, b;
//    for (int i = 1; i <= n; i++) {
//      a = BigInteger.valueOf(2 * (2 * i - 1)).multiply(pred).mod(p);
//      b = BigInteger.valueOf(i+1).modPow(p.add(BigInteger.valueOf(2).negate()), p);
//      pred = a.multiply(b).mod(p);
//    }
//    System.out.println(pred);
  }
}
