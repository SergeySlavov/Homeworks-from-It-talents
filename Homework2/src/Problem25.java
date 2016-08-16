import java.util.Scanner;

public class Problem25 {
	
//	Да се направи програма, която по дадено число N, да изчислява
//	N!, т.е. 1*2*3*4...*N.
//	Използвайте цикъл do-while
	
	public static void main(String[] args) {
		System.out.print("Въведете число: ");
		Scanner scan = new Scanner(System.in); 
		long number= scan.nextLong();
		long num=number;
		System.out.println();
		int product=1;
		
		if(number<0)
		{
			System.out.println("Числото е отрицателно.");
		}
		else
		{
			do
			{
				if(number!=0)
				{
					product*=number;
					number--;
				}
				else
				{
					product=1;
				}
			}while(number>=1);
		
			System.out.println(num+"!= "+product);
		}

	}

}
