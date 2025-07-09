import java.util.Scanner;

public class PUM {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        byte num = in.nextByte();
        int limit = 4*num;

        for(int k = 1; k <= limit; k++)
        {
            if(k % 4 == 0)
            {
                System.out.println("PUM");
            }
            else
            {
                System.out.print(k+" ");
            }
        }
    }
}
