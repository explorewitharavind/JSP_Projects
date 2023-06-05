import java.util.Scanner;

public class StrongNumbersInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Range");
        int Number = sc.nextInt();
        int count =1;
        for(int i=1;i<=Number;i++)
        {
            int sum=0;
            int temp = i;
            while(temp!=0)
            {
                int last_digit = temp%10;
                int fact = 1;
                for(int j=1;j<=last_digit;j++)
                {
                    fact = fact*j;
                }
                sum = sum+fact;
                temp = temp/10;
            }
            if(i==sum)
            {
                System.out.println(count+") " +i);
                count++;
            }
        }
    }
}
