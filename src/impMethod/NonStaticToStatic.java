package impMethod;

public class NonStaticToStatic {
 static int x=50, b=60;
 
	public static void main(String[] args) {
		NonStaticToStatic obj=new NonStaticToStatic();
     obj. test1();
   
	 }
     public void test1() {
       System.out.println("x= "+NonStaticToStatic.x);
    	
       System.out.println(" test");
    	 System.out.println(" trial");
    	 System.out.println(" running ");
    	 System.out.println(" succsfully");
      
       // when we want data of static method in non static method to call this there are three ways
      // first way by using object name but that is not recommended
    	 System.out.println("second way");
    	 test2(); // second way to call static in non static by using syntax=methodName();
    	 System.out.println("3rd way");
    	 NonStaticToStatic.test2(); // 3rd way to call static method in non static by using syntax=className.method name();
     }

   public static void test2()  {
	   System.out.println("method calling steps are running");
   int a=50,b=60;
   int sum=a+b;
   System.out.println("sum= "+sum);
   
           }
   }