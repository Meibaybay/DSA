package LECTURE8;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackReversing {
    static Queue<Integer> queue;
    static void Print() {
        while (!queue.isEmpty()) {
            System.out.print(queue.peek() + ", ");
            queue.remove();
        }
    }
    static void reversequeue()
    {
        Stack<Integer> stack = new Stack<>();
        while (!queue.isEmpty()) {
            stack.add(queue.peek());
            queue.remove();
        }
        while (!stack.isEmpty()) {
            queue.add(stack.peek());
            stack.pop();
        }
    }
    public static void main(String[] args)
    {
        queue = new LinkedList<Integer>();
        queue.add(15);
        queue.add(200);
        queue.add(33);
        queue.add(6);
        queue.add(50);
        queue.add(102);
        queue.add(70);
        queue.add(80);
        queue.add(90);
        queue.add(100);

        reversequeue();
        Print();
    }
}
