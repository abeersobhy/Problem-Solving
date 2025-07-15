import java.util.Scanner;

public class Team {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        int numOfProblems = in.nextInt();
        int[][] pointOfView = new int[numOfProblems][3];
        int numOfSolvedProblems = 0;
        int solvedOrNot = 0;
        for(int i = 0; i < numOfProblems; i++)
        {
            for(int k = 0; k < 3; k++)
            {
                pointOfView[i][k] = in.nextInt();
            }
        }
        for(int i = 0; i < numOfProblems; i++)
        {
            for(int k = 0; k < 3; k++)
            {
                if(pointOfView[i][k] == 1)
                {
                    solvedOrNot += 1;
                }
            }
            if (solvedOrNot >= 2)
            {
                numOfSolvedProblems += 1;
            }
            solvedOrNot = 0;
        }
        System.out.println(numOfSolvedProblems);
    }
}
