package com.bridgelabz.employeewage;

public class MonthlyWage {
	
	final int PARTTIME = 1;
	final int FULLTIME = 2;
	final int EMPPERHRS = 20;
	final int NUMOFWORKINGDAYS = 20;
	int workingHrs = 0;
	int totalWage = 0;
	int empType;
	
	MonthlyWage() {
		
		for (int day=1; day <= NUMOFWORKINGDAYS; day++ ) {
		empType = (int)(Math.random() * 100) % 3;
		
		switch(empType) {
		
		case FULLTIME:
			System.out.println("Employee Is Present Full Time");
			workingHrs = 12;
			break;
			
		case PARTTIME:
			System.out.println("Employee Is Present Part Time");
			workingHrs = 8;
			break;
			
			default:
				System.out.println("Employee Is Absent");
		}
			int wage = workingHrs * EMPPERHRS;
			System.out.println(" Day " + day + " Wage Is " + wage);
			totalWage += wage;
		}
		System.out.println("Total Wage For Month Is " + totalWage);
	}
	
		public static void main(String[] args) {
			new MonthlyWage();
		}
}
