import java.util.*;

public class MaxOperations {
    public static int maxOperations(int[] nums, int k) {
        if (nums.length == 1)
            return 0;
        if (nums.length == 2) {
            return nums[0] + nums[1] == k ? 1 : 0;
        }

        List<Integer> container = new ArrayList<>(Arrays.stream(nums).boxed().toList());

        Collections.sort(container);

        int left = 0;
        int right = container.size() - 1;
        int mid = (left + right) / 2;
        int countRemoval = 0;

        while (left < mid && right > mid) {
            if ((container.get(left) + container.get(right)) == k) {
                container.remove(right);
                container.remove(left);
                left = 0;
                right = container.size() - 1;
                countRemoval++;
            } else if ((container.get(left) + container.get(right)) > k) {
                right--;
            } else if ((container.get(left) + container.get(right)) < k) {
                left++;
            }
        }

        return countRemoval;
    }

    public static void main(String[] args) {
        // System.out.println(container.toString());

        int[] arr = {3,3,2,1,3,4,5,0};
        List<int[]> testCases = new ArrayList<>();
        testCases.add(arr);
        testCases.add(new int[] {1,2,3,4,5});
        testCases.add(new int[] {3,1,3,4,3});
        int result = maxOperations(testCases.get(2), 6);
        System.out.println(result);
    }
}