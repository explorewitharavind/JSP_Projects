import java.util.Scanner;

 public class OddIndexCharElementsAlongWithASCIIValues {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array!");
        int size = sc.nextInt();
        char[] mychar = new char[size];
        int[] myArray = new int[size];
        System.out.println("Enter the values into the char Array!");
        for(int i=0;i<=size-1;i++)
        {
            mychar[i] = sc.next().charAt(0);
            myArray[i] = mychar[i];
        }
        System.out.println("Printing odd index char values ALong with there ASCII values !");
        for(int i=0;i<=size-1;i++)
        {
            if(i%2!=0)
            {
                System.out.println(mychar[i]+" ASCII value is : "+myArray[i]);
            }
        }
    }
}
