import java.util.Scanner;

public class StonesOnTheTable {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int numOfStones = in.nextInt();
        String colorsOfStones = in.nextLine();
        colorsOfStones = in.nextLine();

        StringBuilder sb = new StringBuilder(colorsOfStones); /*Make a string builder from the entered string.*/
        int i = 0;
        while (i < (colorsOfStones.length()-1))
        {
            if(colorsOfStones.charAt(i) == colorsOfStones.charAt(i+1)) /*Two similar character next to each other.*/
            {
                sb.deleteCharAt(i); /*Remove the first of them.*/
                colorsOfStones = sb.toString(); /*Edit the string after delete the character.*/
            }
            else /*No repeated colors next to each others.*/
            {
                i++; /*Move to the next character.*/
            }
        }
        System.out.println(numOfStones - colorsOfStones.length()); /*Decrease the num of stones by the new length of the stones.*/
    }
}
