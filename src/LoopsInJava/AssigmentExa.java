package LoopsInJava;

public class AssigmentExa {

	public static void main(String[] args) {
		for (int a = 1; a < 4; a++) {
			for (int b = 1; b <= a; b++) {
				System.out.print("*");
			}
			System.out.println();
		}


		for (int c = 1; c < 5; c++) {
 for(int d=4; d>=c;d--){
	 System.out.print("*");
 }System.out.println();
		}

	}
}
