public class TheNthFibonacciNumber {
  public static int fib(int x){
    int first=0;
    int second=1;
    int[] array = new int[40];
    array[0]=first;
    array[1]=second;
    for (int i=2;i<array.length;i++) {
      array[i] = array[i-1]+array[i-2];
    }
    return array[x];
  }

}
