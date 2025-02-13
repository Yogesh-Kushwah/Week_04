package org.example.queue_interface.generate_binary_number;

import java.util.*;

public class BinaryNumberQueue {
    public static List<String> generateBinaryNumbers(int N) {
        List<String> result = new ArrayList<>();
        Queue<String> queue = new LinkedList<>();

        queue.add("1");

        for (int i = 0; i < N; i++) {
            String current = queue.remove();
            result.add(current);

            // Generate next binary numbers
            queue.add(current + "0");
            queue.add(current + "1");
        }
        return result;
    }

    public static void main(String[] args) {
        int N = 5;
        System.out.println(generateBinaryNumbers(N));
    }
}

