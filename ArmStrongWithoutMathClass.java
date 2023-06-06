import java.util.Scanner;

public class ArmStrongWithoutMathClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number ");
        int Number = sc.nextInt();
        int temp = Number;
        int count = 0;
        while(temp!=0)
        {
            count++;
            temp = temp/10;
        }
        int num = Number;
        double Answer = 0;
        while(num!=0)
        {
            int ld = num%10;
            double sum = 1;
            int new_count = count;
            for(;new_count!=0;new_count--)
            {
                sum*=ld;
            }
            Answer = Answer + sum;
            num = num/10;
        }
        if(Number==Answer)
        {
            System.out.println(Number+" is a ArmStrong Number !");
        }
        else
        {
            System.out.println(Number+" is not a ArmStrong Number !");
        }
    }
}
