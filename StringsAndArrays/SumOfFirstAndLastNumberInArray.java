import java.util.Scanner;

public class SumOfFirstAndLastNumberInArray 
{
    public static void SumOfFirstAndLast(int[] arr)
    {
        int l = arr.length-1;
        int sum = 0;
        for(int i=0;i<=l;i++)
        {
            if(i==0 || i==l)
            {
                sum = sum + arr[i];
            }
        }
        System.out.println("Sum of First and Last Values in Array is : "+sum);
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many values you want to enter ? ");
        int size = sc.nextInt();
        int[] myArray = new int[size];
        System.out.println("Now enter the values !");
        for(int i=0;i<=myArray.length-1;i++)
        {
            myArray[i] = sc.nextInt();
        }    
        SumOfFirstAndLast(myArray);
    }    
}
