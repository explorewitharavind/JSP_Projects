import java.util.Scanner;
public class CountNumbersInaNumber
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int Number = sc.nextInt();
        int count = 0;
        for(int i = Number;i!=0;i++)
        {
            count++;
            Number = Number/10;
        }
        System.out.println("Total Numbers in a Number is : "+ count);
        }
}