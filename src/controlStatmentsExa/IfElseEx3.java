package controlStatmentsExa;// lecture 22

public class IfElseEx3 {

	public static void main(String[] args) {
	 int a=1597;
	 if( (a%2==1)||(a%2==-1) ){   // in this || OR if first condition is true then it not check second condition we using|| this or sign it save one checking 
	 System.out.println("a is is odd no.");
	 }
	 else {
	 System.out.println("no. is even number");
	 }
	 // output of both OR operator will be same 
	 int a1=1000;
	 if( (a1%2==1)|(a1%2==-1) ){   // in this | OR operator if first condition is true even so it check 2nd condition 
		 
		 System.out.println("a is is odd no.");
		 
		 }                       
		 else {
		 System.out.println("no. is even number");
 
		 exa1();
		 }
	 }
	
	public static void exa1() {
	 int b=25;
	 if( (b>=30)&&(b<=45)) { // in & operator we want both condition true then result will be pass otherwiswe failed 
		  System.out.println(" condition pass");	 
	 }
	 
	 else { 
	 System.out.println("condition failed");
	 
	 }
	 
	 
	 
	 
		
	}	 
	}	

	
	
