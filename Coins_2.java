import java.util.Scanner;

public class Coins_2
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.print(n + " ");

        while (n > 1)
        {
            int largestDivisor = 1;
            for (int i = 2; i * i <= n; i++)
            {
                if (n % i == 0)
                {
                    largestDivisor = n / i;
                    break;
                }
            }
            System.out.print(largestDivisor + " ");
            n = largestDivisor;

            System.out.println();
        }
    }
}