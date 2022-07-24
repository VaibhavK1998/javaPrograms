package impMethodSet2;

public class CaptureReturnTypes {
	public int addition() {
		int a=10,b=50;
		  int sum=a+b;
		  return sum;


}

	public static void main(String[] args) {
	CaptureReturnTypes obj=new CaptureReturnTypes();
    int sum=obj.addition();//if you want to perform action on return value obtained by method then only capture the method
    System.out.println("sum="+sum);
  //  System.out.println(obj.addition());
  //  char ch=obj.exam1();//if you want to perform action on return value obtained by method then only capture the method
//	System.out.println(ch); // without this capturing and sysout statement you can print
	System.out.println(obj.exam1());//only print the method then you have to write like this type
		
	}
public char exam1(){

  return 'A';
  }
}
