import java.util.Scanner;

public class wayTooLongWords {

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int numOfWords = in.nextInt();
        String[] words = new String[numOfWords];
        words[0] = in.nextLine(); /*This step for the enter after reading the num of words, we will override it.*/
        for(int i = 0; i < numOfWords; i++)
        {
            words[i] = in.nextLine();
        }
        for(int i = 0; i < numOfWords; i++)
        {
            if(words[i].length() > 10)
            {
                System.out.println(words[i].charAt(0) + Integer.toString((words[i].length())-2)+ words[i].charAt((words[i].length())-1));
            }
            else
            {
                System.out.println(words[i]);
            }
        }
    }
}
