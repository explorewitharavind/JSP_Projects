import java.util.Scanner;

public class ExponecialValueOfaNumberLargestandSmallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number ");
        int Number = sc.nextInt();
        int temp = Number;
        int Largest = temp%10;
        int Answer = 0;
        while(temp!=0)
        {
            int last_digit = temp%10;
             if(last_digit>Largest)
             {
                Largest = last_digit;
             }
             temp = temp/10;
        }
        temp = Number;
        int Smallest = temp%10;
        while(temp!=0)
        {
            int ld = temp%10;
            if(Smallest>ld)
            {
                Smallest = ld;
            }
            temp = temp/10;
        }
        int exp = 1;
        for(int i=1;i<=Smallest;i++)
        {
            exp = exp*Largest;

        }
        Answer = exp;
        System.out.println("Base(LARGEST) Value is "+Largest+" Power(SMALLEST) Value is "+Smallest+" Final Answer is "+Answer);
    }
}
