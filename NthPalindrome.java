import java.util.Scanner;

public class NthPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Nth Palindrome ");
        int Nth = sc.nextInt();
        int count = 0;
        for(int i = 1;count<=Nth;i++)
        {
            int rev = 0;
            int temp = i;
            while(temp!=0)
            {
                int Last_Digit = temp%10;
                rev = rev*10 + Last_Digit;
                temp = temp/10;
            }
            if(i==rev)
            {
                count++;
                if(count==Nth)
                {
                    System.out.println(+Nth+"th Palindrome Number is : "+i);
                }
            }
        }
    }
}
