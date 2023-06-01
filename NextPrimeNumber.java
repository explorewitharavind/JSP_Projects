import java.util.Scanner;

public class NextPrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number to get next Prime Number ");
        int Number = sc.nextInt();
        for(int i=Number;i<=2147483647;i++)
        {
            int count = 0;
            for(int j=1;j<=i;j++)
            {
                if(i%j==0)
                {
                    count++;
                }
            }
            if(count==2)
            {
                if(i==Number)
                {
                    continue;
                }
                System.out.println("The Next Prime Number is "+i);
                break;
            }
        }
    }

}
