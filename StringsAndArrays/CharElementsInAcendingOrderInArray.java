import java.util.Scanner;

public class CharElementsInAcendingOrderInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array !");
        int size = sc.nextInt();
        char[] mychar = new char[size];
        System.out.println("Enter the charecters into the array !");
        for(int i=0;i<=size-1;i++)
        {
            mychar[i] = sc.next().charAt(0);
        }
        for(int i=0;i<=size-1;i++)
        {
            for(int j=i+1;j<=size-1;j++)
            {
                char temp = 0;
                if(mychar[i]>mychar[j])
                {
                    temp = mychar[i];
                    mychar[i] = mychar[j];
                    mychar[j] = temp;
                }
            }
            System.out.println(mychar[i]);
        }
    }
}
