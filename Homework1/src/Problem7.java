import java.util.Scanner;

public class Problem7 
{
//	�������� 3 ���������� �� ������������ � ��� (���������� ���), ����
//	���� (����� � ������� �������), ���� ��� ����� � ����� ���.
//	��������� ��������, ����� ����� ������� �� ������ �� ���� ����� ��
//	������� �����:
//	 - ��� ��� �����, ���� �� �������
//	 - ��� ���� ����, �� �� ���� ���������
//	 - ��� ����� � �� ���� ����� � �� ��� ���
//	 - ��� ��� �����, �� ����� �� ���� � ��������
//	 - ��� ���� ��-����� �� 10 ��, �� ����� �� ����.
	 
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("����� �� ��?  ");
		boolean sick= scan.nextBoolean();
		System.out.print("����� ���� ����?   ");
		float money = scan.nextFloat();
		
		if(sick==true)
		{
			System.out.println("���� �� �������!");
			
			if(money> 0)
			{
				System.out.println("�� �� ���� ���������.");
			}
			else if(money==0)
			{
				System.out.println("�� ���� ����� � �� ��� ���.");
			}			
		}else
		{
			if(money>=10)
			{
				System.out.println("�� ����� �� ���� � ��������.");
			}			
			else if(money<10)
			{
				System.out.println("�� ����� �� ����.");
			}
		}
	}

}
