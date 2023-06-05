import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a  Number");
        int Num = sc.nextInt();
        int Fact = 1;
        for(int i=1;i<=Num;i++)
        {
            Fact = Fact * i;
        }
        System.out.println(Fact);
    }
}
