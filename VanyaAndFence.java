import java.util.Scanner;

public class VanyaAndFence {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        int numOfFriends = in.nextInt();
        int widthOfFence  = in.nextInt();
        int[] widthOfFriends = new int[numOfFriends];
        int requiredWideth = 0;

        for(int i = 0; i < numOfFriends; i++)
        {
            widthOfFriends[i] = in.nextInt();
        }

        for(int i = 0; i < numOfFriends; i++)
        {
            /*if the width of his friend is more than the width of fence.*/
            if( widthOfFriends[i] > widthOfFence)
            {
                requiredWideth += 2; /*Increase the total needed width by 2 .*/
            }
            else /*if the width of his friend is less than or equal to the width of fence.*/
            {
                requiredWideth++; /*Increase the total needed width by 1 .*/
            }
        }
        System.out.println(requiredWideth);
    }
}
