import java.util.Scanner;

public class PalindromeNumbersInAArray 
{
    public static void PalindromesInArray(int[] arr,int l)
    {
         l = arr.length-1;
         System.out.println("After Storing Palindrome Values in an Array :");
        for(int i=0;i<=l;i++)
        {
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many Palindrome Numbers you want to store ?");
        int NPalindromes = sc.nextInt();
        int count =0;
        int j=0;
        System.out.println("Enter Minimum Range to Store Palindromes in Array !");
        int minRange = sc.nextInt();
        int[] myArray = new int[NPalindromes];
        for(int i=minRange;count<=NPalindromes-1;i++)
        {
            int temp = i;
            int rev = 0;
            while(temp!=0)
            {
                int last_digit = temp%10;
                rev = rev * 10 + last_digit;
                temp = temp/10;
            }
            if(rev == i)
            {
                myArray[j] = i;
                j++;
                count++;
            }
        }
        PalindromesInArray(myArray,j);
    }    
}
