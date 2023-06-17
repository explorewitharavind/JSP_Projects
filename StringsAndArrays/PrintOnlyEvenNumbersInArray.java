import java.util.Scanner;

public class PrintOnlyEvenNumbersInArray {

    public static void PrintOddNumber(int[] arr)
    {
        int l = arr.length-1;
        for(int i=0;i<=l;i++)
        {
            if(arr[i]%2==0)
            {
                System.out.println(arr[i]);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many Numbers you want to Enter");
        int size = sc.nextInt();
        int[] myArray = new int[size];
        for(int i=0;i<=myArray.length-1;i++)
        {
            myArray[i] = sc.nextInt();
        }
        PrintOddNumber(myArray);
    }
}
