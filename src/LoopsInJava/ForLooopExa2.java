package LoopsInJava;

public class ForLooopExa2 {

	public static void main(String[] args) {
	 // character A to character Z
	for(char ch='A'; ch<='Z'; ch++) {
		System.out.println("value of uppercase character =  "+ch);
		
	}	
	lowercase()	;
	 mixtureCharacter();// if this method condition failed then control goes out of block and print next statement out of the box
	 mixtureCharacter();
	 mixtureCharacter2();
	 System.out.println("program ends");
	}                                       

	public static void lowercase() {
	for(char ch ='a'; ch<='z';ch++) {
	
	System.out.println("values of lowercase character =  "+ch);
	
	}
		
}
	
public static void mixtureCharacter() {
	
for(char ch='A'; ch<='p';ch++) {	
	
	System.out.println("mixture of character=  "+ch);
}
}

  public static void mixtureCharacter2() {
for(char ch='p';ch>='A';ch--) {
  System.out.println("lower to upper character=  "+ch);
  
}
  }
  
  
  
}































