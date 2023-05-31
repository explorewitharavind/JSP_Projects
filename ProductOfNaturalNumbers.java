import java.util.Scanner;

public class ProductOfNaturalNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Range");
        int Range = sc.nextInt();
        int mul=1;
        for(int i=1;i<=Range;i++)
        {
            mul = mul*i;
        }
        System.out.println("Product of "+Range+" Natural Numbers is "+mul);
    }
}
