import java.util.Scanner;
import java.lang.String;


public class Coins {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] relation = new String[3];


        relation[0] = in.nextLine();
        relation[1] = in.nextLine();
        relation[2] = in.nextLine();


        int maxA = 0;
        int maxB = 0;
        int maxC = 0;

        char bigger;
        char smaller;

        for (int i = 0; i < 3; i++)
        {
            if (relation[i].charAt(1) == '>')
            {
                if (relation[i].charAt(0) == 'A')
                {
                    maxA++;
                }
                else if (relation[i].charAt(0) == 'B')
                {
                    maxB++;
                }
                else
                {
                    maxC++;
                }
            }
            else
            {
                if (relation[i].charAt(2) == 'A')
                {
                    maxA++;
                }
                else if (relation[i].charAt(2) == 'B')
                {
                    maxB++;
                }
                else
                {
                    maxC++;
                }
            }
        }
        /*If each of the 3 characters become the bigger for 1 time, the relations will be impossible.*/
        if ((maxC == 1) && (maxB == 1) && (maxA == 1))
        {
            System.out.println("Impossible");
        }
        else
        {
            int maxNum = Math.max(maxA, Math.max(maxB, maxC));
            int minNum = Math.min(maxA, Math.min(maxB, maxC));

            if (minNum == maxA)
            {
                if (maxNum == maxB)
                {
                    System.out.println("ACB");
                }
                else
                {
                    System.out.println("ABC");
                }
            }
            else if (minNum == maxB)
            {
                if (maxNum == maxC)
                {
                    System.out.println("BAC");
                }
                else
                {
                    System.out.println("BCA");
                }
            }
            else
            {
                if (maxNum == maxA)
                {
                    System.out.println("CBA");
                }
                else
                {
                    System.out.println("CAB");
                }
            }
        }
    }
}
