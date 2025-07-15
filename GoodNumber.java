import java.util.Scanner;

public class GoodNumber {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int numOfNumbers = in.nextInt();
        char limit = in.next().charAt(0);

        String[] Numbers = new String[numOfNumbers];
        boolean flag = false;
        int digits = 0;
        int GoodK = 0;
        String chainOfNum = "";
        String x = in.nextLine();

        for (int i = 0; i < numOfNumbers; i++)
        {
            Numbers[i] = in.nextLine();
        }
        for (char i = '0'; i <= limit; i++)
        {
            chainOfNum += i;
        }
        for (int i = 0; i < numOfNumbers; i++)
        {
            for (int m = 0; m < (Character.getNumericValue(limit) + 1); m++)
            {
                for (int k = 0; k < Numbers[i].length(); k++)
                {
                    if(chainOfNum.charAt(m) == Numbers[i].charAt(k))
                    {
                        flag = true;
                    }
                }
                if(flag == true)
                {
                    digits++;
                }
                flag = false;
            }
            if(digits == (Character.getNumericValue(limit) + 1))
            {
                GoodK++;
            }
            digits = 0;
        }
        System.out.println(GoodK);
    }
}
