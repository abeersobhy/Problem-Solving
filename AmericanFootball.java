import java.util.Scanner;

public class AmericanFootball
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        int s = in.nextInt();

        if(n < 2) /*If the number of players equal 1.*/
        {
            if((s == a) && (s == b)) /*the summation must be equal to both of a & b*/
            {
                System.out.println("YES");
            }
            else /*Otherwise the equation is not possible.*/
            {
                System.out.println("NO");
            }
        }
        else /*the number of players equal or bigger than 2.*/
        {
            /*  Summation must be between -> ((n-1 * a)) + b - minimum summation of all heights
             and -> ((n-1)* b) + a -> maximum possible summation of all heights .*/
            if((s >= (((n-1) * a) + b)) && (s <= (a + ((n-1) * b))))
            {
                System.out.println("YES");
            }
            else /*Otherwise the equation is not possible.*/
            {
                System.out.println("NO");
            }
        }
    }
}