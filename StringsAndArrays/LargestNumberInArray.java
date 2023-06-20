import java.util.Scanner;

public class LargestNumberInArray {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = sc.nextInt();
        int[] myArray = new int[size];
        System.out.println("Enter the values !");
        for(int i=0;i<=size-1;i++)
        {
            myArray[i] = sc.nextInt();
        }
        int largest = 0;
        for(int i=0;i<=size-1;i++)
        {
            for(int j=0;j<=size-1;j++)
            {
                if(myArray[i]<myArray[j] && i!=j)
                {
                    myArray[i] =myArray[j];
                    largest = myArray[i];
                }
            }
        }
        System.out.println("Largest Value in the Array is : "+largest);
    }
}