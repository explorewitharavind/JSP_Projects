import java.util.Scanner;

public class CountFactorsOfANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int Number = sc.nextInt();
        int count = 0;
        for(int i=1;i<=Number;i++)
        {
            if(Number%i==0)
            {
                System.out.println("Factors of "+Number+" is : "+i);
                count++;
            }
        }
        System.out.println("Number of Factors are : "+count);
    }
}
