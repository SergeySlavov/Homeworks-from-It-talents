import java.util.Scanner;

public class Problem1 {
	
//	�� �� ������� ��������, ���� ����� �� �������� ��� ���� ���������
//	�� 40 ������ � ����� �����.
//	���� �������� �� ������ �� �� �������� �������� ���� � ������ � ����
//	� ����� �����.
//	������: Abcd Efgh
//	�����: ABCD abcd EFGH efgh


	public static void main(String[] args) {
		System.out.print("�������� ������ ��� (�� 40 �������): ");
		Scanner scan = new Scanner(System.in);
		String firstText= scan.next();
		System.out.print("�������� ������ ��� (�� 40 �������): ");
		String secondText= scan.next();
		
		if(firstText.length()>40 || secondText.length()>40){
			System.out.println("��������� �� �������� �� ������ �� 40 �������!");
			return;
		}
		String firstTextLower= firstText.toLowerCase();
		String firstTextUpper= firstText.toUpperCase();
		String secondTextLower= secondText.toLowerCase();
		String secondTextUpper= secondText.toUpperCase();
		
		System.out.print(firstTextLower+" "+ firstTextUpper+" "+secondTextLower+" "+secondTextUpper);
		
	}

}
