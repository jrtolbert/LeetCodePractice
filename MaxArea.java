import java.util.*;


// unable to crack the code
public class MaxArea {
    public static int maxArea (int[] height) {
        // height can't have a length less than 2, this is base case
        if (height.length == 2) {
            return height[0] * height[1];
        }

        // search for max
        int max =  Arrays.stream(height).max().getAsInt();

        // find index of max
        int indexOfMax = Arrays.stream(height).boxed().toList().indexOf(max);

        int leftEdge = indexOfMax > 0 ? indexOfMax - 1 : 0;
        int rightEdge = indexOfMax < (height.length - 1) ? indexOfMax + 1 : indexOfMax;
        int maxArea = 0;

        // compute max area
        while (true) {
            if (leftEdge < 0 && rightEdge > height.length)
                break;
            
            int leftVal = height[leftEdge < 0 ? 0 : leftEdge];
            int rightVal = height[rightEdge == height.length ? height.length - 1 : rightEdge];
            int tempCurrRight = (rightEdge - indexOfMax) * rightVal; 
            int tempCurrLeft = (indexOfMax - leftEdge) * leftVal;
            int smallerVal = rightVal > leftVal ? leftVal : rightVal;
            int tempLeftRight = (rightEdge - leftEdge) * smallerVal;
            int compute = Math.max(tempCurrLeft, Math.max(tempCurrRight, tempLeftRight));
            maxArea = maxArea > compute ? maxArea : compute;

            // System.out.println("Temporary current to right area: " + tempCurrRight + " ()");
            // System.out.println("Temporary current to left area: " + tempCurrLeft);
            // System.out.println("Temporary left to right area: " + tempLeftRight);

            if (leftEdge < 0) {
                ++rightEdge;
            } else if (rightEdge > height.length) {
                --leftEdge;
            } else {
                --leftEdge;
                ++rightEdge;
            }
            

        }

        return maxArea;
    }


    public static int maxAreaOptimized (int[] height) {
        if (height.length == 2) {
            return height[0] > height[1] ? height[1] : height[0];
        }

        

        // search for max
        int maxArea = 0;
        int rightEdge = height.length - 1; 
        for (int i = 0; i < height.length; i++) {
            int temp = height[rightEdge] < height[i] ? 
                height[rightEdge] * (rightEdge - i) : height[i] * (rightEdge - i); 
            System.out.println(temp);
            if (temp > maxArea)
                maxArea = temp;
        }

        return maxArea;
    }

    public static void main(String[] args) {
        // System.out.println(indexOfMax);
        // System.out.println(Arrays.stream(height).boxed().toList().toString());

        // System.out.println("Temporary current to right area: " + tempCurrRight);
        // System.out.println("Temporary current to left area: " + tempCurrLeft);
        // System.out.println("Temporary left to right area: " + tempLeftRight);
        int[] arr = {1,8,6,2,5,4,8,3,7};
        int[] arr2 = {1,1};
        int[] arr3 = {1,2,1};
        int[] arr4 = {2,3,4,5,18,17,6};
        int[] arr5 = {4,3,2,1,4};
        int[] arr6 = {8,10,14,0,13,10,9,9,11,11};
        System.out.println(maxArea(arr3));
    }
}
