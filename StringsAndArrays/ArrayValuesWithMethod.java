import java.util.Scanner;
public class ArrayValuesWithMethod {
    public static void Array(int[] arr,int l)
    {
         l = arr.length-1;
        for(int i=0;i<=l;i++)
        {
            System.out.println(arr[i]);
        }
    }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("How many Values you want to Enter");
            int Number = sc.nextInt();
            int[] myArray = new int[Number];
            for(int i=0;i<=myArray.length-1;i++)
            {
                myArray[i]=sc.nextInt();
            }
            System.out.println("You Entered"); 
            Array(myArray, Number);
        }
    }
