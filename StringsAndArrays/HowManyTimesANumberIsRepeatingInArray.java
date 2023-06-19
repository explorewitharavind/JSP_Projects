import java.util.Scanner;

public class HowManyTimesANumberIsRepeatingInArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many numbers you want to enter ?");
        int size = sc.nextInt();
        int[] myArray = new int[size];
        System.out.println("Now enter the values !");
        for(int i=0;i<=size-1;i++)
        {
            myArray[i] = sc.nextInt();
        }
        System.out.println("Enter a Number to Check How Many Times Repeated");
        int check = sc.nextInt();
        int count = 0;
        for(int j=0;j<=size-1;j++)
        {
            if(check == myArray[j])
            {
                count++;
            }
        }
        System.out.println(check+" is Repeated "+count+" time !");
    }
}
