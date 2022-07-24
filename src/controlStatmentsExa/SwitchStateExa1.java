package controlStatmentsExa;

public class SwitchStateExa1 {
// in switch statement you can't use datatype float and double
	public static void main(String[] args) {
		String name="gaurav";

		switch(name) {
			case "vaibhav":
		System.out.println(" name;-vaibhav\n village:-fubgaon\n job:-engineer");
		break;
			case"sanket":
				System.out.println("name:-sanket\nvillage:-fubgaon\njob :-accountant");
				System.out.println("all information is true");// we can print multiple statement here by using sysout
		// if they want execute the block of sanket then it will direct jump on this block it not check first block thats why its called switch statements
		
		break;
			case"gaurav":
				System.out.println("name:-gaurav\n village:-fubgaon\n job:-engineer");
		break;
		default:
			System.out.println("input invalid");// if any condition not true then it show default block statement
		}
	}

}//
