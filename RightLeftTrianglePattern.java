import java.util.Scanner;

public class RightLeftTrianglePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Height");
        int Height = sc.nextInt();
        for(int i=1;i<=2*Height-1;i++)
        {
            int Logic = Height>=i?i:2*Height-i;
            for(int j=1;j<=Logic;j++)
            {
                System.out.print("*");
            }
            int spaceLogic = Height>=i?2*Height-2*i:2*i-2*Height;
            for(int space = 1;space<=spaceLogic;space++)
            {
                System.out.print(" ");
            }
            for(int k=1;k<=Logic;k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
