package LeetCode75;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Beats 93.47% of submissions in Runtime

public class CustomStackOptimized {
    int[] stack;
    int sizeOfStack = -1;
    int numberOfElementsInQueue = -1;

    public CustomStackOptimized(int maxSize) {
        this.stack = new int[maxSize];
        this.numberOfElementsInQueue = 0;
        this.sizeOfStack = maxSize;

        for (int i = 0; i < maxSize; i++) {
            this.stack[i] = -1;
        }
    }

    public int getMaxSize() {
        return this.sizeOfStack;
    }

    public int getSize() {
        return this.stack.length;
    }

    public void push(int x) {
        if (this.numberOfElementsInQueue >= getMaxSize()) {
            return;
        }
        this.stack[numberOfElementsInQueue] = x;
        ++this.numberOfElementsInQueue;
    }

    private boolean isEmpty() {
        for (int i = 0; i < this.numberOfElementsInQueue; i++) {
            if (this.stack[i] != -1)
                return false;
        }
        return true;
    }

    public int pop() {
        if (this.isEmpty()) {
            return -1;
        }
        int kernel = this.stack[this.numberOfElementsInQueue - 1];
        this.stack[this.numberOfElementsInQueue - 1] = -1;
        --this.numberOfElementsInQueue;

        return kernel;
    }

    public void increment(int k, int val) {
        if (k >= this.getSize()) {
            for (int i = 0; i < this.getSize(); i++) {
                this.stack[i] += val;
            }
        } else {
            for (int i = 0; i < k ; i++) {
                this.stack[i]+= val;
            }
        }
    }

    public static void main(String[] args) {
        CustomStackOptimized customStack = new CustomStackOptimized(3);
        System.out.println("Size of custom stack: " + customStack.getMaxSize());

        customStack.push(1);
        customStack.push(2);
        System.out.println(customStack.pop());
        customStack.push(2);
        customStack.push(3);
        customStack.push(4);
        customStack.increment(5, 100);
        System.out.println("Custom stack arr: " + Arrays.toString(customStack.stack));
        customStack.increment(2, 100);
        System.out.println("Custom stack arr: " + Arrays.toString(customStack.stack));
        System.out.println(customStack.pop());
        System.out.println(customStack.pop());
        System.out.println(customStack.pop());
        System.out.println(customStack.pop());
//        System.out.println(Arrays.toString(customStack.stack.toArray()));
//        System.out.println("Number of elements in stack: " + customStack.numberOfElementsInQueue);
    }
}
