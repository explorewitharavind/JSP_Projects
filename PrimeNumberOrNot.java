import java.util.Scanner;

public class PrimeNumberOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int Number = sc.nextInt();
        int count = 0;
        for(int i=1;i<=Number;i++)
        {
            if(Number%i==0)
            {
                count++;
            }
        }
        if(count==2)
        {
            System.out.println(Number+" is a Prime Number");
        }
        else
        {
            System.out.println(Number+" is not a Prime Number");
        }
    }
}
