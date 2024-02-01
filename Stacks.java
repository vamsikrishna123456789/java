import java.util.*;
public class Stacks
{
    public static void main(String a[])
    {
        Stack<String> al= new Stack<String>();
        al.add("santhu");
        al.add("mick");
        al.add("mile");
        Iterator<String> i=al.iterator();
        for(String ch : al)
        {

            System.out.println(ch);
        }
    }
}