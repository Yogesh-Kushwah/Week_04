package org.example.queue_interface.implement_a_stack_using_queue;

import java.util.LinkedList;
import java.util.Queue;

class StackUsingQueue {
    private Queue<Integer> q1 = new LinkedList<>();

    public void push(int x) {
        int size = q1.size();
        // Add the new element
        q1.add(x);

        // Rotate the queue to maintain stack order
        for (int i = 0; i < size; i++) {
            q1.add(q1.remove());
        }
    }

    public int pop() {
        if (q1.isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return q1.remove();
    }

    public int top() {
        if (q1.isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return q1.peek();
    }

    public boolean isEmpty() {
        return q1.isEmpty();
    }

    public static void main(String[] args) {
        StackUsingQueue stack = new StackUsingQueue();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println("Top: " + stack.top());
        System.out.println("Pop: " + stack.pop());
        System.out.println("Top: " + stack.top());
    }
}

