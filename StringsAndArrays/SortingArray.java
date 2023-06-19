import java.util.Scanner;

public class SortingArray {

    public static void SortedArray(int[] arr,int l)
    {
        l = arr.length-1;
        System.out.println("Sorted Array is : ");
        for(int i=0;i<=l;i++)
        {
            for(int j=i+1;j<=l;j++)
            {
                int temp =0;
                if(arr[i]>arr[j])
                {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many numbers you want to enter ? ");
        int size = sc.nextInt();
        int[] myArray = new int[size];
        System.out.println("Now Enter the Values !");
        for(int i=0;i<=size-1;i++)
        {
            myArray[i]=sc.nextInt();
        }
        SortedArray(myArray, size);
    }
}
