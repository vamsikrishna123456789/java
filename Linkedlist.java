import java.util.*;
public class Linkedlist
{
    public static void main(String a[])
    {
        LinkedList<String> al= new LinkedList<String>();
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