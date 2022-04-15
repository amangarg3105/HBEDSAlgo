package searching;


import java.util.Arrays;

public class Heaters {

    public int findRadius(int[] houses, int[] heaters) {

        //Sorting heaters in ascending order
        Arrays.sort(heaters);

        int radius = 0;
        for(int index = 0; index < houses.length; index++) {
            int currentHouse = houses[index];

            int nearestHeater_Radius =
                    findNearestHeater(currentHouse, heaters);
            if(nearestHeater_Radius > radius) {
                radius = nearestHeater_Radius;
            }
        }
        return radius;
    }

    private int findNearestHeater(int currentHouse, int[] heaters) {

        int start = 0, end = heaters.length - 1, nearestHeater_Radius =Integer.MAX_VALUE;

        while(start <= end) {
            int mid = start + (end - start) / 2;
            if(heaters[mid] == currentHouse) {
                return 0;
            }
            else if(heaters[mid] > currentHouse) {
                //We found just larger
                int justLargerRadius = heaters[mid] - currentHouse;
                nearestHeater_Radius = Math.min(justLargerRadius, nearestHeater_Radius);
                end = mid - 1;
            } else {
                //We found just smaller
                int justSmallerHeaterRadius = currentHouse - heaters[mid];
                nearestHeater_Radius = Math.min(justSmallerHeaterRadius,
                        nearestHeater_Radius);
                start = mid + 1;
            }
        }
        return nearestHeater_Radius;
    }

    public static void main(String[] args) {

    }
}
