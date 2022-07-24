package controlStatmentsExa;//day 22 lecture

public class IfElseExa2 {  
	
	                             
 public static void exa1() {         // it executes if block when if condition is true otherwise else block executed.                                       
	 int a=55;                          
	 if(a!=50) {                                              
   System.out.println(" conditon true ");
 
     }        
	                            
	 else {
	
	System.out.println(" condition false ");
 }                       
	
	                                            
 }	
	
	public static void main(String[] args) { 
		IfElseExa2 obj=new IfElseExa2();
	    exa1();
      obj.exa2();
	}
    public void exa2() {
	int a=100;                // if first condition is failed then it show result of else loop
	if (a==150) {
	System.out.println(" condition true");
	
        }
	else {
	
	System.out.println("condtion fail");
     }
    
    
     
}

}

  