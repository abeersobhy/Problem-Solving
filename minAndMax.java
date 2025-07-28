import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class minAndMax {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int numOfElements = in.nextInt();
        ArrayList<Integer> elements = new ArrayList<>();
        /*Store the elements.*/
        for (int i = 0; i < numOfElements; i++)
        {
            int value = in.nextInt();
            elements.add(value);
        }
        /*Sort the elements from smaller to biggest.*/
        Collections.sort(elements);
        /*Print the minimum and maximum element.*/
        System.out.println(elements.get(0) +" "+ elements.get(numOfElements-1));
    }
}
