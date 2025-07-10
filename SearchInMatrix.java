import java.util.Scanner;

public class SearchInMatrix {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        byte N = in.nextByte();
        byte M = in.nextByte();
        boolean flag = false;
        long[][] arr;
        arr = new long[N][M];

        for(int i = 0 ; i < N; i++)
        {
            for (int k = 0 ; k < M; k++)
            {
                arr[i][k] = in.nextLong();
            }
        }
        long X = in.nextLong();
        for(int i = 0 ; i < N; i++)
        {
            for (int k = 0 ; k < M; k++)
            {
                if(X == arr[i][k])
                {
                    flag = true;
                }
            }
        }
        if(!flag)
        {
            System.out.println("will take number");
        }
        else
        {
            System.out.println("will not take number");
        }
    }
}
