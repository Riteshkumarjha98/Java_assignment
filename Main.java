package com.Day_5;


import java.util.Scanner;


// created an main class
public class Main {
	// created an main method inside it
	public static void main(String[] args) {
		Employee user1 = Main.getEmployeeDetails(); // value of net salary is still empty as I haven't set it yet
		int pfpPercent = Main.getPFPercentage(); // here user provides the value of PF Percentage
		user1.calculateNetSalary(pfpPercent); // here value of net salary is set using value provided by user above
		
	}
	
	public static Employee getEmployeeDetails() {
		// Taking input from the user
		Scanner input = new Scanner(System.in);
		System.out.print("Enter employee id : ");
		int empID = input.nextInt();
		input.nextLine();
		System.out.print("Enter employee name : ");
		String empName = input.nextLine();
		System.out.print("Enter employee salary : ");
		double sal = input.nextDouble();
		
		// creating an Employee object using details entered by user
		Employee detail = new Employee(empID,empName,sal);
		return detail; // returning the reference of this object
	}
	
	public static int getPFPercentage() {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter PF pecent : ");
		int pfp = input.nextInt();
		return pfp;
	}
	
}

class Employee{
	// initialized private instance variable
	private int employeeId;
	private String employeeName;
	private double salary;
	private double netSalary;
	
	// Employee(Java Bean class constructor)
	Employee(int i, String n, double s){
		this.employeeId = i;
		this.employeeName = n;
		this.salary = s;
	}
	
	// making a method as mentioned in the question
	 public void calculateNetSalary(int pfpercentage) {
		 
		 this.netSalary = salary - salary*pfpercentage/100; // setting the value of net salary
		 
		 // I printed all the values directly here instead of creating another getter method
		 System.out.println("Id : " + employeeId);
		 System.out.println("Name : " + employeeName);
		 System.out.println("Salary : " + salary);
		 System.out.println("Net Salary : " + netSalary);
	 }
	
	
	
}