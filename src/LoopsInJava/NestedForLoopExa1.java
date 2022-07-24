package LoopsInJava;

public class NestedForLoopExa1 {

	public static void main(String[] args) {
		
		for(int a=2; a<=5; a++) {
			
		for(char ch='A';ch<='E';ch++) { // in this nested for loop this sub loop execute fully when the condition of main loop is true
    //and for every one condition of  main loop sub loop condition work fully and then enter in main loop
		System.out.println("value of char ch = "+ch);
		for(int c=1; c<=4; c++) {
			//System.out.println("value of c= "+c);
		}
		for(int d=1; d<=4; d++) {
			System.out.println("value of d= "+d);
		}
			
		}
		System.out.println("value of a= "+a);
		}
		
}
	}

