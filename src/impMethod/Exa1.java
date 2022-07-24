package impMethod;

public class Exa1 {
  int x=100; 
   int p=50;
   int q=70;
  public static void main(String[] args){
	 	
    System.out.println("program starting point");
	Exa1 obj=new Exa1();
	System.out.println("p="+obj.p);
    System.out.println("x="+obj.x);
	obj. x=500;
    System.out.println("x="+obj.x);//whenever you crete new obj.x the old value going in garbage 
    obj.x=1000; 
    //and new obj.x value is update hence here output is obj.x=1000
    System.out.println("x="+obj.x);
	System.out.println("hello");
System.out.println("x= "+obj.x);
	test1();     //using this we call the method test1 here we avoiding the repitative data
		 System.out.println("program trail");//data redundancy
		 test1();      
		 System.out.println("running ok");
		 test1();
		 int a=10,b=60;
		 int c= a+b;
		 System.out.println("c="+c);
       obj. addition();//
       //we can write standard type is addition(); in the place of obj.addition(); because both are static method
       //then it will not showing warning
       obj.multiplication();
  
      }
        
  public static void test1() {
  System.out.println("11");
  System.out.println("22");
  System.out.println("33");
  System.out.println("44");
  System.out.println("55");

         }
public static void addition(){
int a=10,b=50;
int sum=a+b;   //we write program here and then we call this function/ method in main by variable name obj.
               // to get output. obj.addition(); called additon function in main method
System.out.println("sum of these two number="+sum);

}
	public  void multiplication() {
	int a=10,  b=20;
   int mul=a*b;
System.out.println("mul="+mul);
	
	
	}
}

  