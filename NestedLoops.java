import java.util.Scanner;
public class NestedLoops
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner (System.in);
        System.out.print("Enter rows: ");
        int rows = input.nextInt();
        System.out.print("enter columns: ");
        int columns = input.nextInt();
        for (int row = 0; row < rows; row++)
        {
            for (int col = 0; col < columns; col++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}