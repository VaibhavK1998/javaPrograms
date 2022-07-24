package LoopsInJava;

public class GlobalLoopVarExa {
	
	
	int a=100, b=200;//global variable
	public static void main(String[] args) {
		GlobalLoopVarExa obj=new GlobalLoopVarExa();
		
	System.out.println("b= "+ obj.b);
		System.out.println("a= "+ obj.a);
      obj.UseGlobalVar();
	}

	
	
	
	public void UseGlobalVar() {
		
    	System.out.println("a= "+this.a);// by using global ariable
		System.out.println("b= "+this.b);
		for(; a<=150 && b<= 250;a+=5,b+=5) {
	   System.out.print("value of a= "+a);     
	   System.out.println("  value of b= "+b); 
	   if(a==130 && b==230) {
		   
		  break; 
		   
		   
		   
	   }
		}
    
	}
	}
        