import java.util.Scanner;

public class BearAndBigBrother {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int a_limak = in.nextInt();
        int b_bob = in.nextInt();
        int numOfYears = 0;
        while (a_limak <= b_bob)
        {
               a_limak *= 3;
               b_bob *= 2;
               numOfYears += 1;
        }
        System.out.println(numOfYears);
    }
}
