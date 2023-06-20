import java.util.Scanner;

public class ElementandIndexValue {
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
        System.out.println("Enter the value to check !");
        int check = sc.nextInt(); 
        for(int i=0;i<=size-1;i++)
        {
            if(myArray[i]==check)
            {
                System.out.println(check+" is present in the array");
                System.out.println(i+" is the index of the number !");
            }
        }
    }
}
