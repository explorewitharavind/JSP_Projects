import java.util.Scanner;

public class StoringValuesIntoAnotherArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = sc.nextInt();
        int[] myArray = new int[size];
         int[] myArray2 = new int[size];
        for(int i=0;i<=size-1;i++)
        {
            myArray[i] = sc.nextInt();
            myArray2[size-1-i] = myArray[i];
        }
        System.out.println("Array values are : ");
        for(int i=0;i<=size-1;i++)
        {
            System.out.println(myArray2[i]);
        }
        
    }
}
