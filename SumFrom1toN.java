import java.util.Scanner;

public class SumFrom1toN {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        long num = in.nextLong();

        System.out.println((num*(num+1)/2));
    }
}
