package com.bridgelabz.employeewage;

public class PartTimeEmpWage {
	
	final int PARTTIME = 1;
	final int FULLTIME = 2;
	final int EMPPERHRS = 20;
	int workingHrs = 0;
	int empType;
	
	PartTimeEmpWage(){
		
		empType = (int) (Math.random() * 100) % 3;
		
		if (empType == FULLTIME) {
			System.out.println("Employee Is Present");
			workingHrs = 12;
		}
		else if (empType == PARTTIME) {
			System.out.println("Employee Is Present Part Time");
			workingHrs = 8;
		}
		else {
			System.out.println("Employee Is Absent");
		}
		int wage = workingHrs * EMPPERHRS;
		System.out.println("Employee Daily Wage Is " + wage);
	}
		public static void main(String[] args) {
			new PartTimeEmpWage();
		}
	

}
