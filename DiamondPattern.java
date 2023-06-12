import java.util.Scanner;

public class DiamondPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Height");
        int Height = sc.nextInt();
        for(int i=0;i<=Height;i++)
        {
            for(int space = Height;space>=i;space--)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=2*i+1;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int k=Height;k>=0;k--)
        {
            for(int space = k;space<=Height;space++)
            {
                System.out.print(" ");
            }
            for(int l=1;l<=2*k+1;l++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
