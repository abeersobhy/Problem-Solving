import java.util.Scanner;

public class Decoding {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int lengthOfEncodedWord = in.nextInt();
        String unused = in.nextLine(); /*Unused variable.*/
        String encodedWord = in.nextLine();
        String decodedWord = "";

        if(lengthOfEncodedWord% 2 == 0) /*Length of the encoded word is even.*/
        {
            for (int i = 1; i <= lengthOfEncodedWord; i++)
            {
                if(i % 2 == 1) /*character with odd index added to the start of the decoded word.*/
                {
                    decodedWord = encodedWord.charAt(i-1) + decodedWord;
                }
                else /*character with even index added to the end of the decoded word.*/
                {
                    decodedWord += encodedWord.charAt(i-1);
                }
            }
        }
        else /*Length of the encoded word is odd.*/
        {
            for (int i = 1; i <= lengthOfEncodedWord; i++)
            {
                if(i% 2 == 1) /*character with odd index added to the end of the decoded word.*/
                {
                    decodedWord += encodedWord.charAt(i-1);
                }
                else /*character with even index added to the start of the decoded word.*/
                {
                    decodedWord = encodedWord.charAt(i-1) + decodedWord;
                }
            }
        }
        System.out.println(decodedWord);
    }
}
