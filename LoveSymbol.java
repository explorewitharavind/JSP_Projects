import java.util.Scanner;

public class LoveSymbol {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of The Heart");
        int Size = sc.nextInt();
        for(int i=2;i<=Size;i++)
        {
            for(int sp = Size;sp>=i;sp--)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            for(int space = 2*Size-1; space>=2*i;space--)
            {
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=2;i<=2*Size;i++)
        {
            for(int space = 1;space<=i;space++)
            {
                System.out.print(" ");
            }
            for(int j=2*Size;j>=i;j--)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
