import java.util.ArrayList;
import java.util.Scanner;

public class RestoringPassword {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String binaryPassword = in.nextLine();

        ArrayList<String> codingPassword = new ArrayList<>();
        /*Store the array elements, where each element represent the code of its index.*/
        for(int i = 0; i < 10; i++)
        {
            String codedNum = in.nextLine();
            codingPassword.add(codedNum);
        }
        for (int i = 0; i <= 70; i += 10)
        {
            String nextCodedNum = binaryPassword.substring(i , i+10); /*Read 10 binary numbers started from i.*/
            System.out.print(codingPassword.indexOf(nextCodedNum));   /*Print the index of this coded number.*/
        }
    }
}
