import java.util.Scanner;

public class Horseshoes {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        long[] colors = new long[4];
        int numOfNeededShoe = 0;
        int repeatedColor = 0;
        boolean[] colorFlags = {false, false, false, false};

        for(int i = 0;i < 4; i++)
        {
            colors[i] = in.nextLong();
        }
        for(int i = 0;i < 3; i++)
        {
            for (int k = i+1; k < 4; k++)
            {
                /*The color repeated and we did not search it before*/
                if((colors[i] == colors[k]) && (colorFlags[i] == false))
                {
                    colorFlags[i] = true;
                    repeatedColor++;
                }
            }
            numOfNeededShoe += repeatedColor;
            repeatedColor = 0;
        }
        System.out.println(numOfNeededShoe);
    }
}
