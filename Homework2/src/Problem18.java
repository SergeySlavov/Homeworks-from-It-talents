import java.util.Scanner;

public class Problem18 
{
//	�� �� ������� ��������, ���� ����� �� ������� ��� ����� ��
//	��������� [1..9].
//	���������� �� ������� ��������� �� ���������.
//	������������ �������� �� ����������� � ���������� �� 2-��
//	�����.
	
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("��������  ������� ����� � ��������� [1..9]: ");
		int firstNum= scan.nextInt();
		System.out.println();
		System.out.print("��������  ������� ����� � ��������� [1..9]: ");
		int secondNum= scan.nextInt();
		
		if((firstNum<1 || firstNum>9) || (secondNum<1 || secondNum>9))
		{
			System.out.println("���������� ����� �� � � ��������� ��������.");
		}
		else
		{
			for (int i = 1; i <= firstNum; i++) 
			{
				for (int j = 1; j <= secondNum; j++) 
				{	
					int product= i*j;
					System.out.print(i+" * "+j+" = "+ product);
					System.out.println();
				}	
			}
		}

	}

}
