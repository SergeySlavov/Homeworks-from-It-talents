import java.util.Scanner;

public class Problem10 {

//	�� �� ������� ��������, ����� �� ����� ��� ����� ����,
//	���������, �� ����� �� �������� ���� ��� ����� ��� �� ������
//	�� ASCII ��������� � ���������� ������� 5 � � �������
//	������������� ������.

	public static void main(String[] args) {
		System.out.print("�������� ��� �� �������: ");
		Scanner scan = new Scanner(System.in);
		String text= scan.nextLine();
		int a=0;
		char b=' ';
		for (int i = 0; i < text.length(); i++) {
			a=text.charAt(i)+5;
			b=(char)a;
			System.out.print(b);
		}
		

	}

}
