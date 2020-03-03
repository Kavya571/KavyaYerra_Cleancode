package epam.task;

import java.util.Scanner;

public class Test {
		public static void main(String[] args) {
			
			Scanner input = new Scanner(System.in);
			
			SimpleIntrest cal = new SimpleIntrest();
			
			Budget budget = new Budget();
			
			System.out.println("Enter 1 to calculate Simple Interest");
			System.out.println("Enter 2 to calculate Compound Interest");
			int option = input.nextInt();
			System.out.println("Enter principal , rate , time values");
			double principal = input.nextDouble();
			double rate = input.nextDouble();
			double time = input.nextDouble();
			switch(option){
			case 1:
				System.out.println(cal.computesSI(principal, rate, time));
				break;
			case 2:
				System.out.println(cal.computesCI(principal, rate, time));
				break;
			default:
				System.out.println("Invalid option entered");
			}
			
			System.out.println("Enter Standard of the house to be consturcted");
			System.out.println("Enter 1 for Normal");
			System.out.println("Enter 2 for Medium ");
			System.out.println("Enter 3 for High");
			int Standard = input.nextInt();
			int Automated;
			if(Standard == 3){
				System.out.println("Enter 1 for automated house else enter 0");
				Automated = input.nextInt();
			}else{
				Automated = 0;
				
			}
			System.out.println("Enter the area: ");
			double Area = input.nextDouble();
			System.out.println(budget.ConstructionCost(Area, Standard,Automated));
			
		}
}
