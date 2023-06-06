import java.util.Scanner;

public class NextAmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number ");
        int Number = sc.nextInt();
        int increment = 1;
        while(Number!=0)
        {
            Number++;
            int temp = Number;
            int count = 0;
            while(temp!=0)
            {
                count++;
                temp = temp/10;
            }
            int num = Number;
            int sum = 0;
            while(num!=0)
            {
                int last_digit = num%10;
                int exp = 1;
                for(int i =1;i<=count;i++)
                {
                    exp = exp * last_digit;
                }
                sum = sum + exp;
                num = num/10;
            }
            if(sum==Number)
            {
                System.out.println("Next Armstrong Number is : "+increment+") "+ Number);
                break;
            }
        }
    }
}
