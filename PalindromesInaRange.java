import java.util.Scanner;

public class PalindromesInaRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Range ");
        int Range = sc.nextInt();
        int count = 0;
        for(int i=1;i<=Range;i++)
        {
            int rev = 0;
            int temp = i;
            while(temp!=0)
            {
                int Last_Digit = temp%10;
                rev = rev * 10 + Last_Digit;
                temp = temp/10;
            }
            if(i==rev)
            {
                count++;
                System.out.println(count+") "+i);
            }
        }
    }
}
