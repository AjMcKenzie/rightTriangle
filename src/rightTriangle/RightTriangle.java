package rightTriangle;

import java.util.Scanner;


/**
 * @author am312792
 *
 */
public class RightTriangle 
{

	private static Scanner input;
	public static void main(String[] args) 
	{
		String whichSide;
		input = new Scanner(System.in);
		int responds = 0;
		
		do{
		System.out.print("Please select the side you need to be answered A, B, or C >>> "); 
		whichSide = input.nextLine(); 
		
			if("A".equals(whichSide) || "a".equals(whichSide))
			{
				displayAside();
			}
			if("B".equals(whichSide)|| "b".equals(whichSide))
			{
				displayBside();
			}
			if("C".equals(whichSide)|| "c".equals(whichSide))
			{
				displayCside();
			}
			
		 System.out.print("\nWould you like to solve for another triangle?");
		 System.out.print("\nEnter 1 for yes, or any other number for no >>>> ");
		 responds = input.nextInt();
		}while(responds == 1);
		System.out.print("Have a great day!!");
	}
				public static void displayAside()
				{
				double userEntryC, userEntryB, answerA;
				System.out.print("Enter you number for side B >>> ");
				userEntryB = input.nextInt();
				
				System.out.print("Enter you number for side C >>> ");
				userEntryC = input.nextInt();
				
				answerA = Math.sqrt(userEntryC * userEntryC - userEntryB * userEntryB);
				System.out.print("The answer for side A is " + answerA + "\n");
				}
				
				public static void displayBside()
				{
				double userEntryA, userEntryC, answerB;
				System.out.print("Enter you number for side A >>> ");
				userEntryA = input.nextInt();
				
				System.out.print( "Enter you number for side C >>> ");
				userEntryC = input.nextInt();
					
				answerB = Math.sqrt(userEntryA * userEntryA - userEntryC * userEntryC);
				System.out.print("The answer for side B is " + answerB + "\n");
				}
				
				public static void displayCside()
				{
				double userEntryA, userEntryB, answerC;
				System.out.print("Enter you number for side A >>> ");
				userEntryA = input.nextInt();
				
				System.out.print("Enter you number for side B >>> ");
				userEntryB = input.nextInt();
				
				answerC = Math.sqrt(userEntryA * userEntryA - userEntryB * userEntryB);
				System.out.print("The answer for side C is " + answerC + "\n");
				}

}
