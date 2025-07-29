import java.util.Scanner;

public class Presents {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int numOfFriends = in.nextInt();
        int[] receiver = new int[numOfFriends];

        for(int i = 0; i < numOfFriends; i++)
        {
            receiver[i] = in.nextInt();
        }
        for(int i = 0; i < numOfFriends; i++)
        {
            for(int k = 0; k < numOfFriends; k++)
            {
                /*Search for each friend number started from 1 to n*/
                if(receiver[k] == i+1)
                {
                    System.out.print((k+1)+" "); /*The number of friend gives the gift to i*/
                    break;
                }
            }
        }

    }
}
