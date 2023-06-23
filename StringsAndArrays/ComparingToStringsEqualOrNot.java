import java.util.Scanner;

public class ComparingToStringsEqualOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first String !");
        String str1 = sc.nextLine();
        System.out.println("Enter second String !");
        String str2 = sc.nextLine();
        if(str1.equalsIgnoreCase(str2))
        {
            System.out.println("Both Strings are Equal");
        }
        else
        {
            System.out.println("Strings are not Equal !");
        }
    }
}
