import java.util.Scanner;

public class RegularBracketSequence {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String sequence = in.nextLine();

        int bracketsIterator = 0;
        int extra = 0;
        for (int i = 0; i < sequence.length(); i++)
        {
            if(sequence.charAt(i) =='(')
            {
                bracketsIterator++;
            }
            else
            {
                if(bracketsIterator != 0)
                {
                    bracketsIterator--;
                }
                else
                {
                    extra++; /*Number of ')' brackets does not have '(' bracket.*/
                }
            }
        }
        /*length - number of extra ')' brackets - number of extra '(' brackets.*/
        System.out.println(sequence.length() - (bracketsIterator+extra));
    }
}
