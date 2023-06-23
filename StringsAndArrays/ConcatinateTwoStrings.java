import java.util.Scanner;

public class ConcatinateTwoStrings {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter first String");
        String  name = sc.nextLine();
        System.out.println("Enter second String !");
        String name2 = sc.nextLine();
        System.out.println(name+name2);
    }
}
