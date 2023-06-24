import java.util.Scanner;

public class StringPalindrome {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a String !");
        String name = s.nextLine();
        char[] mychar = name.toCharArray();
        char[] myArray = name.toCharArray();
        int j=0;
        for(int i=myArray.length-1;i>=0;i--)
        {
            myArray[j] = myArray[i];
            j++;
        }
        int count = 0;
        for(int i=0;i<=myArray.length-1;i++)
        {
            if(myArray[i]==mychar[i])
            {
                count++;
            }
        }
        if(count==name.length())
            {
                System.out.println("Palindrome");
            }
            else
            {
                System.out.println("Not palindrome !");
            }
    }
}
