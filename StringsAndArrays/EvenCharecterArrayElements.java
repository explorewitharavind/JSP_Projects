import java.util.Scanner;

public class EvenCharecterArrayElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array !");
        int size = sc.nextInt();
        char[] mychar = new char[size];
        int[] myArray = new int[size];
        System.out.println("Enter the values into char array!");
        for(int i=0;i<=size-1;i++)
        {
            mychar[i] = sc.next().charAt(0);
            myArray[i] = (int) mychar[i];
        }
        System.out.println("Printing Even Characters ");
        for(int i=0;i<=size-1;i++)
        {
            if(myArray[i]%2==0)
            {
                System.out.println(mychar[i]);
            }
        }
    }
}
