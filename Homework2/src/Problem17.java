import java.util.Scanner;

public class Problem17 
{
//	�� �� ������� ��������, ����� ������� �������, ����� ������ ��
//	�������� ��� ����� *, � ������������ � ��������� ��� �������
//	����.
//	������ ����� b - ������� �� �������� ����� �� ���������
//	[3..20], c - ����� ����.
//	���������� �� �������� ����� for. 
	
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("��������  ����o � ��������� [3..20] � ������� ���� : ");
		int length= scan.nextInt();
		String symbol= scan.nextLine();
		System.out.println();
		
		if(length<3 || length>20)
		{
			System.out.println("��������� �� � � ������� ��������.");
			return;
		}
		else
		{
			for (int i = 1; i <= length; i++) 
			{
				for (int j = 1; j <= length; j++) 
				{
					if(i==1 || i==length)
					{
					 System.out.print("*");
					}
					else
					{
						if(j==1 || j==length)
						{
							System.out.print("*");
						}
						else
						{
							System.out.print(symbol);
						}
					}
				}System.out.println();
			}
		}
		
	}

}
