import java.util.Scanner;

public class newPassword {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int lengthOfpassword = in.nextInt();
        int numOfKcharacters = in.nextInt();
        int k = 0;
        String newPassword = "";
        String character = "abcdefghijklmnopqrstuvwxyz";

        while (newPassword.length() != lengthOfpassword)  /*Add characters until the new password reach the required length.*/
        {
            if(k < numOfKcharacters) /*Add all K characters.*/
            {
                newPassword += character.charAt(k); /*Add the k characters to the new paswword first.*/
                k++;
            }
            else /*If the k characters added and the length of the new password does not match the required length*/
            {
                k = 0; /*Start added the same characters to the new password.*/
            }
        }
        System.out.println(newPassword);
    }
}
