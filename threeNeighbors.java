import java.util.Scanner;

public class threeNeighbors {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double a = in.nextDouble();
        double b = in.nextDouble();
        double f = in.nextDouble();

        double c = Math.ceil(Math.sqrt((a * a) + (b * b)));

        long length = (long)Math.ceil(c / f); c

        System.out.println(length*length);

    }
}
