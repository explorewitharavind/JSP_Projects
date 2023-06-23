import java.util.Scanner;

public class StringToPascalRule {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String !");
        String name = sc.nextLine();
        String i = name.substring(0,1);
        System.out.print(i.toUpperCase());
        System.out.print(name.substring(1));
    }
}
