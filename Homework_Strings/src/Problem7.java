import java.util.Scanner;

public class Problem7 {
//	�� �� ������� ��������, ����� ���� ����� �� ���� ��������� �
//	��������.
//	���� �������� �� �� �������� ���� �� ���������� ����, ����� � ����
//	����� � ���-������� ����.
	
	public static void main(String[] args) {
		System.out.print("�������� ����� �� ����: ");
		Scanner scan = new Scanner(System.in);
		String text= scan.nextLine();
		String[] array= text.split(" ");
		int count= array.length;
		String longest=array[0];
		
		for (int i = 0; i < array.length-1; i++) {
			if(array[i].length()<array[i+1].length()){
				longest=array[i+1];
			}
		}
		System.out.println("����� �������� ���� � "+ count);
		System.out.println("���-������� ���� � "+longest);
		System.out.println("��������� �� ���-������� ���� � "+longest.length()+" �������");
 	}

}
