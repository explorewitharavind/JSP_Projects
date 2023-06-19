import java.util.Scanner;
public class MergingTwoArrays
{
    public static void Merge(int[] arr)
    {
        int l = arr.length-1;
        System.out.println("Merged Array Values are : ");
        for(int i=0;i<=l;l++)
        {
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many Elements you want to enter in First Array ?");
        int size = sc.nextInt();
        int[] myArray = new int[size];
        System.out.println("Now Enter the values !");
        for(int i=0;i<=size-1;i++)
        {
            myArray[i] = sc.nextInt();
        }
        System.out.println("How many Elements you want to enter in Second Array  ?");
        int size2 = sc.nextInt();
        int[] myArray2 = new int[size2];
        System.out.println("Now Enter the values !");
        for(int i=0;i<=size2-1;i++)
        {
            myArray2[i] = sc.nextInt();
        }
        int size3 = size+size2;
        int[] MergeArray = new int[size3];
        int j=0;
        System.out.println("Merged array values are : ");
        for(int i=0;i<=size3-1;i++)
        {
            if(i<=size-1)
            {
                MergeArray[i] = myArray[i];
            }
            else
            {
                MergeArray[i] = myArray2[j];
                j++;
            }
            System.out.print(MergeArray[i]+",");
        }
    }
}