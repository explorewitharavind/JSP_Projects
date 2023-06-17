import java.util.Scanner;

public class SwapFirstAndLastNumbersInArray 
{
    public static void SwapFirstAndLast(int[] arr)
    {
        int l = arr.length-1;
        int temp = 0;
        System.out.println("After Swapping First and Last Numbers in Array : ");
        for(int i=0;i<=l;i++)
        {
           if(i==0 || i==l)
           {
            temp = arr[i];
            arr[i] = arr[l];
            arr[l] = temp;
           }
           System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many values you want to enter ?");
        int size = sc.nextInt();
        int[] myArray = new int[size];
        System.out.println("Now enter the values !");
        for(int i=0;i<=myArray.length-1;i++)
        {
            myArray[i] = sc.nextInt();
        }
        SwapFirstAndLast(myArray);
    }    
}
