public class Factorial
{
    public static void main(String[] args)
    {
        int n=5;
        int Factorial=Fact(n);
        System.out.println(+Factorial);
    }
    static int Fact(int num)
    {
        if(num==0||num==1)
        {
            return 1;
        }
        else {
            return num*Fact(num-1);
        }
    }
}