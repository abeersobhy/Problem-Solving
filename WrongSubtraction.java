import java.util.Scanner;

public class WrongSubtraction {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        long number = in.nextLong();
        int numOfSubtraction = in.nextInt();

        for(int i = 0; i < numOfSubtraction; i++)
        {
            if((number % 10) != 0) /*Last digit of number is not equal to 0*/
            {
                number--; /*decrease the last digit by 1.*/
            }
            else /*Last digit is 0.*/
            {
                number /= 10; /*Delete the last digit.*/
            }
        }
        System.out.println(number);
    }
}
