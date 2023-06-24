import java.util.Scanner;

public class MergeTwoCharArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first array size");
        int size = sc.nextInt();
        char[] myArray = new char[size];
        System.out.println("Enter the charecters into the First array!");
        for(int i=0;i<=size-1;i++)
        {
            myArray[i] = sc.next().charAt(0);
        }
        System.out.println("Enter the size of the second array!");
        int size2 = sc.nextInt();
        char[] myArray2 = new char[size2];
        System.out.println("Enter the values into the second Array!");
        for(int i=0;i<=size2-1;i++)
        {
            myArray2[i] = sc.next().charAt(0);
        }
        int merge = size+size2;
        char MergeArray[] = new char[merge];
        System.out.print("Merged Array is :");
        int j=0;
        for(int i=0;i<=merge-1;i++)
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
            System.out.print(MergeArray[i]);
        }
    }
}
