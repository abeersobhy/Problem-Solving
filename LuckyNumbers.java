import java.util.Scanner;

public class LuckyNumbers {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int a_start = in.nextInt();
        int b_end = in.nextInt();

        boolean flag = false;
        int counter = 0;
        int iterator = 0;

        for(int i = a_start; i <= b_end; i++)
        {
            iterator = i; /*Take the next number*/
            while (iterator != 0) /*Check all digits.*/
            {
                if(((iterator % 10) != 4) && ((iterator % 10) != 7)) /*Not lucky number.*/
                {
                    flag = true;
                    break;
                }
                iterator /= 10; /*Delete the tested digit.*/
            }
            if(flag == false) /*Lucky number.*/
            {
                counter++; /*Increase the number of lucky numbers by one.*/
                System.out.print(i + " "); /*print the lucky number.*/
            }
            else /*Not lucky*/
            {
                flag = false; /*Reset the flag.*/
            }
        }
        if(counter == 0) /*No lucky numbers.*/
        {
            System.out.print(-1);
        }
    }
}
