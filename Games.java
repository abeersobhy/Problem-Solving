import java.util.Scanner;

public class Games {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int numOfTeams = in.nextInt();
        int[][] teamsColors = new int[numOfTeams][2];
        int numOfTimes = 0;

        for(int i = 0; i < numOfTeams ; i++)
        {
            teamsColors[i][0] = in.nextInt(); /*Home Color.*/
            teamsColors[i][1] = in.nextInt(); /*Guest Color.*/
        }

        for(int i = 0; i < numOfTeams ; i++)
        {
            for(int k = 0; k < numOfTeams; k++)
            {
                if(i == k) /*Search only on the other teams guest color.*/
                {
                    continue;
                }
                else
                {
                    if(teamsColors[i][0] == teamsColors[k][1]) /*Home color equal to guest color*/
                    {
                        numOfTimes++;
                    }
                }
            }
        }
        System.out.println(numOfTimes);
    }
}
