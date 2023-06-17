import java.util.Scanner;

public class SumOfArrayValues {

    public static void AddingArray(int arr[],int l)
    {
        l = arr.length-1;
        int sum = 0;
        for(int i=0;i<=l;i++)
        {
            sum = sum + arr[i];
        }
        System.out.println("Sum of the Numbers is : "+sum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many Numbers you want to add");
        int size = sc.nextInt();
        int[] myArray = new int[size];
        for(int i=0;i<=myArray.length-1;i++)
        {
            myArray[i] = sc.nextInt();
        }
        AddingArray(myArray, size);
    }
}
