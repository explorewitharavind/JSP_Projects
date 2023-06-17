public class StaticAndNonStaticMethod
{
    public static void Add(int a,int b)
    {
        System.out.println("Addition is : "+(a+b));
    }
    public void Sub(int a,int b)
    {
        System.out.println("Subtraction is :"+(a-b));        
    }
    public void Mul(int a,int b)
    {
        System.out.println("Multiplication is :"+(a*b));
    }
    public static void main(String[] args) {
        StaticAndNonStaticMethod ob = new StaticAndNonStaticMethod();
        ob.Mul(2, 02);
        ob.Sub(2, 02);
        Add(2, 02);
    }
}