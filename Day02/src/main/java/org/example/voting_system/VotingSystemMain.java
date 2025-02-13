package org.example.voting_system;

public class VotingSystemMain {
    public static void main(String[] args) {
        VotingSystem votingSystem = new VotingSystem();
        
        // Casting votes
        votingSystem.castVote("Alice");
        votingSystem.castVote("Bob");
        votingSystem.castVote("Alice");
        votingSystem.castVote("Charlie");
        votingSystem.castVote("Bob");
        votingSystem.castVote("Alice");
        
        // Display votes in order of casting
        votingSystem.displayVotesInOrder();
        
        // Display votes in sorted order
        votingSystem.displaySortedVotes();
    }
}
