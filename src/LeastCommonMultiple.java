import java.util.Scanner;

public class LeastCommonMultiple {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        long a = Long.parseLong(line.trim().split(" ")[0]);
        long b = Long.parseLong(line.trim().split(" ")[1]);

        long temp1 = a;
        long temp2 = b;
        long temp;

        while(temp2 != 0){
            temp = temp2;
            temp2 = temp1%temp2;
            temp1 = temp;
        }

        long hcf = temp1;
        long lcm = (a*b)/hcf;

        System.out.println("HCF of input numbers: "+hcf);
        System.out.println("LCM of input numbers: "+lcm);
    }
}
