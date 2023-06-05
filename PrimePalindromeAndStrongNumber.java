import java.util.Scanner;

public class PrimePalindromeAndStrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Range ");
        int Range = sc.nextInt();
        int count = 1;
        for(int i=1;i<=Range;i++)
        {
            int increment = 0;
            for(int j=1;j<=i;j++)
            {
                if(i%j==0)
                {
                    increment++;
                }
            }
            int temp = i;
            int rev = 0;
            while(temp!=0)
            {
                int last_digit = temp%10;
                rev = rev*10+last_digit;
                temp = temp/10;
            }
            if(increment==2 && i==rev)
            {
                int sum = 0;
                int new_no = i;
                while(new_no!=0)
                {
                    int ld = new_no%10;
                    int fact = 1;
                    for(int k=1;k<=ld;k++)
                    {
                        fact = fact*k;
                    }
                    sum = sum+fact;
                    new_no  = new_no/10;
                }
                    System.out.println(count+") "+i+" - "+sum);
                count++;
                
            }
        }
    }
}
