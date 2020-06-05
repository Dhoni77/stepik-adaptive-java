import java.util.Scanner;

public class Stairs {
    /*  Given 1<=n<=10^2 – numer of stairs of the staircase, and the integers -10^4 <= a_1,. . . .a_n<=10^4, which are used to mark the stairs.
    Find the maximum sum that can be obtained by going up the stairs from the bottom up (from the zero to the nn-th stair), each time going up one or two steps. */
    /*

    Даны число n ступенек лестницы и целые числа a1,…,an, которыми помечены ступеньки.
    Найдите максимальную сумму, которую можно получить, идя по лестнице снизу вверх
    (от нулевой до n-й ступеньки), каждый раз поднимаясь на одну или две ступеньки.
     */
    public static void main(String[] args) {
        new Stairs().run();
    }

    private void run() {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int[] stairs = new int[n];
        for (int i=0; i<n; i++) {
            stairs[i] = sc.nextInt();
        }

        int[] d = new int[n];
        d[0] = stairs[0];
        if (n>1) {
            d[1] = Math.max(d[0] + stairs[1], stairs[1]);
            for (int i=2; i<n; i++) {
                d[i] = Math.max(d[i-1] + stairs[i], d[i-2] + stairs[i]);
            }
        }
        System.out.println(d[n-1]);
    }
}
