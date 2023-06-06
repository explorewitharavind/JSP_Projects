import java.util.Scanner;

public class SmallestDigitInANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number to Get Smallest Digit ");
        int Number = sc.nextInt();
        int Smallest = Number%10;
        while(Number!=0)
        {
            int last_digit = Number%10;
            if(last_digit<Smallest)
            {
                Smallest = last_digit;
            }
            Number  = Number/10;
        }
        System.out.println("Smallest Digit is : "+ Smallest);
    }
}
