package LoopsInJava;

public class LoopWithContinue {

	public static void main(String[] args) {
	
		for(int a=10,b=10 ;a<=50 && b<=50;a+=5,b+=5) {
		
		if(a==10||a==20||a==30 && b==10||b==20||b==30) {
		continue;// when we use keyword continue; it skip those condition wich are in if block and then loop execute contineously
		
	// herer you can see in result 15 no of both a and b is skip by continue statment
		
		}
		System.out.print(" a= "+a);
		
		System.out.println(" b= "+b);
	}

}
}