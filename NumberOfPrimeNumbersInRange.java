import java.util.Scanner;

public class NumberOfPrimeNumbersInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Minimum Range Number");
        int Min_Range = sc.nextInt();
        System.out.println("Enter Maximum Range Number");
        int Max_Range = sc.nextInt();
        for(int i=Min_Range;i<=Max_Range;i++)
        {
            int count =0;
            for(int j=1;j<=i;j++)
            {
                if(i%j==0)
                {
                    count++;
                }
            }
            if(count==2)
            {
                System.out.println("Prime Numbers Between "+Max_Range+" and "+Max_Range+" is :" +i);
            }
        }
    }
}
