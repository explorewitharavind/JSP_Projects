import java.util.Scanner;

public class ReverseStringWithSameIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String !");
        String name = sc.nextLine();
        String[] myStrings = name.split(" ");
            for(int j=0;j<=myStrings.length-1;j++)
            {
                StringBuilder ob = new StringBuilder(myStrings[j]);
                ob.reverse();
                System.out.print(ob+" ");
            }
    }
}