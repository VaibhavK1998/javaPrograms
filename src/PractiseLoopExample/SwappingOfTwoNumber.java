package PractiseLoopExample;

public class SwappingOfTwoNumber {
	
	public static void main(String[] args) {
		// swapping by using 3rd variabe(swaping means exchange of value)
		int a=10;
		int b=20;
		System.out.println("before swapping of two number");
		System.out.println("a= "+a);
		System.out.println("b= "+b);
		int c=a;
		 a=b;		
        b=c; 
        System.out.println("after swapping of two number ");
        System.out.println("a= "+a); 
        System.out.println("b= "+b); 
        Exa2();
	}
	
	// swapping of two number without using third variable
	public static void Exa2() {
	int a=10;
	int b=20;
	System.out.println("before swapping of two number");
	System.out.println("a= "+a);
	System.out.println("b= "+b);
     a=a+b;
     b=a-b;
     a=a-b;
     System.out.println("after swapping of two number");
     System.out.println("a= "+a);
     System.out.println("b= "+b);

	
	
	
	    
	
	         }

          }	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	