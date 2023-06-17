import java.util.Scanner;

public class PrintEvenArrayIndexNumbers {

    public static void EvenArrayIndex(int arr[])
    {
        int l = arr.length-1;
        System.out.println("Even Index Numbers are : ");
        for(int i=0;i<=l;i++)
        {
            if(i%2==0)
            {
                System.out.println(arr[i]);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many Numbers you want ");
        int size = sc.nextInt();
        int[] myArray = new int[size];
        System.out.println("Please enter the Numbers : ");
        for(int i=0;i<=myArray.length-1;i++)
        {
            myArray[i]=sc.nextInt();
        }
        EvenArrayIndex(myArray);
    }
}
