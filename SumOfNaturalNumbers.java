import java.util.Scanner;
public class SumOfNaturalNumbers
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Range ");
        int Range = sc.nextInt();
        int sum=0;
        for(int i=1;i<=Range;i++)
        {
            sum = sum+i;
        }
        System.out.println("Sum of "+Range+" Natural Numbers is "+sum);
    }
}