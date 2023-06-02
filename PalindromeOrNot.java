import java.util.Scanner;

public class PalindromeOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Number = sc.nextInt();
        int Answer = Number;
        int ReverseANumber = 0;
        while(Number!=0)
        {
            int Last_Digit = Number%10;
            ReverseANumber = ReverseANumber * 10 + Last_Digit;
            Number = Number/10;
        }
        if(ReverseANumber == Answer)
        {
            System.out.println(Answer+" is a Palindrome Number");
        }
        else
        {
            System.out.println(Answer+" is Not a Palindrome Number");
        }
    }
}
