package LoopsInJava;

public class NestedForLoopExa2 {

	public static void main(String[] args) {
		for(int a=1; a<=2; a++) {
	for(int b=1;b<=a;b++) { // execution 0f twoloop
	for(int c=1;c<=b;c++) {
		System.out.print("c= "+c); }
System.out.print(" b = "+ b);
	
	}
	System.out.println(" a="+a);
	}
		}
}