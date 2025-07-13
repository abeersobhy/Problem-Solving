import java.util.Scanner;

public class L_R_B_Ambidexters {

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        int l = in.nextByte();
        int r = in.nextByte();
        int a = in.nextByte();
        int use = 0;
        if(l > r)
        {
            use = Math.min(a , l-r);
            r += use;
            a -= use;
        }
        else if(r > l)
        {
            use = Math.min(a , r-l);
            l += use;
            a -= use;
        }
        if(a >= 2)
        {
            l += (a/2);
            r += (a/2);
        }
        System.out.println(2*(Math.min(r,l)));
    }

}
