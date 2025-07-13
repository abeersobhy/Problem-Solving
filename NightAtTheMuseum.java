import java.util.Scanner;

public class NightAtTheMuseum {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String text = in.nextLine();
        String characters = "abcdefghijklmnopqrstuvwxyz";
        int totalSteps = 0;
        int clockWiseDis = 0;
        int AntiClockWiseDis = 0;
        char currentPos = 'a';
        char nextPos;

        for (int i = 0; i < text.length(); i++)
        {
            nextPos = text.charAt(i);
            clockWiseDis = characters.indexOf(nextPos) - characters.indexOf(currentPos);
            if(clockWiseDis < 0)
            {
                clockWiseDis += 26;
            }
            AntiClockWiseDis = 26 - clockWiseDis;

            if(clockWiseDis < AntiClockWiseDis)
            {
                totalSteps += clockWiseDis;
            }
            else
            {
                totalSteps += AntiClockWiseDis;
            }
            currentPos = nextPos;
        }
        System.out.println(totalSteps);
    }

}