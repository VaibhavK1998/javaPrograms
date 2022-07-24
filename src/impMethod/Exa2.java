package impMethod;
//static& non static method example
public class Exa2 {
public int a=50;//non static global variable
public static int b=60;//static global variable
	
	
	public static void main(String[] arg) {	 		
	Exa2 obj=new Exa2(); 
	//when we called a non static method data and n
	//if you create multiple objects then multiple copies of same data is formed
	obj.test1();
	obj.multiplication();
	Exa2 obj1=new Exa2();//  we create second object for same data and here new copies of data is formed its non static
	obj.multiplication();//non static method
	
	} 

	public static void test1() {    // static method
		  System.out.println("11");
		  System.out.println("22");
		  System.out.println("33");
		  System.out.println("44");
		  System.out.println("55");

}
	public void multiplication() {  //non static method
		int a=10,  b=20;
	   int mul=a*b;
	System.out.println("mul="+mul);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
