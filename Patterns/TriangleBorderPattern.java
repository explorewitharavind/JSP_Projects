import java.util.Scanner;

public class TriangleBorderPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Height");
        int Height = sc.nextInt();
        for(int i=0;i<=Height-1;i++)
        {
            for(int space = Height-1;space>=i;space--)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=2*i+1;j++)
            {
                if(j==1 || j==2*i+1)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for(int i=1;i<=2*Height+1;i++)
        {
            System.out.print("*");
        }
    }
}
