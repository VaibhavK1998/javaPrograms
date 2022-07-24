package LoopsInJava;

public class NestedForLoopExa3 {

	public static void main(String[] args) {
		for (int a=11; a<=13;a++) {
        for(int b=11; b<=13; b++) {
	System.out.print(" "+b);
      
       
        
        
        } 
        
   System.out.println("  a="+a);
     }
		exa2();
		}
	
	public static void exa2() {
		
		for(int c=11; c<=13;c++) {
		for(int d=21; d<=23;d++) {	// here c conditon true it enters in loop of d and value c11 d loop totally executes and condition of d is 
			// happening fail then it goes out of loop and taking new value of c12 and enters again in loop of d and executing loop and same for c13 also 
			System.out.print(" "+c);
			
			
		}
		System.out.println("  ");
		}
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
