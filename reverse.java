public class reverse {
    public static void main(String[] args) {
        int a[] = {5, 6, 7, 8, 9};
        int b[] = {6, 8, 9, 2};
        int i;
        for (i = 0; i < a.length; i++)
        {
            System.out.println(a[a.length - i - 1]);
        }
    }
}