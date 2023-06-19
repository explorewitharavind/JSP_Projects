import java.util.Scanner;

public class MoveAllTheNegativeNumbersToTheEnd {

    public static void MovingNegativeToEnd(int[] arr,int l)
    {
        l = arr.length-1;
        System.out.println("After moving all Negative Numbers");
        for(int i=0;i<=l;i++)
        {
            for(int j=i+1;j<=l;j++)
            {
                int temp =0;
                if(arr[i]<arr[j])
                {
                    temp = arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                }
            }
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many numbers you want to enter !");
        int size = sc.nextInt();
        int[] myArray = new int[size];
        System.out.println("Now Enter the values !");
        for(int i=0;i<=size-1;i++)
        {
            myArray[i] = sc.nextInt();
        }
        MovingNegativeToEnd(myArray, size);
    }
}
