public class StaticMethod {
    public static void Addition(int a,int b)
    {
        int c = a+b;
        System.out.println("Addition of "+a+" + "+b+" = "+c);
    }
    public static void  Repeating(int j)
    {
        for(int i=1;i<=j;i++)
        {
            System.out.println("Welcome to Java World !");
        }
    }
    public static void Subtraction(int a,int b)
    {
        int c = a-b;
        System.out.println("Subtraction of "+a+" - "+b+" = "+c);
    }
    public static void Multiplication(int a,int b) 
    {
        int c = a*b;
        System.out.println("Multiplication of "+a+" * "+b+" = "+c);
    }
    public static void Division(int a,int b) 
    {
        int c = a/b;
        System.out.println("Division of "+a+" / "+b+" = "+c);
    }
    public static void Modulas(int a,int b) 
    {
     int c = a%b;
     System.out.println("Addition of "+a+" % "+b+" = "+c);   
    }
    public static void main(String[] args) {
        Repeating(5);
        Addition(2, 2);
        Subtraction(2, 2);
        Multiplication(2, 2);
        Division(2, 2);
        Modulas(2, 02);
    }
}
