import java.util.Scanner;

public class PerfectSquareWithStaticMethod {

    public static void PerfectS(int a)
    {
        for(int i=1;i<=a;i++)
        {
            if((i*i)==a)
            {
                System.out.println((i*i)+" is a Perfect Square Number");
                break;
            }
            
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int number = sc.nextInt();
        PerfectS(number);
}
}
