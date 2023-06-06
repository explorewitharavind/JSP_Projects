import java.util.Scanner;
public class BaseAndPower {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Base Value ");
        int base = sc.nextInt(); 
        System.out.println("Enter the Power Value");
        int power = sc.nextInt();
        double sum = 1;
        for(;power!=0;--power)
        {
            sum*=base;
        }
        System.out.println("Answer is "+sum);
        
    }
}
