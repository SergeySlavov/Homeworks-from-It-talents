import java.util.Scanner;

public class Problem9 
{
//	�� �� ������� ��������, ����� ���� �� ��������� 2 ����������
//	���������� ����� a,b.
//	���������� �� ������ � ��������� ���� ���������� ����� ��
//	�������������� �� ����� ����� � �����, ����� � ������ �����. 
//	������ �����: a,b - ���������� ����� �� ��������� [10..99].
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.print ("�������� ������� ����������, ���������� �����:  ");
		int firstNum = scan.nextInt();
		System.out.println();
		
		System.out.print ("�������� ������� ����������, ���������� �����:  ");
		int secondNum = scan.nextInt();
		System.out.println();
		
		int product=1;
		
		if((firstNum>99 || firstNum<10) || (secondNum>99 || secondNum<10))
		{
			System.out.println("������� �� ��������� �� ���������� ��� ����������!");
		}
		else
		{
			product=firstNum*secondNum;
			int lastDigit= product % 10;
			System.out.print("���������� ����� �� �������������� �����  "+ firstNum+ "  �  "+ secondNum + "  e " + lastDigit );
			
			System.out.println();
			if(lastDigit % 2==0)
			{
				System.out.println(lastDigit+ " e �����");
			}
			else
			{
				System.out.println(lastDigit+ " e �������");
			}
		}
	}

}
