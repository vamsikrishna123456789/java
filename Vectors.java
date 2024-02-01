import java.util.*;
public class Vectors
{
    public static void main(String a[])
    {
        Vector<String> al= new Vector<String>();
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