import java.util.*;
public class Array1
{
    public static void main(String a[])
    {
        ArrayList<String> al= new ArrayList<String>();
        al.add("mike");
        al.add("mick");
        al.add("mile");
        Iterator<String> i=al.iterator();
        for(String ch : al)
        {

            System.out.println(ch);
        }
    }
}