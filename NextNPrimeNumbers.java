import java.util.Scanner;

public class NextNPrimeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number To Find Next Prime Numbers");
        int Number = sc.nextInt();
        System.out.println("How Many Next Prime Numbers you Want To Print");
        int Next_Prime = sc.nextInt();
        int Prime_count = 1;
        for(int i=Number+1;true;i++)
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
            if(Prime_count<=Next_Prime)
            {
                
                System.out.println(Prime_count+") "+i);
            }
            Prime_count++;


        }
        }
    }
}
