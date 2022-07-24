package LoopsInJava;

public class ForLoopExa1 {

	public static void main(String[] args) {
// syntax:- for(initialization;condition;increment/decrement)
		for(int a=88;a<101;a++) {
		System.out.println("values of a is= "+a);
		}
		DecreamentExa();	
		valueIncrement5();
	}
public static void DecreamentExa() {
	for(int a=256;a>=244;a--) {
	
	System.out.println("value of a=  "+a);
	
}	
}
	public static void valueIncrement5() {

	for(int a=10; a<=50; a+=5) { // if you want to increase value by any specific no then you use( a+= value )this syntax
	System.out.println("value of a=  "+a);	
		
	}
}
}