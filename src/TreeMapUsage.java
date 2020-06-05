import java.util.NavigableMap;

//Modify and return the given map as follows:
//        if the first key % 2 != 0 return sub map from First Key inclusive to FirstKey+4 inclusive in descending order
//        else return sub map from LastKey-4 inclusive to the Last Key inclusive in descending order
//        Sample Input:
//
//        1:one 2:two 3:three 4:four 5:five 6:six 7:seven
//        Sample Output:
//
//        5 : five
//        4 : four
//        3 : three
//        2 : two
//        1 : one

public class TreeMapUsage {
  public static NavigableMap<Integer, String> getSubMap(NavigableMap<Integer, String> map){
    if (map.firstKey()%2!=0) return map.subMap(map.firstKey(),true, map.firstKey()+4,true).descendingMap();
    else return map.subMap(map.lastKey()-4,true,map.lastKey(),true).descendingMap();

  }
}
