import java.util.*;
public class NthPrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Position of Prime Number");
        int Position = sc.nextInt();
        int count = 1;
        for(int i=1;count<=Position;i++)
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
                if(count==Position)
                {
                    System.out.println("Prime Number at "+Position+" is : "+i);
                }
                count++;
                
            }
        }
    }
}
