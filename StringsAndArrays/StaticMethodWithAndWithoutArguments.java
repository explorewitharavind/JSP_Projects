public class StaticMethodWithAndWithoutArguments {
    public static void Addition(int a,int b)
    {
        System.out.println("Addition is : "+(a+b));
        Add();
    }
    public static void Add()
    {
        int a = 10;
        int b = 20;
        System.out.println(a+b);
    }
    public static void main(String[] args) {
        Addition(20, 30);
    }
}
