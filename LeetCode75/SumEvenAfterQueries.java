package LeetCode75;
import java.util.*;
import java.util.stream.Stream;

public class SumEvenAfterQueries {
    public static int[] Solution (int[] nums, int [][] queries) {

        int queryIndex = 0;
        List<Integer> container = new ArrayList<>();
        while (queryIndex < queries.length) {
            nums[queries[queryIndex][1]] += queries[queryIndex][0];
            int result = Arrays.stream(nums).filter(n -> n % 2 == 0).sum();
            container.add(result);
            queryIndex++;
        }

        return container.stream().mapToInt(Integer::intValue).toArray();
    }

    public static int[] SolutionOptimized (int[] nums, int[][] queries) {
        int[] container = new int[queries.length];
        int evenSum = Arrays.stream(nums).filter(n -> n % 2 == 0).sum();
        for (int i = 0; i < queries.length; i++) {
            if (nums[queries[i][1]] % 2 == 0)
                evenSum -= nums[queries[i][1]];

            nums[queries[i][1]] += queries[i][0];

            if (nums[queries[i][1]] % 2 == 0)
                evenSum += nums[queries[i][1]];

            container[i] = evenSum;
        }

        return container;
    }

    public static void main(String[] args) {
        List<int[]> tC = new ArrayList<>();
        List<int[][]> q = new ArrayList<>();
        int[] test = {1, 2, 3, 4};
        int[][] query = {{1,0}, {-3,1}, {-4, 0}, {2,3}};

//        int[] testClone = new int[test.length + 1];
//        int[] testAddition = {3};
//        System.arraycopy(test, 0, testClone, 0, test.length);
//        System.arraycopy(testAddition, 0, testClone, test.length, testAddition.length);
//        System.out.println(Arrays.toString(testClone));

        tC.add(test);
        q.add(query);

        tC.add(new int[] {1});
        q.add(new int[][]{{4, 0}});

        System.out.println(Arrays.toString(SolutionOptimized(tC.get(0),q.get(0))));
    }
}
