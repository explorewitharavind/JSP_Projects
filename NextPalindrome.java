import java.util.Scanner;

public class NextPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number ");
        int Number = sc.nextInt();
        for(int i=Number+1;i<=i;)
        {
            int rev = 0;
            int temp = i;
            while(temp!=0)
            {
                int Last_Digit = temp%10;
                rev = rev *10 + Last_Digit;
                temp = temp/10;
            }
            if(i==rev)
            {
                System.out.println("Next Palindrome Number is : "+i);
                break;
            }
            else
            {
                i++;
            }
        }
    }
}
