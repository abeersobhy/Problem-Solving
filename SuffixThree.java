import java.util.Scanner;

public class SuffixThree
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int numOfTestCases = in.nextInt();
        String[] sentences = new String[numOfTestCases];
        String newString = "";
        /*This step for the enter after reading the num of words, we will override it.*/
        sentences[0] = in.nextLine();
        for (int i = 0; i < numOfTestCases; i++)
        {
            sentences[i] = in.nextLine();
        }
        for(int i = 0; i < numOfTestCases; i++)
        {
            for(int k = 0; k < sentences[i].length(); k++)
            {
                newString = sentences[i].substring((sentences[i].length()- (2 + k)) , sentences[i].length());
                if(newString.equals("po"))
                {
                    System.out.println("FILIPINO");
                    break;
                }
                else if((newString.equals("desu")) || (newString.equals("masu")))
                {
                    System.out.println("JAPANESE");
                    break;
                }
                else if(newString.equals("mnida"))
                {
                    System.out.println("KOREAN");
                    break;
                }
            }
        }

    }
}