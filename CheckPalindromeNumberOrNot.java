import java.util.Scanner;

public class CheckPalindromeNumberOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number to Check Palindrome or Not");
        int Number = sc.nextInt();
        int temp = Number;
        int rev = 0;
        while(temp!=0)
        {
            int Last_Digit = temp%10;
            rev = rev*10 + Last_Digit;
            temp = temp/10;
        }
        if(Number==rev)
        {
            System.out.println(Number+" is a Palindrome Number");
        }
        else
        {
            System.out.println(Number+" is Not a Palindrome Number");
        }
    }
}
