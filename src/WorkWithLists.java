import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//Sooo this task may seem difficult , but actually it is not ! some after it become man...)
//        your BufferedReader gets string as this : "1 2 3 4 5"
//
//        next, you must create a list of numbers from this line(ArrayList<Integer>) in the createBigList:
//        *String[] strarr = str.split(" "); - String element from given string ( "1", "2", "3", "4", "5")
//        *In for-each loop convert to Integer and add all alements from strarr to bigList
//         -->Use Integer.parseInt(s) or Integer.valueOf(s) to convert from String to Integer
//        *return this bigList
//
//        have created three list, add the desired items in each and sort this lists in ascending order:
//        div2List for integers that x%2=0 {2, 4}
//        div3List for integers that x%3=0 {3}
//        otherlist for the remaining integers {1, 5}
//        if x%2=0 and x%3=0 add x to div2List and div3List!
//        Sort all three lists and create List of this three lists where the first element is div2List, second -  div3List and third - otherlist.
//        *method printInLine(resultList) is already written by me
//        *you can use all from java.util.*( including
//        java.util.stream.*)
//        *don't forget class
//        Collections(many useful methods on collections)
//
//        Sample Input:
//
//        1 177 8 700 785 4635 3489 52 7418 43 36 8695 3 64
//        Sample Output:
//
//        8 36 52 64 700 7418;3 36 177 3489 4635;1 43 785 8695

public class WorkWithLists {
  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    String allElements = reader.readLine();
    List<Integer> bigList = createBigList(allElements);

    ArrayList<Integer> div2list = new ArrayList<Integer>(bigList.stream().filter(x->x%2==0).mapToInt(Integer::valueOf).sorted().boxed().collect(Collectors.toList()));
    ArrayList<Integer> div3list = new ArrayList<Integer>(bigList.stream().filter(x->x%3==0).mapToInt(Integer::valueOf).sorted().boxed().collect(Collectors.toList()));;
    ArrayList<Integer> otherlist = new ArrayList<Integer>(bigList.stream().filter(x->x%2!=0&&x%3!=0).mapToInt(Integer::valueOf).sorted().boxed().collect(Collectors.toList()));;

    //add the necessary elements from bigList to div2list,div3list,otherlist and sort all three lists

    //get result list from createListOfLists
    List<List<Integer>> resultList = createListOfLists(div2list, div3list, otherlist);

    //call printInLine() for resultList
//    printInLine(resultList);
  }
  public static List<Integer> createBigList(String str){
    return Stream.of(str.trim()
            .split(" "))
            .mapToInt(Integer::parseInt)
            .boxed()
            .collect(Collectors.toList());
  }

  public static List<List<Integer>> createListOfLists(List<Integer> div2list, List<Integer> div3list ,List<Integer> otherList){
    List<List<Integer>> resultList = new ArrayList<>();
    resultList.add(div2list);
    resultList.add(div3list);
    resultList.add(otherList);
    //add all lists like items in resultList(list of lists) and return it, first-div2list, second-div3list, third-otherList
    return resultList;
  }
}
