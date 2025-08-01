import java.util.Scanner;

public class BlackSquare {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        int[] calories = new int[4];
        for(int i = 0; i < 4; i++)
        {
            calories[i] = in.nextInt();
        }
        String strips = in.nextLine();
        strips = in.nextLine();
        int totalCalories = 0;

        for(int i = 0; i < strips.length(); i++)
        {
            /*Convert each character of the string to number then get its corresponding calory.*/
            totalCalories += calories[(strips.charAt(i) - 48) - 1];
        }
        System.out.println(totalCalories); /*Print the total number of calories.*/
    }
}
