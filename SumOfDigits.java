import java.util.Scanner;

public class SumOfDigits {

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        String num = in.nextLine();
        int numOfTimesNeeded = 0;
        long sum = 0;
        String newNum = num;

        while (num.length() != 1)
        {
            numOfTimesNeeded++; /*While the sum of digits is not equal to one digit, it must be summited again.*/
            for (int i = 0; i < num.length(); i++)
            {
                sum += (num.charAt(i) - '0'); /*Sum the digits of each new Number*/
            }
            if(sum > 9) /*Summation is more than 1 digit.*/
            {
                num = Long.toString(sum); /*convert the sum number to string*/
                sum = 0; /*To be ready to the next summation.*/
            }
            else /* Break the loop if the sum is one digit.*/
            {
                break;
            }
        }
        System.out.println(numOfTimesNeeded);
    }
}
