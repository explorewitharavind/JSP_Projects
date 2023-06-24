import java.util.Scanner;

public class CharArraySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the Array!");
        int size = sc.nextInt();
        char mychar[] = new char[size];
        int myArray[] = new int[size];
        System.out.println("Enter the char values into the array!");
        for(int i=0;i<=size-1;i++)
        {
            mychar[i] = sc.next().charAt(0);
            myArray[i] =(int) mychar[i];
        }
        int sum = 0;
        for(int i=0;i<=size-1;i++)
        {
           sum = sum + myArray[i];
        }
        System.out.println("Sum of the char Array elements is : "+sum);
    }
}
