import java.util.List;

//You are provided with the backbone of ListMultiplicator class that has multiply method that takes list and multiplies its content specified number of times. The original list content should be changed after method returns. The task is to add implementation to the method without changing its signature.
//
//        You are guaranteed that:
//
//        list is non null
//        n is equals or greater than zero
//        ﻿n stands for number of times the original list repeated in the result. So if n equals zero the resulting list should be empty.
//
//        For original list:
//
//        [1, 2, 3]
//        and n equals 2 the result should be:
//
//        [1, 2, 3, 1, 2, 3]
//        Sample Input:
//
//        ListMultiplicator class
//Sample Output:
//
//        Well done!

public class ListMultiplicator {
    public static <T> void multiply(List<T> list, int n) {
        if (n==0) {
            list.clear();
        }
        else {
            int size=list.size();
            for (int i=1; i<n; i++) {
                list.addAll(list);
                for (int j = 0; j <size;j++){
                    list.add(list.get(j));
                }
            }
        }
    }
}
