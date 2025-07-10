import java.util.Scanner;

public class fourNumbers {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        long n1, n2, n3, n4;
        n1 = in.nextLong();
        n2 = in.nextLong();
        n3 = in.nextLong();
        n4 = in.nextLong();

        System.out.println(n1*n2*n3*n4);

    }
}
