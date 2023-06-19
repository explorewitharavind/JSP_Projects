import java.util.Scanner;

public class PerfectSquareNumbersInAArray 
{
    public static void PerfectSquares(int[] arr)
    {
        int l = arr.length-1;
        System.out.println("Perfect Square Numbers in A Array : ");
        for(int i=0;i<=l;i++)
        {
            System.out.println(i+1+"."+arr[i]);
        }
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many Perfect Square Numbers You Want to Store ?");
        int NPerfectSquares = sc.nextInt();
        System.out.println("Enter the Minimum Range ");
        int minRange = sc.nextInt();
        int[] myArray = new int[NPerfectSquares];
        int count = 0;
        int j=0;
        for(int i=minRange;count<=NPerfectSquares-1;i++)
        {
            myArray[j] = i*i;
            count++;
            j++;
        }   
        PerfectSquares(myArray);
    }
}
