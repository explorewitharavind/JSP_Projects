import java.util.Scanner;

public class NonFibonacciSeriesInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Minimum Range");
        int minRange = sc.nextInt();
        System.out.println("Enter Maximum Range");
        int maxRange = sc.nextInt();
        int n1= minRange;
        int n2=minRange+1;
        int n3=0;
        for(int i=minRange;i<=maxRange;i++)
        {
            if(n3!=0)
            {
                System.out.println(i);
            }
            else
            {
                n3=n1;
                n1=n2;
                n2=n3;
            }
        }    
    }
}
