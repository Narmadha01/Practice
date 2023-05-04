package org.employee;

public class AxisBank extends BankInfo{
	
	@Override
	public void deposit(float roi) {
		super.deposit(roi);
	}
	
	public static void main(String[] args) {
		AxisBank amt = new AxisBank();
		amt.deposit(66.9f);
	}
	
	

}
