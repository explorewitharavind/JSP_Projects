 import java.util.Scanner;

public class AddNewCharecterIntoTheArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array!");
        int size = sc.nextInt();
        char[] myArray = new char[size];
        char[] mychar = new char[size+1];
        System.out.println("Enter the char values into the array!");
        for(int i=0;i<=size-1;i++)
        {
            myArray[i] = sc.next().charAt(0);
            mychar[i] = myArray[i];
        }
        System.out.println("Enter the index you want to add new charecter !");
        int index = sc.nextInt();
        System.out.println("Enter the value !");
        char c = sc.next().charAt(0);
        System.out.println("Printing the array!");
        for(int i=0;i<=size;i++)
        {
            if(i==index)
            {
                mychar[i] = c;
                for(int j=i+1;j<=size;j++)
                {
                    mychar[j] = myArray[index];
                    index++;
                }

            }
           System.out.println(mychar[i]);
        }
    }
}
