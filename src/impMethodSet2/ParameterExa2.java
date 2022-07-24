package impMethodSet2;

public class ParameterExa2 {
	public void test1( char ch, boolean flag,int i) {
	System.out.println(ch+"," +flag+", " +i );// here this is void return type method so thats why we are print here
	
	}
	public static void main(String[] args) {
		ParameterExa2 obj=new ParameterExa2();
      obj.test1('A', true, 50);
	
	float add=obj.addition(88.55f, 98, 27);
	System.out.println("sum= "+add);
	}
	
public float addition(float a, double b, int c) { // addition of these three datatype comes double because its greater than other two datatype its rule
	float add= (float) (a+b+c); //we convert double into float 
	 return add;
	
    }
   }