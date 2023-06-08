import java.util.Scanner;

public class SumofNNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        for(int i=1;true;i++)
        {
            int num = sc.nextInt();
            char ch = sc.next().charAt(0);
            if(ch == '+')
            {
            sum = sum+num;
            }
            else if(ch=='=')
            {
                sum = sum+num;
                break;
            }
        }
        System.out.println("Sum is = "+sum);
    }
}