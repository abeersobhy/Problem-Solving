import java.util.Scanner;

public class YaroAndPerm {

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        byte numOfEelements = in.nextByte();
        int[] arrOfElements = new int[numOfEelements];
        int maxFreq = 1;
        int freq = 1;

        for(byte i = 0; i < numOfEelements; i++)
        {
            arrOfElements[i] = in.nextInt();
        }
        for(int i = 0; i < numOfEelements; i++)
        {
            for (int k = i+1; k < numOfEelements; k++)
            {
                if (arrOfElements[i] == arrOfElements[k])
                {
                    freq += 1;
                }
            }
            if (freq > maxFreq)
            {
                maxFreq = freq;
            }
            freq = 1;
        }
        if(((float)(numOfEelements+1)/2.0) >= maxFreq)
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }
    }
}
