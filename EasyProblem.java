import java.util.Scanner;

public class EasyProblem {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] op = new int[n];
        boolean hardOrNot = false;
        for (int i = 0; i < n; i++)
        {
            op[i] = in.nextInt();
        }
        for (int i = 0; i < n; i++)
        {
            if(op[i] == 1)
            {
                System.out.println("HARD");
                hardOrNot = true;
                break;
            }
        }
        if(hardOrNot == false)
        {
            System.out.println("EASY");
        }
    }
}
