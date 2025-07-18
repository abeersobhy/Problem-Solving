import java.util.Scanner;

public class Hulk
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int numOfLayers = in.nextInt();
        String newSentence = "";

        for(int i = 1; i <= numOfLayers; i++)
        {
            if(i % 2 == 1)
            {
                newSentence += "I hate ";
            }
            else
            {
                newSentence += "I love ";
            }
            if(i < numOfLayers)
            {
                newSentence += "that ";
            }
            else
            {
                newSentence += "it ";
            }
        }
        System.out.println(newSentence);
    }
}
