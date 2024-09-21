package org.generation;

import org.generation.classes.Employee;
import org.generation.classes.SalesManager;
import org.generation.classes.SalesRep;

public class Main {
	public static void main(String[] args) {
		System.out.println("----------------------------------------------------------------------------------");
		Employee luis = new Employee("Luis", "Loranca", 1020, 23, 145, 2, 450.25, 1);
		System.out.println(luis);
		System.out.println("Time until retirement: " + luis.timeToRetirement() + " years");
        System.out.println("Remaining vacation time: " + luis.vacationTimeLeft() + " days");
        System.out.println(luis.getFirstName() + "'s Bonus: $" + luis.calculateBonus());
        System.out.println();

        System.out.println("----------------------------------------------------------------------------------");
        SalesRep elizabeth = new SalesRep("Elizabeth", "Díaz", 1030, 20, 300, 0, 550.25, 3, 5000);
        System.out.println(elizabeth);
        System.out.println("Time until retirement: " + elizabeth.timeToRetirement() + " years");
        System.out.println("Remaining vacation time: " + elizabeth.vacationTimeLeft() + " days");
        System.out.println(elizabeth.getFirstName() + "'s Bonus: $" + elizabeth.calculateBonus());
        System.out.println(elizabeth.getFirstName() + "'s Commission: $" + elizabeth.calculateComission());
        System.out.println();
        
        System.out.println("----------------------------------------------------------------------------------");
        SalesRep juan = new SalesRep("Juan", "Pérez", 1040, 43, 560, 7, 550.25, 4, 1500);
        System.out.println(juan);
        System.out.println("Time until retirement: " + juan.timeToRetirement() + " years");
        System.out.println("Remaining vacation time: " + juan.vacationTimeLeft() + " days");
        System.out.println(juan.getFirstName() + "'s Bonus: $" + juan.calculateBonus());
        System.out.println(juan.getFirstName() + "'s Commission: $" + juan.calculateComission());
        System.out.println();
        
        System.out.println("----------------------------------------------------------------------------------");
        SalesRep jose = new SalesRep("José", "López", 1050, 32, 780, 3, 650.25, 6, 1000);
        System.out.println(jose);
        System.out.println("Time until retirement: " + jose.timeToRetirement() + " years");
        System.out.println("Remaining vacation time: " + jose.vacationTimeLeft() + " days");
        System.out.println(jose.getFirstName() + "'s Bonus: $" + jose.calculateBonus());
        System.out.println(jose.getFirstName() + "'s Commission: $" + jose.calculateComission());
        System.out.println();
        
        System.out.println("----------------------------------------------------------------------------------");
        SalesManager alejandro = new SalesManager("Alejandro", "Martínez", 1060, 30, 210, 4, 650.25, 2, 2000);
        alejandro.addTeam(2, elizabeth);
        alejandro.addTeam(3, juan);
        alejandro.addTeam(4, jose);
        
        System.out.println(alejandro);
        System.out.println("Time until retirement: " + alejandro.timeToRetirement() + " years");
        System.out.println("Remaining vacation time: " + alejandro.vacationTimeLeft() + " days");
        System.out.println(alejandro.getFirstName() + "'s Bonus: $" + alejandro.calculateBonus());
        System.out.println(alejandro.getFirstName() + "'s Commission: $" + alejandro.calculateComission());
        System.out.println();
        
        System.out.println("Total team commission: $" + alejandro.calculateComission());
	    
	} // main

} // class Main
