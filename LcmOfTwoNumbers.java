import java.util.Scanner;
public class LcmOfTwoNumbers
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int n1 = sc.nextInt();
        System.out.println("Enter Another Number");
        int n2 = sc.nextInt();
        for(int i=1;true;i++)
        {
            if((n1*i)%n2==0)
            {
                System.out.println("LCM is : "+n1*i);
                break;
            }
        }
    }
}