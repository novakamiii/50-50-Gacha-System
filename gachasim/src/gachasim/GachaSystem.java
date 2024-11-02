package gachasim;


import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class GachaSystem implements SystInterface
{

	
	@Override
	public void SystemRoll() 
	{
		
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);
		
		
		//int result;
		//Probability
		//int min = 25, max = 100;
		//System.out.println(random.nextInt(max - min + 1) + min);
		
		//int total = random.nextInt(max - min + 1) + min;
		
		//DEBUG
		//System.out.println(total);
		
		
		//FiveStarsLimited
		String[] FiveStarsLimited = {"Jinhsi", "Changli", "Yinlin", "Zhezhi", "Shorekeeper", "Xiangli Yao", "Jiyan"};
		String[] FiveStarsPerma = {"Encore", "Verina", "Jianxin", "Calcharo", "Lingyang"};
		
		
		
		//FourStars
		String[] fourStarsStandardStrings = {"Danjin", "Sanhua", "Taoqi", "Yangyang", "Chixia", "Baizhi", "Youwu", "Mortefi", "Yuanwu", "Aalto"};
		
		
		
		
		//LimtedChooser
		System.out.println("Choose Your Limited Character: ");
		System.out.println("Bear in mind that this system is always 50/50!");
		
		//List
		for (int i = 0; i < FiveStarsLimited.length; i++)
		{
			System.out.println(i + ". " + FiveStarsLimited[i]);
		}
		
		System.out.print("Choose: ");
		int limitedChooserString = scanner.nextInt();
		String selectedcharString = null;
		String selectedcharString2 = null;
		String fiftychance = null;
		
		//Selector Array
		if (limitedChooserString >= 0 && limitedChooserString < FiveStarsLimited.length)
		{
			//Stored Index.
			selectedcharString = FiveStarsLimited[limitedChooserString];
			
			System.err.println("You Selected: " + selectedcharString);
		}
		
		System.out.println("*****************");
		System.out.println("Gacha Results...");
		
		
		//Four Stars Logic Pull
		int r = 0, t = 9;
		
		for (int logic4 = 0; logic4 < 9; logic4++)
		{
			int r2 = random.nextInt(t - r + 1) + r;
			selectedcharString2 = fourStarsStandardStrings[r2];
			System.out.println(selectedcharString2);
		}
		
		
		int g = 0, h = 4;
		int l = 0, j = 1;
		
		int r3 = 0;
		
		int max = 100, min = 0;
		
		for (int logic5 = 0; logic5 < FiveStarsPerma.length; logic5++)
		{
			int k = random.nextInt(h - g + 1) + g;
			
			fiftychance = FiveStarsPerma[k];
			
		}
		
		
		int randomstarfive =  (random.nextInt(max - min + 1) + min);
		
		r3 = randomstarfive;
		
		
		//50/50 Logic Pull
		if (r3 > 50)
		{
			System.out.println("Limited Pull!: " + selectedcharString);
			System.out.println("*****************");
		}
		else if (r3 < 50)
		{
			System.out.println("Standard Pull!: " + fiftychance);
			System.out.println("*****************");
		}
		
		System.out.println("Pull Rate: " + r3 + "%");
	
		
		/*
		for (int x = 1; x <= 6; x++)
		{
			int chara = x;
			
			result = total % chara;
			
			//System.out.println("This is the result: " + result);
			System.out.println("Pulled: " + FiveStarsLimited[result]);
			
		}
		*/
		
		
	}
}
