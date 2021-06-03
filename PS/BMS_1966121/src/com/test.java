package com;

import java.util.HashMap;
import java.util.HashSet;


public class test {
	
	public static void main(String[] args) {
		// Creating a HashSet
		HashSet<BankEmployee> employeeSet = new HashSet<BankEmployee>();
		
		employeeSet.add(new BankEmployee(1009, "Bill G", "Branhc1" , "Consultant", 10000, false));
		employeeSet.add(new BankEmployee(1007, "Mark Z", "Branhc1", "Engineer", 100000, true));
		employeeSet.add(new BankEmployee(1001, "Sundar P", "Branhc2", "Architect", 20001, false));
		// Printed the orignal hashset
		System.out.println("Original set: ");
		employeeSet.forEach(
                employee -> System.out.println(employee));
		
		EmployeeManagementImpl management = new EmployeeManagementImpl();
		
		management.setEmployeeSet(employeeSet);
		
		// addEmployee method
		if(management.addEmployee(new BankEmployee(1008, "Larry P", "Branhc1", "Designer", 20001, true))) {
			System.out.println("\nThe employee was added to the collection: ");
		}else {
			System.out.println("\nThe employee was not added to the collection: ");
		}		
		employeeSet.forEach(
                employee -> System.out.println(employee));

		// HikeSalary method
		System.out.println("\nHike Salary");
		employeeSet = management.getSalaryHike();
		employeeSet.forEach(
                employee -> System.out.println(employee));
        
		// HashSet to HashMap method
		System.out.println("\nGet a Hash Map:");
		HashMap<Integer, BankEmployee> map = management.getEmployees();
		map.entrySet().forEach(entry -> {
		    System.out.println(entry.getKey() + " " + entry.getValue());
		});
		
		// Sort method
		System.out.println("\nSort hash map:");
		employeeSet = management.sortPermanentEmployees();
		
        
	}

}
