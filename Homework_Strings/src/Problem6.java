import java.util.Scanner;

public class Problem6 {
	
//	�� �� ������� ��������, ���� ����� �� ������� ��������� � �������
//	����.
//	���� �������� �� ������ �� �� ������� ����� �����, �� ����� �������
//	���� �� ������� � ������ �����, � ���������� � ����� �� �� �����.
	
	public static void main(String[] args) {
		System.out.print("�������� �����������: ");
		Scanner scan = new Scanner(System.in);
		String text= scan.nextLine();
		text=text.toLowerCase();
		String[]array= text.split(" ");
		char capital=' ';
		
		
		for (int i = 0; i < array.length; i++) {
			capital=Character.toUpperCase(array[i].charAt(0));
			array[i]=capital+array[i].substring(1, array[i].length());
			System.out.print(array[i]+" ");
		}
		
		
	}

}
