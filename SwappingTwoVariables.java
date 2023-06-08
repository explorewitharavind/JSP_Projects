import java.util.Scanner;

public class SwappingTwoVariables {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Value ");
        int firstValue = sc.nextInt();
        System.out.println("Enter Second Value");
        int secondValue = sc.nextInt();
        int temp = 0;
        temp = firstValue;
        firstValue = secondValue;
        secondValue = temp;
        System.out.println("After Swapping ");
        System.out.println("First Value is : "+firstValue);
        System.out.println("Second Value is : "+secondValue);
    }
}
