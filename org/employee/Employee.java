package org.employee;

public class Employee{
	//data types
	private void empId(int id) {
	
	System.out.println("ID number is:"+ id);}
	
	private void empID(String name) {
		System.out.println("Employee Name is:"+ name);
	}
	
	private void empId(float rank) {
		System.out.println("Employee performance rank:"+rank);
	}
	//data count
	private void empId(int id,String name, float rank,long mobile) {
		System.out.println("Employee ID:"+id+"\nName:"+name+"\nRank:"+rank+"\nMobile:"+mobile);
	}
	//datatypes order
	private void empId(int id,String name,long mobile,float rank) {
		System.out.println("ID:"+id+"\nName:"+name+"\nMobile:"+mobile+"\nRank:"+rank);
	}
	
	public static void main(String[] args) {
		Employee emp=new Employee();
		emp.empId(255);
		emp.empID("Sunil");
		emp.empId(15.45f);
		emp.empId(54, "Robin", 56.06f, 8687654310l);
		emp.empId(2, "Rudra", 6354098799l, 9.0f);
	}
	
	
	
}