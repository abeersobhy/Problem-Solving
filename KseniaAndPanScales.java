import java.util.Scanner;

public class KseniaAndPanScales {

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String text =  in.nextLine();
        String plusText = in.nextLine();

        int indexOfLine = text.indexOf('|');
        int numOfCharAfterLine = text.length() - indexOfLine - 1;
        int numOfCharBeforeLine = text.length() - numOfCharAfterLine - 1;

        String newLeft = "";
        String newRight= "";

        int balanceChar = Math.abs(numOfCharBeforeLine-numOfCharAfterLine);

        if(((balanceChar == 0) && (plusText.length() % 2 == 1)) || (plusText.length() < balanceChar))
        {
            System.out.println("Impossible");
        }
        else if(((balanceChar % 2 == 1) && (plusText.length() % 2 == 0)) || ((balanceChar % 2 == 0) && (plusText.length() % 2 == 1)))
        {
            System.out.println("Impossible");
        }
        else
        {
            if(numOfCharBeforeLine > numOfCharAfterLine)
            {
                /*Balance the two sides, and extract the rest plus text*/
                newRight = text.substring(indexOfLine+1,text.length()) + plusText.substring(0,balanceChar);
                plusText = plusText.substring(balanceChar, plusText.length());
                /*Divide the rest characters to both of the sides*/
                newRight += plusText.substring(0, (plusText.length()/2));
                newLeft =  text.substring(0,indexOfLine) + plusText.substring(plusText.length()/2 , plusText.length());

            }
            else if(numOfCharBeforeLine < numOfCharAfterLine)
            {
                /*Balance the two sides, and extract the rest plus text*/
                newLeft = text.substring(0,indexOfLine) + plusText.substring(0,balanceChar);
                plusText = plusText.substring(balanceChar, plusText.length());
                /*Divide the rest characters to both of the sides*/
                newLeft += plusText.substring(0, (plusText.length()/2));
                newRight = text.substring(indexOfLine+1 , text.length()) + plusText.substring(plusText.length()/2 , plusText.length());
            }
            else
            {
                /*No balance needed, Divide the plus text into two parts for both sides.*/
                newLeft = text.substring(0,indexOfLine) + plusText.substring(0, (plusText.length()/2));
                newRight = text.substring(indexOfLine+1 , text.length()) + plusText.substring(plusText.length()/2 , plusText.length());
            }
            System.out.println(newLeft + "|" + newRight);
        }
    }
}
