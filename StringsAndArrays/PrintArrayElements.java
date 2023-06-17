import java.util.Scanner;
public class PrintArrayElements {

    public static void PrintArray(int[] arr)
    {
        int l = arr.length-1;
        System.out.println("You have entered : ");
        for(int i=0;i<=l;i++)
        {
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many Values you want to Enter");
        int size = sc.nextInt();
        int[] myArray = new int[size];
        System.out.println("Now Enter the Values ");
        for(int i=0;i<=myArray.length-1;i++)
        {
            myArray[i] = sc.nextInt();
        }
        PrintArray(myArray);
    }
}
