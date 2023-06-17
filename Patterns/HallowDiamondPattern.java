import java.util.Scanner;

public class HallowDiamondPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Height");
        int Height = sc.nextInt();
        for(int i=1;i<=Height;i++)
        {
            for(int j=Height;j>=i;j--)
            {
                System.out.print("*");
            }
            for(int space = 1;space<=2*i-2;space++)
            {
                System.out.print(" ");
            }
            for(int k=Height;k>=i;k--)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=1;i<=Height;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            for(int space=2*Height;space>2*i;space--)
            {
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
