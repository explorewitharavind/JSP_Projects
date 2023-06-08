import java.util.Scanner;

public class RepeatAnOperation {
    public static void main(String[] args) {
        boolean repeat = false;
        do
        {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Age");
        int Age = sc.nextInt();
        if(Age>=18)
        {
            System.out.println("You are Eligible ");
        }
        else
        {
            System.out.println("You are Not Eligible");
        }
        System.out.println("Do you want to Check Again ?");
            System.out.println("Enter true if YES");
            System.out.println("Enter false if NO ");
            repeat = sc.nextBoolean();
    }while(repeat==true);
    System.out.println("Thank You ! ");
    }
}
