package org.generation.classes;

import java.util.HashMap;

public class SalesManager extends SalesRep{
	private HashMap<Integer, SalesRep> salesTeam = new HashMap<>();
	
	
	
	public SalesManager(String firstName, String lastName, int registration, int age, int daysWorked, int vacationDaysTaken, double salary, int yearsWorked, double salesMade) {
		super(firstName, lastName, registration, age, daysWorked, vacationDaysTaken, salary, yearsWorked, salesMade);
	} // Constructor SalesManager

	
	public void addTeam(Integer registration, SalesRep salesRep) {
    	this.salesTeam.put(registration, salesRep);
    } // addStudent

	public double calculateComission(){
	      // 0.03 * all sales made by team
		double totalSales = 0.0;
	    
	    for (SalesRep salesRep : salesTeam.values()) {
	        totalSales += salesRep.getSalesMade();
	    } // for
	    return 0.03*(totalSales);
	   } // calculateComission


	@Override
	public String toString() {
		return "Sales Manager [ First Name= " + getFirstName() + ", Last Name= " + getLastName() + ", Registration= " + getRegistration()
				+ ", Age= " + getAge() + ", Days Worked= " + getDaysWorked() + ", Vacation Days Taken= " + getVacationDaysTaken() 
				+ ", Salary= " + getSalary() + ", Years Worked= " + getYearsWorked() + ", Sales Made= " + getSalesMade() + ", Sales Team= " 
				+ salesTeam + " ]";
	} // toString
	
	
	

} // SalesManager
