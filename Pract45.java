public class Pract45
{
    public static void main(String args[])
    {
        int i,j,k;
        for(i=1;i<=5;i++)
        {
            for(k=5-i;k>=1;k--)
            {
                System.out.print(" ");
            }
            for(j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        for(i=4;i>=1;i--)
        {
            for(k=5-i;k>=1;k--)
            {
                System.out.print(" ");
            }
            for(j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}