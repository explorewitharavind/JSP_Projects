import java.util.Scanner;

public class ArrayValuesInReverseOrder 
{
    public static void ReverseOrder(int[] arr)
    {
        int l = arr.length-1;
        System.out.println("After Reversing the Array Now the Values are : ");
        for(int i = l;i>=0;i--)
        {
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many values you want to enter ?");
        int size = sc.nextInt();
        int[] myArray = new int[size];
        System.out.println("Now enter the values !");
        for(int i=0;i<=myArray.length-1;i++)
        {
            myArray[i] = sc.nextInt();
        }    
        ReverseOrder(myArray);
    }    
}
