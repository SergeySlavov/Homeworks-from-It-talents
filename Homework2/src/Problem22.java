import java.util.Scanner;

public class Problem22
{
//	�� �� ������� ��������, ����� ������� ������� 10 ���-�����
//	�����, ����� �� ����� �� 2, 3 ��� �� 5 � ����� �� ��-������ ��
//	�������� ���������� �����.
//	������� �� ��������, ������ � ������ ������� �����.
//	������ �����: ����� �� ��������� [1..999]
	
	public static void main(String[] args) 
	{
		Scanner scan= new Scanner(System.in);
		System.out.print("�������� ����� � ���������[1..999]: ");
		int number= scan.nextInt();	
		int index=0;
		int nextNumber=number+1;
		int[]array= new int[10];
		
		if(number<1 || number>999)
		{
			System.out.println("���������� ����� � ����� ���������.");
			return;
		}
		else
		{
				while(index<10)
				{
					if(nextNumber%2==0 || nextNumber%3==0 || nextNumber%5==0)
					{
						array[index]=nextNumber;
						index++;
						nextNumber++;
					}
					else
					{
						index++;
						nextNumber++;
					}
				}
				for (int i = 0; i < array.length; i++) 
				{
				 System.out.println(i+1+" :"+array[i]);	
				}
		}
		
	}

}
