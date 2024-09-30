package LeetCode75;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// Beats 23.52% of submissions in Runtime
public class CustomStack {

    List<Integer> stack = null;
    int sizeOfStack = -1;
    int numberOfElementsInQueue = -1;

    public CustomStack(int maxSize) {
        this.stack = new ArrayList<>();
        this.numberOfElementsInQueue = 0;
        this.sizeOfStack = maxSize;
    }

    public int getMaxSize() {
        return this.sizeOfStack;
    }

    public int getSize() {
        return this.stack.size();
    }

    public void push(int x) {
        if (this.numberOfElementsInQueue >= getMaxSize()) {
            return;
        }
        this.stack.add(x);
        ++this.numberOfElementsInQueue;
    }

    public int pop() {
        if (this.stack.isEmpty()) {
            return -1;
        }
        int kernel = this.stack.get(this.getSize() - 1);
        this.stack.remove(this.getSize() - 1);
        --this.numberOfElementsInQueue;

        return kernel;
    }

    public void increment(int k, int val) {
        if (k >= this.getSize()) {
            for (int i = 0; i < this.getSize(); i++) {
                this.stack.set(i, this.stack.get(i) + val);
            }
        } else {
            for (int i = 0; i < k ; i++) {
                this.stack.set(i, this.stack.get(i) + val);
            }
        }
    }

    public static void main(String[] args) {
        CustomStack customStack = new CustomStack(3);
        System.out.println("Size of custom stack: " + customStack.getMaxSize());

        customStack.push(1);
        customStack.push(2);
        System.out.println(customStack.pop());
        customStack.push(2);
        customStack.push(3);
        customStack.push(4);
        customStack.increment(5, 100);
        System.out.println("Custom stack arr: " + Arrays.toString(customStack.stack.toArray()));
        customStack.increment(2, 100);
        System.out.println("Custom stack arr: " + Arrays.toString(customStack.stack.toArray()));
        System.out.println(customStack.pop());
        System.out.println(customStack.pop());
        System.out.println(customStack.pop());
        System.out.println(customStack.pop());
//        System.out.println(Arrays.toString(customStack.stack.toArray()));
//        System.out.println("Number of elements in stack: " + customStack.numberOfElementsInQueue);
    }
}
