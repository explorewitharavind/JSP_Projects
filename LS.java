import java.util.Scanner;
public class LS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int Number = sc.nextInt();
        int temp = Number;
        int Largest = Number%10;
        int Smallest = Number%10;
        while(temp!=0)
        {
            int LastDigit = temp%10;
            if(LastDigit>Largest)
            {
                Largest = LastDigit;
            }
            if(Smallest>LastDigit)
            {
                Smallest=LastDigit;
            }
            temp = temp/10;
        }
        System.out.println("Largest Number is : "+Largest);
        System.out.println("Smallest Number is : "+Smallest);
    }
}
