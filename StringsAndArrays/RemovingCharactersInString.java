import java.util.Scanner;

public class RemovingCharactersInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string!");
        String  name = sc.nextLine();
        char[] charArray = name.toCharArray();
        for(int i=0;i<=charArray.length-1;i++)
        {
            if(i%2==0)
            {
                System.out.print(charArray[i]);
            }
        }
    }
}
