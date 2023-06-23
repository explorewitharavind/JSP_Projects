import java.util.Scanner;

public class StringToCharArray {
    public static void main(String[] args) {
        System.out.println("Enter a String !");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        char[] charArray = name.toCharArray();
        for(int i=0;i<=charArray.length-1;i++)
        {
            System.out.println(charArray[i]);
        }
    }
}
