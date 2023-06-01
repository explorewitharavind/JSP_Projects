import java.util.Scanner;
public class PerfectNumber
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number ");
        int Number = sc.nextInt();
        int sum = 0;
        for(int i=Number;i==Number;i++)
        {
            for(int j= 1;j<=Number/2;j++)
            {
                if(Number%j==0)
                {
                    sum = sum+j;
                }
            }
            if(sum==i)
            {
                System.out.println(sum+" is a Perfect Number");
            }
            else
            {
                System.out.println(Number+" is not a Perfect Number");
            }
        }
    }
}
