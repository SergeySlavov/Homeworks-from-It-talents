import java.util.Scanner;

public class Problem13
{
//	�� �� ������� ��������, ����� �� ������� ����� � �������/����� ��
//	���������� ����������� t � ������ ������.
//	�������������� ��������� ��:
//	��� -20 ������ �������;
//	����� 0 � -20 - �������;
//	����� 15 � 0 - ������;
//	����� 25 � 15 - �����;
//	��� 25 � ������.
//	������ �����: ���� ����� �� ��������� [-100..100].

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.print ("�������� �����������:  ");
		byte temp = scan.nextByte();
		System.out.println();
		
		if(temp>100 || temp <-100)
		{
			System.out.println("���������� ����������� � ����� ��������� [-100 : 100]");
		}
		if(temp<=-20 && temp>-100)
		{
			System.out.println("������ �������.");
		}
		else if(temp>-20 && temp<0)
		{
			System.out.println("C������.");
		}
		else if(temp>=0 && temp<=15)
		{
			System.out.println("������.");
		}
		else if(temp>15 && temp<=25)
		{
			System.out.println("�����.");
		}
		else if(temp>25 && temp<100)
		{
			System.out.println("������.");
		}
	}

}
