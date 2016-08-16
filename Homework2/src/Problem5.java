import java.util.Scanner;

import javax.sound.midi.Synthesizer;

public class Problem5 
{
	// Да се въведат от потребителя 2 числа. И да се
	//изведат на екрана всички числа от по-малкото до по-голямото.

	
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Въведете първото число: ");
		int firstNum= scan.nextInt();
		System.out.println();
		System.out.print("Въведете второто число: ");
		int secondNum=scan.nextInt();
		
		while(firstNum<secondNum)
		{
			System.out.println(firstNum);
			firstNum++;
		}
		while(firstNum>=secondNum)
		{
			System.out.println(firstNum);
			firstNum--;
		}
	}
}
