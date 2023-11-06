package LeetCode75;
import java.util.*;

// TODO: reassess segment comparisons
public class IntervalIntersection {
    public static int[][] Solution (int[][] firstList, int[][] secondList) {
        Stack<int[]> firstStack = new Stack<>();
        Stack<int[]> secondStack = new Stack<>();
        List<int[]> container = new ArrayList<>();

        // fill in first stack
        for (int i = firstList.length - 1; i >= 0; i--) {
            firstStack.add(firstList[i]);
        }

        // fill in second stack
        for (int i = secondList.length - 1; i >= 0; i--) {
            secondStack.add(secondList[i]);
        }

        if (firstStack.isEmpty()|| secondStack.isEmpty())
            return new int[][] {};

        while (!firstStack.isEmpty() && !secondStack.isEmpty()) {
            int[] compareFirst = firstStack.peek();
            int[] compareSecond = secondStack.peek();

            if (compareFirst[0] <= compareSecond[0] && (compareFirst[1] >= compareSecond[0] || compareFirst[1] <= compareSecond[1])) {
                container.add(new int[] {compareSecond[0], compareFirst[1]});
                firstStack.pop();
            } else if (compareSecond[0] <= compareFirst[0] && (compareSecond[1] >= compareFirst[0] || compareSecond[1] <= compareFirst[1])) {
                container.add(new int[] {compareFirst[0], compareSecond[1]});
                secondStack.pop();
            } else {
                if (compareFirst[1] < compareSecond[0])
                    firstStack.pop();
                else
                    secondStack.pop();
            }

        }

        int[][] result = new int[container.size()][2];
        for (int i = 0; i < container.size(); i++) {
            result[i] = new int[] {container.get(i)[0], container.get(i)[1]};
        }

        return result;
    }

    public static void main(String[] args) {
        Stack<int[]> stack = new Stack<>();
        int[][] firstList = {{0,2}, {5,10}, {13,23}, {24,25}};
        int[][] secondList = {{1,5}, {8,12}, {15,24}, {25,26}};
        int[][] solution = Solution(firstList, secondList);
        System.out.println(Arrays.toString(solution));
    }

}
