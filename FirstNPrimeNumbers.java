import java.util.Scanner;

public class FirstNPrimeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter How Many Prime Numbers You Want To Fetch ");
        int Number = sc.nextInt();
        int Position = 1;
        for(int i=1;Position<=Number;i++)
        {
            int count=0;
            for(int j=1;j<=i;j++)
            {
                if(i%j==0)
                {
                    count++;
                }
            }
            if(count==2)
            {
                System.out.println(Position+") "+i);
                Position++;
            }
        }
    }
}
