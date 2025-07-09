import java.util.Scanner;

public class Some_Sums {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        byte numA = in.nextByte();
        byte numB = in.nextByte();
        int numC = 0;
        int sumOfDigits = 0;
        int totalSum = 0;

        for(int i = 1; i <= num; i++)
        {
            numC = i;
            while (numC != 0)
            {
                sumOfDigits += (numC % 10);
                numC /= 10;
            }
            if(sumOfDigits >= numA && sumOfDigits <= numB)
            {
                totalSum += i;
            }
            sumOfDigits = 0;
        }
        System.out.println(totalSum);
    }
}
