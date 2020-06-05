import java.util.*;

//You should write a program that can transform some units of measurement into others.
//
//        The following transformations should be supported:
//
//        miles (1 mile = 1609 m),
//        yards (1 yard = 0.9144 m),
//        feet (1 foot = 30.48 cm),
//        inches (1 inch = 2.54 cm),
//        kilometres (1 km = 1000 m),
//        meters (m),
//        centimetres (1 cm = 0.01 m)
//        millimetres (1 mm = 0.001 m)
//        Use the units of measurement specified in the problem description with the exact specified accuracy.
//
//        Input format:
//        Single line in the following format:
//<number> <unit_from> in <unit_to>
//For example: if you get the line "15.5 mile in km", then you should transform 15.5 miles into kilometers.
//
//        Output format:
//        Real number in scientific format (exponential), with an accuracy of exactly two digits after decimal point.
//
//        Sample Input:
//
//        15.5 mile in km
//        Sample Output:
//
//        2.49e+01

public class UnitsOfMeasurement {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String line = scanner.nextLine();

    double m = 1;
    double mile = m*1609;
    double yard = m*0.9144;
    double cm = m*0.01;
    double foot = cm*30.48;
    double inch = cm*2.54;
    double km = m*1000;
    double mm = m*0.001;

    Map<String, Double> map = new HashMap<>();
    map.put("m", m);
    map.put("mile", mile);
    map.put("yard", yard);
    map.put("cm", cm);
    map.put("foot", foot);
    map.put("inch", inch);
    map.put("km", km);
    map.put("mm", mm);

    String from = line.split(" ")[1];
    String to = line.split(" ")[3];
    double s = Double.parseDouble(line.split(" ")[0]);

    System.out.println(String.format("%.2e",map.get(from)*s/map.get(to)));// put your code here
  }
}
