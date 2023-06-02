import java.util.Scanner;
public class SpyNumberOrNot
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Range");
        int Range = sc.nextInt();
        for(int i=1;i<=Range;i++)
        {
            int sum = 0;
            int mul = 1;
            int j =i;
            while( j!=0)
            {
                int L = j%10;
                sum = sum+L;
                mul = mul*L;
                j = j/10;
            }
            if(sum==mul)
            {
                System.out.println(i);
            }
        }
    }
}