import java.util.Scanner;

public class SumOfArrayElements 
{
    public static void Sum(int[] arr)
    {
        int l = arr.length-1;
        int sum = 0;
        for(int i=0;i<=l;i++)
        {
            sum = sum+arr[i];
        }
        System.out.println("Sum of the array Elements is : "+sum);
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many values you want to enter ?");
        int size = sc.nextInt();
        int[] myArray = new int[size];
        System.out.println("Now Enter the values !");
        for(int i=0;i<=myArray.length-1;i++)
        {
            myArray[i] = sc.nextInt();
        }    
        Sum(myArray);
    }    
}
