import java.util.Scanner;

public class EvenNumbersInAArray {

    public static void EvenNumbers(int[] arr)
    {
        int l = arr.length-1;
        System.out.println("Even Numbers in Array are : ");
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
        System.out.println("How many Values You Want to Enter");
        int size = sc.nextInt();
        System.out.println("Now Enter the Values");
        int[] myArray = new int[size];
        for(int i=0;i<=myArray.length-1;i++)
        {
            myArray[i] = sc.nextInt();
        }
        EvenNumbers(myArray);
    }
}
