package LoopsInJava;

public class ForLoopWithTwoCondition {

	public static void main(String[] args) {
		for(int a=1; a>=0 && a<10; a--) {
System.out.println("value of a=  "+a);
}
		for(int b=650; b>=700||b<=700; b-=20) {
	System.out.println("values of b=  "+b);
		
		if(b<600) {
		break;
		}

}
}
}