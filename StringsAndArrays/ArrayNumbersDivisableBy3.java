import java.util.Scanner;

public class ArrayNumbersDivisableBy3 
{
    public static void DivisableBy3(int[] arr)
    {
        int l = arr.length-1;
        System.out.println("Array Elements which are Divisible by 3 are :");
        for(int i=0;i<=l;i++)
        {
            if(arr[i]%3==0)
            {
                System.out.println(arr[i]);
            }
        }
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many values you want to enter ?");
        int size = sc.nextInt();
        int[] myArray = new int[size];
        System.out.println("Now Enter the Values !");
        for(int i=0;i<=myArray.length-1;i++)
        {
            myArray[i] = sc.nextInt();
        }    
        DivisableBy3(myArray);
    }    
}
