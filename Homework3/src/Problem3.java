import java.util.Scanner;

public class Problem3 {

//	�� �� ������ �����, ���� ����� �� �� ������� ����� � 10
//	�������� �� ������� �����:
//	������� 2 �������� �� ������ �� ���������� �����.
//	����� ������� ������� �� ������ � ����� �� ����� ��
//	���������� 2 �������� � ������.
//	���� ���� �������� ������ .

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.print("�������� �����: ");
		int number= scan.nextInt();
		int[] array= new int[10];
		
		for (int i = 0; i < array.length; i++) {
			if(i==0 || i==1)
			{
				array[i]=number;
			}else
			{
				array[i]=array[i-1]+array[i-2];
			}
		}for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+" ");
		}

	}

}
