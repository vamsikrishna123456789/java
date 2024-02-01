import java.util.*;
public class HashMapExample{
    public static void main(String args[]) {
        HashMap<Integer,String> map=new HashMap<Integer,String>();
        map.put(100,"shashi");
        map.put(101,"krish");
        map.put(102,"surabhi");
        map.put(103, "india");
        System.out.println("Initial list of elements: "+map);
        map.remove(100);
        System.out.println("Updated list of elements: "+map);
    }
}