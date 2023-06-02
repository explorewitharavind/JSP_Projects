import java.util.Scanner;

public class SumOfANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int Number = sc.nextInt();
        int sum = 0;
        for(int i = Number;i!=0;)
        {
            int Last_Number = Number%10;
            sum = sum + Last_Number;
            Number = Number/10;
            
        }
        System.out.println(sum);
    }
}
