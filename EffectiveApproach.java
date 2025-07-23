import java.util.Scanner;
import java.util.ArrayList;


public class EffectiveApproach {

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        /*Store the number of array list elements.*/
        int numOfElements = in.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        /*Add the elements.*/
        for (int i = 0; i < numOfElements; i++)
        {
            int value = in.nextInt();
            list.add(value);
        }
        /*Build a position array where we can reach the index of an elements in the arrayElements by the value of the elements itself.*/
        int[] pos = new int[numOfElements + 1];
        for (int i = 0; i < numOfElements; i++) {
            int value = list.get(i);
            pos[value] = i;
        }
        /*Store the number of the queries.*/
        int numOfQueries = in.nextInt();
        int[] queries = new int[numOfQueries];
        /*Store the queries itself.*/
        for(int i = 0; i < numOfQueries; i++)
        {
            queries[i] = in.nextInt();
        }

        long comparisonsVasya = 0;
        long comparisonsPetya = 0;
        int indexOfQuery = 0;

        for(int i = 0; i < numOfQueries; i++)
        {
            indexOfQuery = pos[queries[i]]; /*Get the index of the elements from pos array.*/
            comparisonsVasya += (indexOfQuery + 1); /*Number comparisons from 1 to n leads to the index of this element + 1.*/
            comparisonsPetya += (numOfElements - indexOfQuery); /*Number of comparisons from n to 1 leads to the number of elements - index of the element.*/
        }
        System.out.println(comparisonsVasya+ " " + comparisonsPetya);
    }
}

