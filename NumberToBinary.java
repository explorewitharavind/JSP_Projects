import java.util.Scanner;

public class NumberToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Number = sc.nextInt();
        int temp = Number;
        String str = "";
        int rev =0;
        int binary=0;
            while(temp!=0)
            {
            int rem = temp%2;
            str = str+rem;
            binary = rem+binary*10;
            temp = temp/2;
            }
            System.out.println(reverse.str);
           temp = binary;
         while(temp!=0)
            {
            int rem = temp%10;
            rev = rev*10+rem;
            temp = temp/10;
            }
            System.out.println("Binary code for "+Number+" is : "+rev);
    }
}
