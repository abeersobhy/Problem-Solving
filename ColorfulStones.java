import java.util.Scanner;

public class ColorfulStones {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        String StoneColor = in.nextLine();
        String StepColor = in.nextLine();
        byte currentPos = 0;

        for(byte k = 0; k < StepColor.length(); k++)
        {
            if(StepColor.charAt(k) == StoneColor.charAt(currentPos))
            {
                if(currentPos < StoneColor.length()-1)
                {
                    currentPos++;
                }
                else
                {
                    break;
                }
            }
        }
        System.out.println(currentPos+1);
    }
}
