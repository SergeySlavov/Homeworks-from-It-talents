import java.util.Arrays;
import java.util.Scanner;

public class Problem5 
{
//	�������� 3 �������� ����� �� ��������� � �� ������������ � ��������
//	���
	
	public static void main(String[] args) 
	{
		Scanner scan= new Scanner(System.in);
		int[] array = new int[3];
		
		for(int i=0; i<3; i++)
		{
			System.out.print("��������  "+ (i+1)+ "�� �����: ");
			array[i]=scan.nextInt();
			System.out.println();
		}
		
		System.out.println();
		Arrays.sort(array);
		
		System.out.print("������� � �������� ���: ");
		for(int j= array.length-1; j>=0; j--)
		{
			System.out.print( array[j] + " ,");
		}
	}

}
