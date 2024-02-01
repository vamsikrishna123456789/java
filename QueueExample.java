import java.util.LinkedList;
public class QueueExample
{
    public static void main(String[] args)
    {
        LinkedList<String> queue = new LinkedList<>();
        queue.offer("2");
        queue.offer("3");
        queue.offer("4");
        queue.offer("7");
        String dequeuedElement = queue.poll();
        System.out.println("Dequeued Element: " + dequeuedElement);
        String frontElement = queue.peek();
        System.out.println("Front Element: " + frontElement);
        System.out.println("Elements in the Queue: " + queue);
    }
}