import java.util.Scanner;

public class Supermarket {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int numOfSupermarkets = in.nextInt();
        int numOfKilos = in.nextInt();
        double[][] prices = new double[numOfSupermarkets][2];
        double minimumPriceForKilo = 0;

        for(int i = 0; i < numOfSupermarkets; i++)
        {
            prices[i][0] = in.nextInt(); /*Store the price.*/
            prices[i][1] = in.nextInt(); /*Store the number of kilos for this price.*/
        }

        for(int i = 0; i < numOfSupermarkets; i++)
        {
            prices[i][0] = (prices[i][0] / prices[i][1]); /*Replace the price with the price for 1 kilo.*/
        }
        /* Initialize the minimumPriceForKilo with first price.*/
        minimumPriceForKilo = prices[0][0];
        for(int i = 1; i < numOfSupermarkets; i++)
        {
            if(minimumPriceForKilo > prices[i][0]) /*Find the minimum price for kilo.*/
            {
                minimumPriceForKilo = prices[i][0];
            }
        }
        System.out.println(minimumPriceForKilo * numOfKilos); /*Minimum price for entered kilos.*/
    }
}