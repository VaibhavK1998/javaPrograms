package LoopsInJava;//day 30

public class ForLoopUsingTwoVariable {
// we using multiple variable in for loop
	public static void main(String[] args) {
		for(int a=10,b=15;a<=50;a+=5,b++) { 
		System.out.println("a= "+a  +  "  b="+b); 
		//System.out.print("  b= "+b);
	// you can see here you not write condition of b in this condition the amount of loop (a) execute same amount of loop (b) executing
		}	
		multiCondition();
	}

	public static void multiCondition() {
	int a=10;
	for(; a<=100;a+=10) {
		
		System.out.println("value of a= "+a);
		
	
	}
System.out.println("a= "+a);// it shows latetst value of a wich coming from for loop
	 }
	
}













