import java.util.Scanner;

public class NextStrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int Number = sc.nextInt();
        while(Number!=0)
        {
            Number++;
            int temp = Number;
            int sum =0;
            while(temp!=0)
            {
                int last_digit= temp%10;
                int fact = 1;
                for(int i=1;i<=last_digit;i++)
                {
                    fact = fact*i;
                }
                sum = sum+fact;
                temp = temp/10;
            }
            if(sum==Number)
            {
                System.out.println("Next Strong Number is : "+Number);
                break;
            }
        }
    }
}
