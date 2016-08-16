import java.util.Scanner;

public class Problem16 
{
//	�������� � ���������� ���������� ����� �� ���� abc.
//	������ �� �� ������� ����:
//	��� a = b = c - �����: ������� �� �����;
//	��� a>b>c - �����: ������� �� ��� �������� ���;
//	��� a<b<c ������� �� � �������� ���;
//	� �����: ������� �� ����������, �� ����������� ������.
//	�� �� ������� ��������, ����� ������� ��������� �� ���������� ��
//	������� �� ������� � �������.

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("�������� ���������� �����: ");
		int number= scan.nextInt();
		int[] digits= new int[3];
		int index=0;
		
		if(number<100 || number>999)
		{
			System.out.println("������� �� � ����������!");
			return;
		}
		else
		{
			for(int i= number; i>0; i/=10)
			{
				digits[index]=i%10;
				index++;
			}
		}
		if((digits[0]==digits[1])&&(digits[1]==digits[2]))
		{
			System.out.println("������� �� �������.");
		}
		else if((digits[0]>digits[1]) && (digits[1]>digits[2]))
		{
			System.out.println("������� �� ��� �������� ���.");
		}
		else if((digits[0]<digits[1]) && (digits[1]<digits[2]))
		{
			System.out.println("������� �� ��� �������� ���.");
		}
		else
		{
			System.out.println("������� �� ����������.");
		}
	}

}
