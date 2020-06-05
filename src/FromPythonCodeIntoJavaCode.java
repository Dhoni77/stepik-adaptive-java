import java.util.*;
import java.util.stream.Stream;

//You decided to write a converter from Python code into Java code. As CamelCase names are standard in Java, you decided to learn how to convert names from underscore into this format.
//
//        First, write a program, which changes variable names from underscore to the UpperCamelCase style.
//
//        In the underscore style each word starts from a lowercase letter characterizes, and the underscore character “_” separates the words. In the UpperCamelCase style each word is starts from the capital letter and there are no separators between the words.
//
//        Input format:
//        Single string, containing the name, written in the underscore style.
//
//        Output format:
//        The string, containing the new name in the UpperCamelCase style.
//
//        Sample Input 1:
//
//        my_first_class
//        Sample Output 1:
//
//        MyFirstClass
//        Sample Input 2:
//
//        a
//        Sample Output 2:
//
//        A
//        Sample Input 3:
//
//        anOther_clAss
//        Sample Output 3:
//
//        AnotherClass

public class FromPythonCodeIntoJavaCode {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String n = scanner.nextLine();

    if(n.contains("_")) {
      String[] array = n.split("_");
      Stream.of(array).map(x->x.substring(0,1).toUpperCase()+x.substring(1).toLowerCase()).forEach(System.out::print);
    }
    else {
      if (n.length()==1)
        System.out.println(n.toUpperCase());
      else
        System.out.println(n.substring(0,1).toUpperCase()+n.substring(1).toLowerCase());
    }// put your code here
  }
}
