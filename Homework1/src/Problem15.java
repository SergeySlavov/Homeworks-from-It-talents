import java.util.Scanner;

public class Problem15 
{
//	�� �� ������� ��������, ����� ������� ���������� ����� �� ���������
//	[0..24].
//	���������� �� ������ ������������� ��������� ��������� ���������
//	���.
//	��������� ��:
//	[18..4] - ����� �����;
//	[4..9] - ����� ����;
//	[9..18] - ����� ���
	
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.print ("�������� ��� � �������� [0-24]:  ");
		byte hour = scan.nextByte();
		
		if(hour>24 || hour<0)
		{
			System.out.println("������ ��� ��������� ���!");
			return;
		}
		else
		{
			if(hour>=0 && hour<9)
			{
				System.out.println("����� ����!");
			}
			else if(hour>=9 && hour<18)
			{
				System.out.println("����� ���!");
			}
			else if(hour>=18 && hour<=24)
			{
			System.out.println("����� �����!");	
			}
		}
	}

}
