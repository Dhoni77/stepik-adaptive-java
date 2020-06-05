public class LCDCalculator {
  static String[] s = {
          "x-------------------------------------------------x",
          "| --        --   --        --   --   --   --   -- |",
          "||  |    |    |    | |  | |    |       | |  | |  ||",
          "||  |    |    |    | |  | |    |       | |  | |  ||",
          "|           --   --   --   --   --        --   -- |",
          "||  |    | |       |    |    | |  |    | |  |    ||",
          "||  |    | |       |    |    | |  |    | |  |    ||",
          "| --        --   --        --   --        --   -- |",
          "x-------------------------------------------------x"    };
  public static void main(String[] args){
    String[] res=new String[s.length];
    for (int i=0;i<s.length;i++) res[i]=s[i].substring(0,1);
    String w=(new java.util.Scanner(System.in)).nextLine();
    int j=0;
    for (int k=0;k<w.length();k++){
      int n=Integer.parseInt(w.substring(k,k+1));
      j+=1;
      for (int i=0;i<s.length;i++){
        res[i] = res[i]+s[i].substring(1+(n*5),5+(n*5));
        if (j < w.length()) res[i] = res[i]+s[i].substring(5,6);
      }
    }
    for (int i=0;i<s.length;i++) System.out.println(res[i]+s[i].substring(0,1));
  }
}
