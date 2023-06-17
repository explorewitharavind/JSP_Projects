import java.util.Scanner;

public class ReverseTrianglePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Height");
        int Height = sc.nextInt();
        for(int i=Height-1;i>=0;i--)
        {
            for(int space =Height-1;space>=i;space--)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=2*i+1;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
