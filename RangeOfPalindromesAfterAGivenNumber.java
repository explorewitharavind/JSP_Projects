import java.util.Scanner;

public class RangeOfPalindromesAfterAGivenNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number ");
        int Number = sc.nextInt();
        System.out.println("How Many Palindromes You Want ? ");
        int How_Many = sc.nextInt();
        int count = 0;
        for(int i=Number+1;count<=How_Many;i++)
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
                if(count<=How_Many)
                {
                    System.out.println(count+") "+i);
                }
            }
        }
    }
}
