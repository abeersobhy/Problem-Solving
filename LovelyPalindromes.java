import java.util.Scanner;

public class LovelyPalindromes {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String numOfPalindrome = in.nextLine();

        /*First half of each palindrome is the num of it.*/
        String lovelyPalindrome = numOfPalindrome;

        // Create a StringBuilder object with the original string
        StringBuilder stringBuilder = new StringBuilder(numOfPalindrome);

        // Use the reverse() method of StringBuilder
        stringBuilder.reverse();

        // Convert the reversed StringBuilder back to a String and add it to the lovely palindrome
        lovelyPalindrome += stringBuilder.toString();

        System.out.println(lovelyPalindrome);
    }
}



