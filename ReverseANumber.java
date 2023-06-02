import java.util.Scanner;

public class ReverseANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int Number = sc.nextInt();
        int Result = 0;
        while(Number!=0)
        {
           int L = Number%10;
           Result = L;
           Number=Number/10;
            

        }
        System.out.println(Result);
    }
}
