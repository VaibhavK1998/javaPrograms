package Array;//day 40 lecture

public class TwoDimensionalArray {

	public static void main(String[] args) {
		//data type variableName[][]={{},{},{}}; syntax
		int ar[][]= {{12,21,23},{24,35,56},{34,45,56}};//double array is use for row and column
	for(int a=0; a<3;a++) {
		for(int j=0;j<3;j++)// condition of both loop will be always same in 2D array
	System.out.println("ar["+a+"]["+j+"]= "+ar[a][j]);
	}
	Synatx2();
}
	
	
	public static void Synatx2() {
	int exa[][]=new int[3][3];
	exa[0][0]=50;
	exa[0][1]=70;
	exa[0][2]=20;
	exa[1][0]=35;	
	exa[1][1]=60;
	exa[1][2]=40;
	exa[2][0]=47; 
	exa[2][1]=30;	
	exa[2][2]=55;	
		
		for(int a=0;a<3;a++) {
			for(int b=0;b<3;b++) {
				System.out.println("exa["+a+"]["+b+"]="+exa[a][b]);
		//		if(b<exa[1][0])	{
	//		break;
			}
				
		}
			
		
		
		}
		
		
		
		
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
