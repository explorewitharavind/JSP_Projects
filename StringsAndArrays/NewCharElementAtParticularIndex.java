import java.util.Scanner;

public class NewCharElementAtParticularIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array!");
        int size = sc.nextInt();
        char[] myArray = new char[size];
        System.out.println("Enter the values into the array!");
        for(int i=0;i<=size-1;i++)
        {
            myArray[i] = sc.next().charAt(0);
        }
        System.out.println("Enter the index you want to replace the value !");
        int index = sc.nextInt();
        System.out.println("Enter the new value into the index  position !");
        char newC = sc.next().charAt(0);
        System.out.print("Printing char Array after changes !");
        for(int i=0;i<=size-1;i++)
        {
            if(index == i)
            {
                myArray[i] = newC;
                System.out.println(myArray[i]);
            }
            else
            {
                System.out.print(myArray[i]);
            }
        }
    }
}
