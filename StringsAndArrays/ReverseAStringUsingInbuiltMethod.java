import java.util.Scanner;

public class ReverseAStringUsingInbuiltMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String!");
        String name = sc.nextLine();
        StringBuilder ob = new StringBuilder(name);
        ob.reverse();
        System.out.println(ob);
    }
}
