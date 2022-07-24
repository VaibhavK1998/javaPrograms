package impMethodSet2; // day 19 lecture



// here note that the return type is return we not using void as return
// in the place of void we writing here data type method name(integer,double,float,char,float,boolean,short,long)
public class ReturnTypeAndDataCasting {
	public int additionInt() {
int a=10,b=50;
  int sum=a+b;
  System.out.println("sum="+sum);
  return sum;
	  }
	
		
	
public double additionOfDouble(){	
double a=40,b=70;
Double sum=a+b;
System.out.println("sum="+sum);
return sum ;
	
}

public short additionShort() {  
	
	short a=50,b=60;
	
	//short sum=a+b;  (it showing error) you are performing any operation on no. by default it will consider it integer i.e you want  to covert it first in to short
	short sum=(short)(a+b);
	System.out.println("sum="+sum);
	return sum;
	
	
	 
   }
	public static void main(String[] args) {
		ReturnTypeAndDataCasting obj=new ReturnTypeAndDataCasting();
		obj.additionInt();
		obj.additionOfDouble();
		obj.additionShort();
		obj. additionByte();
		obj.additionOfLong();
		obj.additionOfFloat();
		obj.additionOfChar();
	
	}
	

	
	
public byte additionByte() {
byte a=30,b=60;
byte sum=(byte)(a+b);// in java by default value considering integer so the covert value int to byte we write (byte)(a+b);
System.out.println("sum="+sum);
return sum;
}
 public long additionOfLong() {
long a=100,b=200;
long sum=a+b;
System.out.println("sum="+sum);
return sum;

 }

public float additionOfFloat() {
float a=55.55f,b=35.67f;
float sum=(float)(a+b);
System.out.println("sum="+sum);
return sum;
}
 
public char additionOfChar() {
	char x='A',y='B';
char ch=(char)(x+y);
System.out.println("ch="+ch);
return ch;
}



}

