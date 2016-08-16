import java.util.Arrays;
import java.util.Scanner;

public class Problem5 
{
//	Въведете 3 различни числа от конзолата и ги разпечатайте в низходящ
//	ред
	
	public static void main(String[] args) 
	{
		Scanner scan= new Scanner(System.in);
		int[] array = new int[3];
		
		for(int i=0; i<3; i++)
		{
			System.out.print("Въведете  "+ (i+1)+ "то число: ");
			array[i]=scan.nextInt();
			System.out.println();
		}
		
		System.out.println();
		Arrays.sort(array);
		
		System.out.print("Числата в низходящ ред: ");
		for(int j= array.length-1; j>=0; j--)
		{
			System.out.print( array[j] + " ,");
		}
	}

}
