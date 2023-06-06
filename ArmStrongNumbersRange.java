import java.util.Scanner;

public class ArmStrongNumbersRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Range");
        int Range = sc.nextInt();
        int increment = 1;
        for(int i=1;i<=Range;i++)
        {
            int count = 0;
            int temp = i;
            while(temp!=0)
            {
                count++;
                temp = temp/10;
            }
             temp = i;
            int sum = 0;
            while(temp!=0)
            {
                int last_digit = temp%10;
                int exp = 1;
                for(int j=1;j<=count;j++)
                {
                    exp = exp * last_digit;
                }
                sum = sum + exp;
                //System.out.println(sum);
                temp = temp/10;
            }
            if(i==sum)
            {
                System.out.println(increment+") "+i);
                increment++;
            }
        }
    }
}
