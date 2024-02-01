public class InvertedPyramid
{
    public static void main(String[] args)
    {
        int rows = 5;
        printInvertedPyramid(rows);
    }
    static void printInvertedPyramid(int rows)
    {
        for (int i = rows; i >= 1; i--)
        {
            for (int j = 0; j < rows - i; j++)
            {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}