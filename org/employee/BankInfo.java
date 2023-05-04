package org.employee;

public class BankInfo {
	
	public void savings(float roi) {
		System.out.println("Savings Amount:"+roi+"%");
	}
	public void deposit(float roi) {
		System.out.println("Deposit Amount:"+roi+"%");
	}
	public void fixed(float roi) {
		System.out.println("Fixed Amount:"+roi+"%");
	}

	public static void main(String[] args) {
		
	
	BankInfo acc=new BankInfo();
	acc.deposit(85.7f);
	acc.fixed(22.5f);
	acc.savings(65.8f);
	
	}
}
