import java.util.Scanner;

public class PalindromeOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        String Number = sc.nextLine();
        char[] MyChar = Number.toCharArray();
        int Start = 0;
        int end = MyChar.length-1;
        if(Start==end)
        {
            while(Start!=end)
            {
                Start++;
                end--;
            }
            System.out.println("Not Palindrome");
        }
        else{
            System.out.println(" Palindrome");
        }
    }
}
