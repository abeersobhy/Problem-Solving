import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BurglarAndMatches_V1_1 {

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int CapacityOfBag = Integer.parseInt(st.nextToken()); /*Capacity of the bag.*/
        int numOfContainers = Integer.parseInt(st.nextToken()); /*Number of the containers.*/

        int[][] boxesAndMatches = new int[numOfContainers][2];

        for (int i = 0; i < numOfContainers; i++) {
            st = new StringTokenizer(br.readLine());
            boxesAndMatches[i][0] = Integer.parseInt(st.nextToken()); // boxes
            boxesAndMatches[i][1] = Integer.parseInt(st.nextToken()); // matches
        }

        long maximumNumOfMatches = 0;
        long value1 = 0; /*used to get the num of boxes*/
        int value2 = 0; /*used to get the num of matches.*/
        int k = 0;

        /*Sort the array from biggest to smallest based on the number of matches.*/
        Arrays.sort(boxesAndMatches, (a, b) -> b[1] - a[1]);

        while ((CapacityOfBag != 0) && (k < numOfContainers))
        {
            if(CapacityOfBag > boxesAndMatches[k][0])
            {
                /*Num of boxes multiplied by num of matches.*/
                maximumNumOfMatches += ((long)boxesAndMatches[k][0] * boxesAndMatches[k][1]);
                CapacityOfBag -= boxesAndMatches[k][0]; /*Decrease the capacity of the bag by the number of boxes.*/
            }
            else
            {
                /*Take only the capacity of the bag, Num of capacity boxes multiplied by num of matches into those boxes.*/
                maximumNumOfMatches += ((long) CapacityOfBag * boxesAndMatches[k][1]);
                CapacityOfBag = 0; /*No available places.*/
            }
            k++;
        }
        System.out.println(maximumNumOfMatches);
    }
}
