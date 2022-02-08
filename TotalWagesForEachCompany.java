package com.bridelabz.empwageusingoops;

public class TotalWagesForEachCompany {
	
	public static final int FULLTIME = 1;
	public static final int PARTTIME = 2;

	private final String company;
	private final int wagePerHour;
	private final int workingDays;
	private final int maxHoursPerMonth;
	private int totalEmpWage;

	public TotalWagesForEachCompany(String company, int wagePerHour, int workingDays, int maxHoursPerMonth) {
		this.company = company;
		this.wagePerHour = wagePerHour;
		this.workingDays = workingDays;
		this.maxHoursPerMonth = maxHoursPerMonth;
	}

	
	public void computeWage() {
		
		int empHrs = 0, totalEmpHrs = 0, totalWorkingDays = 0;
		
		while (totalEmpHrs <= maxHoursPerMonth && totalWorkingDays < workingDays) {
			totalWorkingDays++;
			int empCheck = (int) Math.floor(Math.random() * 10) % 3;
			switch (empCheck) {
			case PARTTIME:
				empHrs = 4;
				break;
			case FULLTIME:
				empHrs = 8;
				break;
			default:
				empHrs = 0;
			}
			totalEmpHrs += empHrs;
			System.out.println("Day : " + totalWorkingDays + " Emp Hr : " + empHrs);
		}
		totalEmpWage = totalEmpHrs * wagePerHour;
	}

	@Override
	public String toString() {
		return "Total Emp Wage for company " + company + " is " + totalEmpWage;
	}

	public static void main(String[] args) {

		TotalWagesForEachCompany dMart = new TotalWagesForEachCompany("DMart", 20, 20, 100);
		TotalWagesForEachCompany reliance = new TotalWagesForEachCompany("Reliance", 10, 20, 200);
		dMart.computeWage(); 
		System.out.println(dMart);
		reliance.computeWage(); 
		System.out.println(reliance);
	}

}
