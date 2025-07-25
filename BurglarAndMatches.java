import java.util.*;

public class BurglarAndMatches {

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        long CapacityOfBag = in.nextLong(); /*Capacity of the bag.*/
        int numOfContainers = in.nextInt(); /*Number of the containers.*/

        ArrayList<Long> numOfMatchBoxes = new ArrayList<>(); /*Represents the number of boxes.*/
        ArrayList<Integer> numOfMatches = new ArrayList<>(); /*Represents the number of matches of each box.*/

        int i = 0;
        long maximumNumOfMatches = 0;
        long value1 = 0; /*used to get the num of boxes*/
        int value2 = 0; /*used to get the num of matches.*/

        for(int k = 0; k < numOfContainers; k++)
        {
            value1 = in.nextLong();
            numOfMatchBoxes.add(value1); /*Represents the number of matchbox in the i container.*/

            value2 = in.nextInt(); /*Represents the number of matches into this box.*/
            numOfMatches.add(value2);
        }
        while (CapacityOfBag != 0) /*there are available capacity into the bag.*/
        {
            int max = Collections.max(numOfMatches);        /*Maximum num of matches of all boxes.*/
            int indexOfMax = numOfMatches.indexOf(max);     /*Get the index of the maximum num of matches.*/

            if(CapacityOfBag > numOfMatchBoxes.get(indexOfMax)) /*Capacity is bigger than the num of boxes of maximum num of mathces.*/
            {
                maximumNumOfMatches += (numOfMatchBoxes.get(indexOfMax) * max); /*Take all this boxes*/
                CapacityOfBag -= numOfMatchBoxes.get(indexOfMax); /*Decrease the capacity by the number of boxes taken.*/
                numOfMatches.remove(indexOfMax); /*Remove the matches taken.*/
                numOfMatchBoxes.remove(indexOfMax); /*remove the boxes taken.*/
            }
            else /*The capacity is smaller than or equal to the number of boxes with maximum num of matches.*/
            {
                maximumNumOfMatches += (CapacityOfBag * max); /*Take only the capacity of the bag.*/
                CapacityOfBag  = 0; /*The capacity now equals zero.*/
            }
        }
        System.out.println(maximumNumOfMatches);
    }
}
