package org.example.voting_system;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

class VotingSystem {
    private Map<String, Integer> voteMap = new HashMap<>();
    private Map<String, Integer> orderedVotes = new LinkedHashMap<>();
    private TreeMap<String, Integer> sortedVotes = new TreeMap<>();

    // Cast a vote
    public void castVote(String candidate) {
        voteMap.put(candidate, voteMap.getOrDefault(candidate, 0) + 1);
        orderedVotes.put(candidate, orderedVotes.getOrDefault(candidate, 0) + 1);
        sortedVotes.put(candidate, sortedVotes.getOrDefault(candidate, 0) + 1);
    }

    // Get votes for a candidate
    public int getVotes(String candidate) {
        return voteMap.getOrDefault(candidate, 0);
    }

    // Display votes in the order they were cast
    public void displayVotesInOrder() {
        System.out.println("Votes in the order they were cast:");
        for (Map.Entry<String, Integer> entry : orderedVotes.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    // Display votes in sorted order
    public void displaySortedVotes() {
        System.out.println("Votes in sorted order:");
        for (Map.Entry<String, Integer> entry : sortedVotes.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
