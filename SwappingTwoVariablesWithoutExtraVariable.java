import java.util.Scanner;

public class SwappingTwoVariablesWithoutExtraVariable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Value");
        int firstValue = sc.nextInt();
        System.out.println("Enter Second Value");
        int secondValue = sc.nextInt();
        firstValue = firstValue+secondValue;
        secondValue = firstValue-secondValue;
        firstValue = firstValue-secondValue;
        System.out.println("After Swapping ");
        System.out.println("First Value is :"+firstValue);
        System.out.println("Second Value is : "+secondValue);
    }
}
