import java.util.Scanner;

public class BearAndFindingCriminals {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int numOfCities = in.nextInt();
        int limakIndex = in.nextInt();
        int[] criminals = new int[numOfCities];
        int totalNumOfCriminals = 0;

        for(int i = 0; i < numOfCities; i++)
        {
            criminals[i] = in.nextInt();
        }
        if((limakIndex == 1) || (limakIndex == numOfCities)) /*Limak lives in the first or last city.*/
        {
            for (int i = 0; i < numOfCities; i++) /*Search for the cities that have criminal.*/
            {
                if(criminals[i] == 1)
                {
                    totalNumOfCriminals++;
                }
            }
        }
        else if(limakIndex == ((numOfCities/2) + 1)) /*Limak lives in the middle of the cities.*/
        {
            limakIndex--;
            if(criminals[limakIndex] == 1)
            {
                totalNumOfCriminals++;
            }
            for (int i = 1; i <= (numOfCities/2); i++) /*Compare the cities on the left and right of Limak positon.*/
            {
                if((criminals[limakIndex-i] == 1) && (criminals[limakIndex+i] == 1))
                {
                    totalNumOfCriminals += 2;
                }
            }
        }
        else
        {
            limakIndex--;
            if(criminals[limakIndex] == 1)
            {
                totalNumOfCriminals++;
            }
            if(limakIndex < (numOfCities - limakIndex))
            {
                for (int i = 1; i <= limakIndex; i++)
                {
                    if((criminals[limakIndex-i] == 1) && (criminals[limakIndex+i] == 1))
                    {
                        totalNumOfCriminals += 2;
                    }
                }
                for (int i = (2*limakIndex)+1; i < numOfCities; i++)
                {
                    if(criminals[i] == 1)
                    {
                        totalNumOfCriminals++;
                    }
                }
            }
            else
            {
                int lastIndex = numOfCities -1;
                int end = lastIndex - ((lastIndex - limakIndex)*2);

                for (int i = 0; i < end ; i++)
                {
                    if(criminals[i] == 1)
                    {
                        totalNumOfCriminals++;
                    }
                }
                for (int i = 1; i <= (lastIndex - limakIndex) ; i++)
                {
                    if((criminals[limakIndex-i] == 1) && (criminals[limakIndex+i] == 1))
                    {
                        totalNumOfCriminals += 2;
                    }
                }

            }
        }
        System.out.println(totalNumOfCriminals);
    }
}
