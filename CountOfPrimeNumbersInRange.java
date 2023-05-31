import java.util.Scanner;

public class CountOfPrimeNumbersInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Minimum Number");
        int min = sc.nextInt();
        System.out.println("Enter Maximum Number");
        int max = sc.nextInt();
        int count  = 0;
        for(int i=min;i<=max;i++)
        {
            int increment = 0;
            for(int j=1;j<=i;j++)
            {
                if(i%j==0)
                {
                    increment++;
                }
            }
            if(increment==2)
            {
                //System.out.println(i);
                count++;
                System.out.println(count+") "+i);
            }
        }
    }
}
