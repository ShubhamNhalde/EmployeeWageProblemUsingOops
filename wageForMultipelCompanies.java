package com.bridgelabz.employeewage;

public class wageForMultipelCompanies {
	
	final static int PARTTIME = 1;
	final static int FULLTIME = 2;
	
	public static int computeEmpWage(String company, int empRatePerHour, int numOfWorkingDays, int maxHoursPerMonth) {
		int empHrs = 0, totalEmpHrs = 0, totalWorkingDays = 0;
		
		while (totalEmpHrs <= maxHoursPerMonth && totalWorkingDays < numOfWorkingDays) {
			totalWorkingDays++;
			int empType = (int) Math.floor(Math.random() * 10) % 3;
			switch (empType) {
			case PARTTIME:
				empHrs = 8;
				break;
			case FULLTIME:
				empHrs = 12;
				break;
			default:
				empHrs = 0;
			}
			totalEmpHrs += empHrs;
			System.out.println("Day: " + totalWorkingDays + " Emp Hrs: " + empHrs);
		}
		int totalEmpWage = totalEmpHrs * empRatePerHour;
		System.out.println("Total Emp Wage: for Company: " + company + " is: " + totalEmpWage);
		return totalEmpWage;
	}
	
	public static void main(String[] args) {
		computeEmpWage("Dmart", 20, 20, 100);
		computeEmpWage("Reliance", 10, 20, 150);
	}
}


