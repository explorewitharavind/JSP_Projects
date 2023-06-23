import java.util.Scanner;

public class ChangingCharactersInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String !");
        String name = sc.nextLine();
        char[] charArray = name.toCharArray();
        System.out.println("Enter a character you want to change !");
        char oc = sc.next().charAt(0);
        System.out.println("Enter a character to replace !");
        char re = sc.next().charAt(0);
        for(int i=0;i<=charArray.length-1;i++)
        {
            if(charArray[i] == oc)
            {
                charArray[i] = re;
            System.out.print(charArray[i]);
            }
            else
            {
                System.out.print(charArray[i]);
            }
        }
    }
}
