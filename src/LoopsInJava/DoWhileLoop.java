package LoopsInJava;

public class DoWhileLoop {

	public static void main(String[] args) {
		int a=40;
		do {
			System.out.println(a); 
		a++;
		}while(a<=30);// if this condition is true then it enters in loop

	} // note if condition is failed even so it shows one value because we write Sysout first before the condition. and its the standard syntax 
	// and one time at least it show result even condition failed its drawback of this method

}
