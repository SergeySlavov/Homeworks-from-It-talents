import java.util.Scanner;

public class Problem21
{
//	������ � �������� ����� �����.
//	��������� �� ������ �� ����� �: 2,3,4,5,6,7,8,9,10, ����, ����,
//	���, ���.
//	��������� �� ���� �� ������� �: ������, ����, ����, ����.
//	�� �� ������� ��������, ���� ����� �� ������� N - ����� ��
//	��������� [1..51] � �� �������� ��������� ����� ����� �
//	���������� ��-������ ����� �� �������. 
	
	public static void main(String[] args)
	{
		String[]card= {"2","3","4","5","6","7","8","9","10","����","����","���","���"};
		String[] color={"������","����","����","����"};
		String[] array= new String[52];
		int index=0;
		
		String[][]deck = new String[13][4];
		
		for (int i = 0; i < deck.length;i++) 
		{
			String[]sub= deck[i];
			for (int j = 0; j < sub.length; j++) 
			{
				deck[i][j]=card[i]+ " "+color[j]; 
				array[index]=deck[i][j];
				index++;
			}
		}
		Scanner scan= new Scanner(System.in);
		System.out.print("�������� ����� � ���������[1..51]: ");
		int number= scan.nextInt();
		
		if(number<1 || number>51)
		{
			System.out.println("������� �� � � ������� ��������.");
		}
		else
		{
			while(number<=52)
			{	
				System.out.println(array[number-1]);
				number++;
			}
		}
	}
}
