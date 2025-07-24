import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class NextSession {

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int numOfAddedTests = in.nextInt();
        int flag = 0;

        ArrayList<Integer> addedTests = new ArrayList<>();

        for (int i = 0; i < numOfAddedTests; i++)
        {
            int value = in.nextInt();
            addedTests.add(value);
        }

        int minNum = 0;
        int newIndex = 1;
        int i = 0;

        while (i < numOfAddedTests) /*Iterate on all the array elements.*/
        {
            i++;
            minNum = Collections.min(addedTests); /*Minimum element of the arrayList.*/
            /*start comparison from 1 to n - with the minimum elements.*/
            if(minNum == newIndex)  /*new Index found into the previous indexes.*/
            {
                newIndex++; /*Increase the new Index by one.*/
                addedTests.remove(Integer.valueOf(minNum)); /*Remove the minimum element.*/
            }
            else /*The new index not found.*/
            {
                System.out.println(newIndex); /*Print the new index.*/
                flag = 1; /*new available index found between the elements of the array.*/
                break;
            }
        }
        if(flag == 0) /*This means that the number from 1 to the newIndex found into the previous indexes.*/
        {
            System.out.println(newIndex++); /*All the elements from1 to newIndex found into the indexes.*/
        }
    }
}
