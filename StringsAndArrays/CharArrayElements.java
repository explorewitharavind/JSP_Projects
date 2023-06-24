import java.util.Scanner;

public class CharArrayElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array!");
        int size = sc.nextInt();
        char[] mychar = new char[size];
        System.out.println("Now enter the values into the char array!");
        for(int i=0;i<=mychar.length-1;i++)
        {
            mychar[i] = sc.next().charAt(0);
        }
        System.out.println("Printing the char array !");
        for(int i=0;i<=mychar.length-1;i++)
        {
            System.out.println(mychar[i]);
        }
    }
}
