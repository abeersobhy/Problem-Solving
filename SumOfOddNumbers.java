import java.util.Scanner;

public class SumOfOddNumbers {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        byte NumOfTestCases = in.nextByte();
        long[][] arr;
        arr = new long[NumOfTestCases][2];
        long[] sum;
        sum = new long[NumOfTestCases];

        for (int i = 0; i < NumOfTestCases ; i++)
        {
            for(int k = 0; k < 2; k++)
            {
                arr[i][k] = in.nextLong();
            }
        }

        for (int i = 0; i < NumOfTestCases ; i++)
        {
            for(long j = (Math.min(arr[i][0], arr[i][1])) + 1 ; j < (Math.max(arr[i][0], arr[i][1])); j++)
            {
                if(j % 2 != 0)
                {
                    sum[i] += j;
                }
            }
            System.out.println(sum[i]);
        }
    }
}
