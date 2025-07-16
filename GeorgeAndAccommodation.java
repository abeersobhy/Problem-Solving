import java.util.Scanner;

public class GeorgeAndAccommodation {

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int numOfRooms = in.nextInt();
        int[][] roomsData = new int[numOfRooms][2];
        int availableRooms = 0;

        for (int i = 0; i < numOfRooms; i++)
        {
            roomsData[i][0] = in.nextInt(); /*Number of people exists into the room.*/
            roomsData[i][1] = in.nextInt(); /*Room Capacity.*/
        }
        for (int i = 0; i < numOfRooms; i++) {
            if ((roomsData[i][1] - roomsData[i][0]) >= 2)
            {
                availableRooms++;
            }
        }
        System.out.println(availableRooms);
    }
}
