import java.util.Scanner;

public class ArrayMethod 
{
    public static void MyArray(int[] arr)
    {
        int l = arr.length-1;
        for(int i=1;i<=l;i++)
        {
            System.out.println(arr);
        }
    }
    public static void main(String[] args) {
        int[] myArray = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any 5 Values ");
        for(int i=0;i<=myArray.length-1;i++)
        {
            myArray[i] = sc.nextInt();
        }
        System.out.println("You Entered ");
        for(int i=0;i<=myArray.length-1;i++)
        {
            System.out.println(myArray[i]);
        }
    }
}
