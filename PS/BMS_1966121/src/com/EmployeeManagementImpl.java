package com;

import java.util.*;
import java.util.stream.Collectors;

public class EmployeeManagementImpl implements EmployeeManagement {
	
	private HashSet<BankEmployee> employeeSet;
	
	public HashSet<BankEmployee> getEmployeeSet() {
		return employeeSet;
	}
	
	public void setEmployeeSet(HashSet<BankEmployee> employeeSet) {
		this.employeeSet = employeeSet;
	}
	
	public boolean addEmployee(BankEmployee X) {
		if(employeeSet.add(X)) {
			return true;
		}else {
			return false;
		}
	}

	@Override
	public HashSet<BankEmployee> getSalaryHike() {
		// TODO Auto-generated method stub		
		for(BankEmployee employee : employeeSet) {
			if(employee.isPermanentCheck() && employee.getSalary() > 20000) {
				employee.setSalary(employee.getSalary() + (0.10 * employee.getSalary()) );
			}else if( !employee.isPermanentCheck() && employee.getSalary() > 20000){
				employee.setSalary(employee.getSalary() + (0.08 * employee.getSalary()) );				
			}else {
				employee.setSalary(employee.getSalary() + (0.06 * employee.getSalary()) );
			}
			
			employee.setPermanentCheck(true);
		}
		
		return employeeSet;
	}
	
	public HashMap<Integer, BankEmployee> getEmployees(){
		
		Map<Integer, BankEmployee> Employees = employeeSet.stream().collect(
                Collectors.toMap(x -> x.getEmpId(), x -> x));
		
		return (HashMap<Integer, BankEmployee>) Employees;
	}
	
	public HashSet<BankEmployee> sortPermanentEmployees(){
		List<BankEmployee> sortedAux = employeeSet.stream()
				.sorted(Comparator.comparing(BankEmployee::getEmpId))
				.collect(Collectors.toList());
		
		System.out.println(sortedAux);
		
		HashSet<BankEmployee> employeeSetAux = new HashSet<BankEmployee>();
		employeeSetAux.addAll(sortedAux);
		
		return employeeSetAux; 
	}

}
