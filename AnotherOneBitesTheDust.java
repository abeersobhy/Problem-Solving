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

        if(numOfa == numOfb)
        {
            length = (2*numOfb) + (2*numOfab);
        }
        else
        {
            if((numOfab != 0) && (numOfa != 0))
            {
                length = (numOfab*2) + (Math.min(numOfa , numOfb) * 2) + 1;
            }
            else if((numOfab != 0) && (numOfa == 0))
            {
                length = (numOfab*2);
            }
            else if((numOfab == 0) && (numOfa != 0))
            {
                length = (Math.min(numOfa , numOfb) * 2) + 1;
            }
            else
            {
                length = 0;
            }
        }
        System.out.println(length);
    }
}
