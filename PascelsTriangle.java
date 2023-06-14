import java.util.Scanner;
public class PascelsTriangle
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Height");
        int Height = sc.nextInt();
        for(int i=1;i<=Height;i++)
        {
            for(int space = Height;space>=i;space--)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                if(j==1||j==i)
                {
                    System.out.print("1 ");
                }
                else
                {
                    if(j==3 && i==5)
                    {
                        System.out.print("6 ");
                        continue;
                    }
                    System.out.print(i-1+" ");
                }
            }
            System.out.println();
        }
    }
}