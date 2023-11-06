package LeetCode75;
import java.util.*;

public class SelfCrossing {

    public static boolean solution (int[] distance) {
        // setting up data structures
        List<String[]> conversion = giveDirection(distance);

        for (String[] val : conversion) {
            System.out.println("Direction: " + val[0] + " Distance: " + Integer.parseInt(val[1]));
        }

        int index = 0;
        int[] origin = {0,0};
        while (index < distance.length) {

        }

        return false;
    }

    public static List<String[]> giveDirection(int[] distance) {
        int[] direction = {0,0,0,0};
        List<String[]> directions = new ArrayList<>();
        int index = 0;
        while (index < distance.length) {
            if (direction[0] == Arrays.stream(direction).min().getAsInt()) {
                directions.add(new String[] {"up", "" + distance[index]});
                direction[0]++;
            } else if (direction[1] == Arrays.stream(direction).min().getAsInt()) {
                directions.add(new String[] {"left", "" + distance[index]});
                direction[1]++;
            } else if (direction[2] == Arrays.stream(direction).min().getAsInt()) {
                directions.add(new String[] {"down", "" + distance[index]});
                direction[2]++;
            } else {
                directions.add(new String[] {"right", "" + distance[index]});
                direction[3]++;
            }
            ++index;
        }

        return directions;
    }

    public static void main(String[] args) {
        int[] distance = {1,1,1,2,1};
        solution(distance);
    }

}
