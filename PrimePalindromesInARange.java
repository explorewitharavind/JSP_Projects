import java.util.Scanner;

public class PrimePalindromesInARange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Range ");
        int Range = sc.nextInt();
        int count = 0;
        for(int i = 1;i<=Range;i++)
        {
            int rev = 0;
            int temp =i;
            while(temp!=0)
            {
                int Last_Digit = temp%10;
                rev = rev *10 + Last_Digit;
                temp = temp/10;
            }
            int increment = 0;
            for(int j =1;j<=i;j++)
            {
                if(i%j==0)
                {
                    increment++;
                }
            }
            if(increment==2 && rev == i)
            {
                count++;
                System.out.println("Prime Palindrome Numbers are : "+count+") "+i);
            }
        }
    }
}
