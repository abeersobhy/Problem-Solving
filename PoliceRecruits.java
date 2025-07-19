import java.util.Scanner;

public class PoliceRecruits {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int numberOfEvents = in.nextInt();
        int[] events = new int[numberOfEvents];
        int unTreatedProblems = 0;
        int recruited_Officers = 0;

        for (int i = 0; i < numberOfEvents; i++)
        {
            events[i] = in.nextInt();
        }
        for (int i = 0; i < numberOfEvents; i++)
        {
            /*A crime has occurred, and there are no recruited officers.*/
            if((events[i] == -1) && (recruited_Officers == 0))
            {
                unTreatedProblems++; /*Increase the number of untreated problems by one.*/
            }
            else if((events[i] == -1) && (recruited_Officers > 0)) /*A crime has occurred, recruited officer available to handle.*/
            {
                recruited_Officers--; /*Decrease the number of untreated problems by one.*/
            }
            else if (events[i] != -1) /*New recruited officers added.*/
            {
                recruited_Officers += events[i];
            }
        }
        System.out.println(unTreatedProblems);
    }
}
