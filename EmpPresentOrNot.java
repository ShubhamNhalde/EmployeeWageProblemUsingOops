package com.bridgelabz.employeewage;

public class EmpPresentOrNot {

	final int present = 1;
	int empType;

	EmpPresentOrNot(){

		empType = (int) (Math.random() * 100) %2;
		if (empType == present) {
			System.out.println("Employee Is Present");
		}else {
			System.out.println("Employee Is Absent");
		}
	}
	public static void main(String[] args) {
		new EmpPresentOrNot();
	}
}
