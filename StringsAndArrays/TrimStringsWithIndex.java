import java.util.Scanner;

public class TrimStringsWithIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String ");
        String name = sc.nextLine();
        char[] charArray = name.toCharArray();
        System.out.println("Enter the index you want to start with !");
        int index = sc.nextInt();
        System.out.println("After the trim the string is ");
        for(int i=index;i<=charArray.length-1;i++)
        {
            System.out.print(charArray[i]);
        }
    }
}
