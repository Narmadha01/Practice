package org.employee;

public class Desktop implements SoftWare,HardWare{

	public void desktopModel() {
		System.out.println("Desktop Model is Latest");
	}
	
	@Override
	public void softwareResources() {
		System.out.println("SoftWare Resource is version 4.0");
		}
	
	@Override
	public void hardwareResources() {
		System.out.println("HardWare Resource belongs to the recent version 9.0.1");
	}
	
	public static void main(String[] args) {
		
		
		Desktop l=new Desktop();
		l.desktopModel();
		l.hardwareResources();
		l.softwareResources();
	
		
		
}}
