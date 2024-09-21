package org.generation.classes;

public class SalesRep extends Employee{
	private double salesMade;
	
	
	public SalesRep(String firstName, String lastName, int registration, int age, int daysWorked, int vacationDaysTaken, double salary, int yearsWorked, double salesMade) {
		super(firstName, lastName, registration, age, daysWorked, vacationDaysTaken, salary, yearsWorked);
		this.salesMade = salesMade;
	} // Constructor SalesRep


	public double getSalesMade() {
		return salesMade;
	} // getSalesMade

	public void setSalesMade(double salesMade) {
		this.salesMade = salesMade;
	} // setSalesMade
	
	
	public double calculateComission(){
		// comission = 0.1 * salesMade
		double comission = 0.1*(salesMade);
		return comission;
	   } // calculateComission


	@Override
	public String toString() {
		return "Sales Representant [ First Name= " + getFirstName() + ", Last Name= " + getLastName() + ", Registration= " + getRegistration() 
			   + ", Age= " + getAge() + ", Days Worked= " + getDaysWorked() + ", Vacation Days Taken= " + getVacationDaysTaken()
			   + ", Salary= $" + getSalary() + ", Years Worked= " + getYearsWorked() + ", Sales Made= " + getSalesMade() +" ]";
	} // toString

} // SalesRep
