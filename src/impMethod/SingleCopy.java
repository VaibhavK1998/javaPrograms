package impMethod;

public class SingleCopy {
static int  x=100, y=300; //variables are statics
	public static void main(String[] args) {
	SingleCopy obj1=new SingleCopy();
	SingleCopy obj2=new SingleCopy();
	SingleCopy obj3=new SingleCopy();

	System.out.println("x="+obj1.x);
	System.out.println("y="+obj1.y);
	obj2.x=50;                      
	obj2.y=70;
	System.out.println("x="+obj1.x);   
	System.out.println("y="+obj1.y);   
	System.out.println("---------");  
	System.out.println("x="+obj1.x);
	System.out.println("y="+obj2.y);
	System.out.println("---------");
	System.out.println("x="+obj3.x);
	System.out.println("y="+obj3.y);
	
	/* we updating the value x and y of obj1 the value of obj2 & obj3 has been updated 
	   so only single copies form because all object value is changed by changing one 
	   object value  here the variable value is Static i.e single copy happen because its not changed*/

	
	}

}
