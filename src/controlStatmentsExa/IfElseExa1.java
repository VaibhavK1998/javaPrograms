package controlStatmentsExa;//day 22 lecture

public class IfElseExa1 {

	public void exa1() {
	int a=40;
	
	if(a<=35) {
	System.out.println("condition true");
	
	}else {
		
		System.out.println("condition fail");
	}
	   

}
	
	public static void main(String[] args) {
		IfElseExa1 obj=new IfElseExa1();
		 obj.exa1();
		obj.exa2();

}
	
public void exa2() {
	int num=13;
	if(num%2==0) {
    System.out.println("even number");
 }	
	else {

	System.out.println(" odd number");
	  }
	
}	
}	







