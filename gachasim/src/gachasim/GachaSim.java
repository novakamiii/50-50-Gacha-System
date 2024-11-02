package gachasim;
import java.util.Scanner;

public class GachaSim
{

	public static void main(String[] args) 
	{
		char choice;
		do 
		{
			
		Scanner scanner = new Scanner(System.in);
		GachaSystem gachaSystem = new GachaSystem();
		
		
		
		gachaSystem.SystemRoll();
		
		
		System.out.print("Reroll? (Y/N): ");
		choice = scanner.next().charAt(0);
		} 
		while (choice == 'Y' || choice == 'y');
		
		System.out.println("Exiting...");
	}

}
