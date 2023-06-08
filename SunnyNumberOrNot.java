import java.util.Scanner;

public class SunnyNumberOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int Number = sc.nextInt();
        int new_Number = Number+1;
        for(int i=1;i<=new_Number;i++)
        {
            if(i*i==new_Number)
            {
                System.out.println(Number+" is a Sunny Number");
                break;
            }
        }
    }
}
