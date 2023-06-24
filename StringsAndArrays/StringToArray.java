import java.util.Scanner;

public class StringToArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String!");
        String name = sc.nextLine();
        String [] myStrings2 = name.split(" ");
        for(int i=0;i<=myStrings2.length-1;i++)
        {
            System.out.print(myStrings2[i]+" ");
        }
    }
}
