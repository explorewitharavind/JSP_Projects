import java.util.Scanner;
public class ArmStrongNumber
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number ");
        int Number = sc.nextInt();
        int increment = 1;
        int temp=Number;
        int count = 0;
        while(temp!=0)
        {
            count++;
            temp = temp/10;
        }
        int num = Number;
        long add = 0;
        while(num!=0)
        {
            int ld = num%10;
            add = add + (int)Math.pow(ld, count);
            num = num/10;
        }
        if(Number==add)
        {
        System.out.println(increment+") "+Number+" is an Amstrong Number");
        increment++;
        }
        else
        {
            System.out.println(Number+" is Not a Armstrong Number");
        }
    }
}