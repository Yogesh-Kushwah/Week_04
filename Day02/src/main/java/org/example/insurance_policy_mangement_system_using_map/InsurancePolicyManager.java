package org.example.insurance_policy_mangement_system_using_map;

import java.time.LocalDate;
import java.util.*;

class InsurancePolicyManager {
    private Map<String, Policy> policyMap = new HashMap<>();
    private Map<String, Policy> orderedPolicyMap = new LinkedHashMap<>();
    private TreeMap<LocalDate, Policy> sortedPolicyMap = new TreeMap<>();

    // Add a policy
    public void addPolicy(Policy policy) {
        policyMap.put(policy.policyNumber, policy);
        orderedPolicyMap.put(policy.policyNumber, policy);
        sortedPolicyMap.put(policy.expiryDate, policy);
    }

    // Retrieve a policy by its number
    public Policy getPolicy(String policyNumber) {
        return policyMap.get(policyNumber);
    }

    // List policies expiring within the next 30 days
    public List<Policy> getExpiringPolicies() {
        List<Policy> expiringPolicies = new ArrayList<>();
        LocalDate today = LocalDate.now();
        LocalDate next30Days = today.plusDays(30);

        for (Map.Entry<LocalDate, Policy> entry : sortedPolicyMap.subMap(today, true, next30Days, true).entrySet()) {
            expiringPolicies.add(entry.getValue());
        }
        return expiringPolicies;
    }

    // List all policies for a specific policyholder
    public List<Policy> getPoliciesByHolder(String holderName) {
        List<Policy> policies = new ArrayList<>();
        for (Policy policy : policyMap.values()) {
            if (policy.policyHolder.equalsIgnoreCase(holderName)) {
                policies.add(policy);
            }
        }
        return policies;
    }

    // Remove expired policies
    public void removeExpiredPolicies() {
        LocalDate today = LocalDate.now();
        Iterator<Map.Entry<LocalDate, Policy>> iterator = sortedPolicyMap.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<LocalDate, Policy> entry = iterator.next();
            if (entry.getKey().isBefore(today)) {
                Policy expiredPolicy = entry.getValue();
                policyMap.remove(expiredPolicy.policyNumber);
                orderedPolicyMap.remove(expiredPolicy.policyNumber);
                iterator.remove();
            }
        }
    }

    // Display all policies
    public void displayPolicies() {
        for (Policy policy : orderedPolicyMap.values()) {
            System.out.println(policy);
        }
    }
}
