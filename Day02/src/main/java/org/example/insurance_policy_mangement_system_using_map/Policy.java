package org.example.insurance_policy_mangement_system_using_map;

import java.time.LocalDate;

class Policy {
    String policyNumber;
    String policyHolder;
    LocalDate expiryDate;

    public Policy(String policyNumber, String policyHolder, LocalDate expiryDate) {
        this.policyNumber = policyNumber;
        this.policyHolder = policyHolder;
        this.expiryDate = expiryDate;
    }

    @Override
    public String toString() {
        return "Policy{Number='" + policyNumber + "', Holder='" + policyHolder + "', Expiry=" + expiryDate + "}";
    }
}



