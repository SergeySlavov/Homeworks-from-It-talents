import java.util.Scanner;

public class Problem7 
{

	public static void main(String[] args) 
	{
		 //	���������� �� 3, �� �� ������� �� ������ ������� n
		 //	����� ����� �� ����� �� 3. ������� �� �� ��������� ��� �������.
		
		Scanner scan = new Scanner(System.in);
		System.out.print("��������  �����: ");
		int number= scan.nextInt();
		System.out.println();
		
		for (int i = 3; i <= number*3; i++) 
		{
			if(i % 3 == 0)
			{
				if(i<=(number-1)*3)
				{
					System.out.print(i+", ");	
				}
				else
				{
					System.out.print(i);
				}
				
			}
			
		}
	}

}
