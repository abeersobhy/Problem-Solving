import java.util.Scanner;

public class AnotherOneBitesTheDust
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        long numOfa = in.nextLong();
        long numOfb = in.nextLong();
        long numOfab = in.nextLong();

        long length = 0;
        /*The same number of a and b*/
        if(numOfa == numOfb)
        {
            length = (2*numOfb) + (2*numOfab);
        }
        else
        {
            length = (numOfab*2) + (Math.min(numOfa , numOfb) * 2) + 1;
        }
        System.out.println(length);
    }
}
