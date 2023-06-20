import java.util.Scanner;

public class MergedArrayAvgValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of first array");
        int size = sc.nextInt();
        int[] myArray = new int[size];
        System.out.println("Enter the values !");
        for(int i=0;i<=size-1;i++)
        {
            myArray[i] = sc.nextInt();
        }
        System.out.println("Enter the size of second array");
        int size2 = sc.nextInt();
        int[] myArray2 = new int[size];
        System.out.println("Enter the values  !");
        for(int i=0;i<=size2-1;i++)
        {
            myArray2[i] = sc.nextInt();
        }
        int size3 = size+size2;
        int[] myArray3 = new int[size3];
        int j=0;
        double sum = 0;
        int count =0;
        for(int i=0;i<=size3-1;i++)
        {
            if(i<=size-1)
            {
                myArray3[i] = myArray[i];
                count++;
            }
            else
            {
                myArray3[i] = myArray2[j];
                j++;
                count++;
            }
            sum = sum + myArray3[i];
        }
        System.out.println("Average value of the third array is :"+sum/count);
    }
}
