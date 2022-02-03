package com.bridgelabz.employeewage;

public class UsingSwitchCase {
	
	final int PARTTIME = 1;
	final int FULLTIME = 2;
	final int EMPPERHRS = 20;
	int workingHrs = 0;
	int empType;
	
	UsingSwitchCase() {
		empType = (int)	(Math.random() * 100) % 3;
		
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
				System.out.println("Employee is Absent");
		}
		
		int wage = workingHrs * EMPPERHRS ;
		System.out.println("Employee Daily Wage Is " + wage);
	}
	
	public static void main(String[] args) {
		new UsingSwitchCase();
	}
}
