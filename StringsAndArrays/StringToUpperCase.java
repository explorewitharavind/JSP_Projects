import java.util.Scanner;

public class StringToUpperCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String !");
        String name = sc.nextLine();
        System.out.println(name.toUpperCase());
    }
}
