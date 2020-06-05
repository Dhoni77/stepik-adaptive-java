import java.util.Scanner;

//An algorithm to decode strings

public class Letters {

//  public static void replaceAll(StringBuilder sb, Pattern pattern, String replacement) {
//    Matcher m = pattern.matcher(sb);
//    while(m.find()) {
//      sb.replace(m.start(), m.end(), replacement);
//    }
//  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String s = scanner.nextLine();
    String a = scanner.nextLine();
    String b = scanner.nextLine();

    if (s.contains(a)) {
      if (a.equals(b)||b.contains(a)) {
        System.out.println("Impossible");
        return;
      }
      int count = 0;
      while (s.contains(a)) {
        s=s.replaceAll(a,b);
        count++;
        if(!s.contains(a)) {
          System.out.println(count);
          return;
        }
      }
    }
    else
      System.out.println(0);

//    Scanner scanner = new Scanner(System.in);
//    StringBuilder s = new StringBuilder(scanner.nextLine());
//    StringBuilder toCompare=new StringBuilder(s);
//    Pattern a = Pattern.compile(scanner.nextLine());
//    String b = scanner.nextLine();
//    if (String.valueOf(s).contains(String.valueOf(a))) {
//      if (String.valueOf(a).equals(b)||b.contains(String.valueOf(a))) {
//        System.out.println("Impossible");
//        return;
//      }
//      int count = 0;
//      while (String.valueOf(s).contains(String.valueOf(a))) {
//        replaceAll(s,a,b);
//        count++;
//        if(!String.valueOf(s).contains(String.valueOf(a))) {
//          System.out.println(count);
//          return;
//        }
//      }
//    }
//    else
//      System.out.println(0);
  }
}
