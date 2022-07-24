package impMethodSet2;

public class CaptureReturnTypes2 {

 public int addition() {
	int a=30, b=50;
	int sum= a+b;
	return sum;
	
	
	
	}
	public static void main(String[] args) {
		
		CaptureReturnTypes2 obj= new CaptureReturnTypes2();
		
	int sum= obj. addition();
	System.out.println("sum="+ sum);
		// type casting while capturing return type
	short sum1=(short)obj.addition();// explicit narrowing
		System.out.println("sum1="+sum);
	long sum2=(long)obj.addition();// explicit narrowing
	System.out.println("sum2="+sum);
	float sum3=obj.addition();// implicit widening 
	System.out.println("sum3="+sum);
	float sum4=(float)obj.addition();// explicit widening
	System.out.println("sum4="+sum);
    System.out.println(obj.addition());

	}

}
