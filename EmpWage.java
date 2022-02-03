package com.bridgelabz.employeewage;

public class EmpWage {
	final int PRESENT = 1;
	final int WAGEPERHRS = 20 ;
		int workingHrs = 0;
		int empType;
		
		EmpWage()	{
			
			empType = (int) (Math.random() * 100) % 2;
			
			if (empType == PRESENT)	{
				System.out.println("Employee Is Present");
				workingHrs = 8;
			}else {
				System.out.println("Employee Is Absent");
		
			}
			
			int wage = workingHrs * WAGEPERHRS ;
			System.out.println("Employee Daily Wage Is " + wage);
		}
		
		public static void main(String[] args) {
			new EmpWage();
		}
}
