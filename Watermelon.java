import java.util.Scanner;

public class Watermelon {

    public static void main(String[] args)
    {
        byte weight = 0;
        Scanner in = new Scanner(System.in);
        weight = in.nextByte();
        if((weight % 2 == 0) && (weight != 2))
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }
    }
}
