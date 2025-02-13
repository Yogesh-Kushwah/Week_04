package org.example.queue_interface.hospital_triage_system;

import java.util.*;

public class HospitalTriage {
    public static void main(String[] args) {
        // Custom comparator: Higher severity first
        PriorityQueue<Patient> triageQueue = new PriorityQueue<>(
                (p1, p2) -> Integer.compare(p2.severity, p1.severity) // Descending order
        );

        // Adding patients
        triageQueue.add(new Patient("John", 3));
        triageQueue.add(new Patient("Alice", 5));
        triageQueue.add(new Patient("Bob", 2));

        // Treating patients based on priority
        System.out.println("Treatment Order:");
        while (!triageQueue.isEmpty()) {
            System.out.println(triageQueue.poll());
        }
    }
}

