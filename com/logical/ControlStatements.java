package com.logical;


public class ControlStatements{
	
	public void monthsInAYear(int month) {
	
		
		
		
	//	for (int i = 1; i <= 6; i++) {
		//	for (int j = 1; j <= 6; j++) {
			//	System.out.println(j);
			//	}
			//System.out.println("\t"+i);
			//}
		
		
//		int a=10;
//		while (a<=30) {
//			System.out.println(a);
//			a++;
//			
//		}
//		System.out.println("\t");
//		int b=55;
//		do {
//			System.out.println(b);
//			b++;
//			
//		} while (b<=99);
		
		switch (month) {
		case 1:
			System.out.println("January");
		
			break;
		case 2: System.out.println("February");
           break;
           
		case 3: System.out.println("March");
		break;
		
		case 4:
			System.out.println("April");
       break;
       
		case 5:
			System.out.println("May");
			break;
			
		case 6: System.out.println("June");
		break;
		
		case 7: System.out.println("July");
		break;
		
		case 8: System.out.println("August");
		break;
		
		case 9: System.out.println("September");
		break;
		
		case 10: System.out.println("October");
		break;
		
		case 11: System.out.println("November");
		break;
		
		case 12: System.out.println("December");
		break;
		
		
		default:
			System.out.println("Enter a month between 1-12");
			
		}
		
		}public static void main(String[] args) {
			
			ControlStatements ms= new ControlStatements();
			ms.monthsInAYear(3);
			
		
	}
}