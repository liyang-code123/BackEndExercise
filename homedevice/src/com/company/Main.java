package com.company;

import com.anothercompany.HouseholdItemManagementSystem;

public class Main {

    public static void main(String[] args) {
	// write your code here
        HouseholdItemManagementSystem householdItemManagementSystem = new HouseholdItemManagementSystem();
        try {
            householdItemManagementSystem.chargeAllDevices();
        } catch (ChargeExplodeException e) {
            // dial911
        }
    }
}
