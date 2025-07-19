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

        if((numOfab != 0) && (numOfa != 0))
        {
            length = (numOfab*2) + (Math.min(numOfa , numOfb) * 2) + 1;
            if(numOfa == numOfb)
            {
                length--;
            }
        }
        else if((numOfab != 0) && (numOfa == 0))
        {
            length = (numOfab*2);
        }
        else if((numOfab == 0) && (numOfa != 0))
        {
            length = (Math.min(numOfa , numOfb) * 2) + 1;
            if(numOfa == numOfb)
            {
                length--;
            }
        }
        else
        {
            length = 0;
        }
        System.out.println(length);
    }
}
