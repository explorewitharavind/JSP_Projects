import java.util.Scanner;

public class PerfectNumbersInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Range to get Perfect Number");
        int Range = sc.nextInt();
        int count = 0;
        for(int i =1 ; i<=Range;i++)
        {
            int sum = 0;
            for(int j=1;j<=i/2;j++)
            {
                if(i%j==0)
                {
                    sum = sum+j;
                }
            }
            if(sum==i)
            {
                count++;
                System.out.println(count+") "+sum);
            }
        }
    }
}
