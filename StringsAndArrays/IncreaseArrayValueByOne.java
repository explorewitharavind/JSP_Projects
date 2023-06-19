import java.util.Scanner;

public class IncreaseArrayValueByOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many numbers you want in an array ?");
        int size = sc.nextInt();
        int[] myArray =  new int[size];
        for(int i=0;i<=size-1;i++)
        {
            myArray[i] = sc.nextInt();
        }
        System.out.println("Array is : ");
        for(int i=0;i<=size-1;i++)
        {
            System.out.println(myArray[i]+1);
        }
    }
}
