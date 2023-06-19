import java.util.Scanner;
public class MinimumAndMaximumElementInAArray
{
    public static void MinAndMax(int[] arr, int l)
    {
        int Largest = arr[0]%10;
        int Smallest = arr[0]%10;
        l = arr.length-1;
        for(int i=0;i<=l;i++)
        {
            if(arr[i]<Smallest)
            {
                Smallest=arr[i];
            }
            if(arr[i]>Largest)
            {
                Largest = arr[i];
            }
        }
        System.out.println("Maximum Number in Array is : "+Largest);
        System.out.println("Minimum Number in Array is : "+Smallest);
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many Numbers you want to Enter ?");
        int size = sc.nextInt();
        int[] myArray = new int[size];
        System.out.println("Now Enter the Values !");
        for(int i=0;i<=myArray.length-1;i++)
        {
            myArray[i] = sc.nextInt();
        }   
        MinAndMax(myArray, size);
    }
}