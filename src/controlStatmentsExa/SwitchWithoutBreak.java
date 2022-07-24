package controlStatmentsExa;

public class SwitchWithoutBreak {

	public static void main(String[] args) {
		int week=3;
		switch(week) {
		case 1:
			System.out.println("monday");
		case 2:
			System.out.println("tuesday");
		case 3:
			System.out.println("wensday");// our input is case 3 it execute block 3 because we are not using break; keyword all cases after 3 executes
			// thats why break; keyword is use to stop the execution of upcoming block 
		case 4:
			System.out.println("thursday");
		case 5:
			System.out.println("friday");
			break;         // here we see that after the break no any block execute
		case 6:
			System.out.println("saturday");
		case 7:
			System.out.println("sunday");
		default:
			System.out.println("invaild day");
		
		
		}
		
		}
		
		}
