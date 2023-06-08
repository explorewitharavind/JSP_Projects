import java.util.Scanner;

public class HCFByDivision {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int n1 = sc.nextInt();
        System.out.println("Enter a Number ");
        int n2 = sc.nextInt();
        if(n1<n2)
        {
            int mod = 0;
            for(int i = 1;mod!=0;i++)
            {
                 mod = n1%n2;
            }
            System.out.println(mod);
        }
    }
}
