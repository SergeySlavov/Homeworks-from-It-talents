import java.util.Scanner;

public class Problem11
{
//	��������� ��������, ����� �� ������ ���������o ����� ���������
//	���� ������� �� ���� �� ����� ���� �����. ��� ���������� ����� ��
//	���� ����� 0.

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.print ("�������� ���������� �����:  ");
		int number = scan.nextInt();
		System.out.println();
		int[] digits= new int[3];
		int index=0;
		
		if(number<100 || number>999)
		{
			System.out.println("���������� ����� �� � � ���������� ������� [100 - 999]");
		}
		else
		{
			for(int i=number; i>0; i/=10)
			{
				digits[index]= i %10;
				
				if(digits[index]==0)
				{
					System.out.println("������� ������� ������� 0!");
					return;
				}
				index++;
			}
					for(int j=0;j<digits.length;j++)
					{
						if(number % digits[j]==0)
						{
							System.out.println("������� "+ number+ " �� ���� ��� ������� �� "+ digits[j]); 
						}
						else if(number % digits[j]!=0)
						{
							System.out.println("������� "+ number+ " �� �� ���� ��� ������� �� "+ digits[j]);
						}
					}
				}
	}

}
