import java.util.Scanner;
public class InsertANumberInSpecifixIndex
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size");
        int size = sc.nextInt();
        int[] myArray = new int[size];
        for(int i=0;i<=size+1;i++)
        {
            myArray[i] = sc.nextInt();
        }
        int index = 2;
        int number = 100;
        for(int i=0;i<=size+1;i++)
        {
            if(i==index)
            {
                myArray[i+1] = myArray[i];
                myArray[i] = number;
                System.out.print(myArray[i]+",");
            }
            else
            {
                System.out.print(myArray[i]+",");
                myArray[i+1] = myArray[i];
            }
        }
    }
}