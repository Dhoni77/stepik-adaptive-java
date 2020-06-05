import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.math.*;

class ContinuousBackpack {
    /*
    Первая строка содержит количество предметов n и вместимость рюкзака W.
    Каждая из следующих nn строк задаёт стоимость ci и объём wi предмета
    (nn, WW, ci, wi — целые числа).
    Выведите максимальную стоимость частей предметов (от каждого предмета
    можно отделить любую часть, стоимость и объём при этом пропорционально
    уменьшатся), помещающихся в данный рюкзак, с точностью не менее трёх
    знаков после запятой.
     */

    public static void main(String[] args) {
        new ContinuousBackpack().run();
    }

    public void run() {
        MathContext mc = new MathContext(20);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        BigDecimal w = sc.nextBigDecimal();
        BigDecimal[][] backpack = new BigDecimal[n][3];
        //объем, стоимость, цена

        for(int i=0; i<n; i++) {
            backpack[i][0] = sc.nextBigDecimal();
            backpack[i][1] = sc.nextBigDecimal();
            backpack[i][2] = backpack[i][0].divide(backpack[i][1],mc);
        }

        Arrays.sort(backpack, new Comparator<BigDecimal[]>() {
            @Override
            public int compare(BigDecimal[] sub1, BigDecimal[] sub2) {
                return sub2[2].compareTo(sub1[2]);
            }
        });

        BigDecimal sum = BigDecimal.ZERO;
        int i = 0;
        while ((w.compareTo(BigDecimal.ZERO)>0)&&(i<n)) {
            if (w.compareTo(backpack[i][1]) >= 0) {
                w = w.subtract(backpack[i][1],mc);
                sum = sum.add(backpack[i][0]);
            } else {
                sum = sum.add(w.multiply(backpack[i][2],mc),mc);
                w = BigDecimal.ZERO;
            }
            i++;
        }

        System.out.format("%.3f%n",sum);
    }
}
