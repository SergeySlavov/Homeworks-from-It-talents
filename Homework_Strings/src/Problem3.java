import java.util.Scanner;

public class Problem3 {
	
//	�� �� ������� ��������, ���� ����� �� �������� �������������� ���
//	������ �� ������� ��� ���������.
//	���������� �� ������� ��������� �� ��������� �� ����������� �� ��
//	�������.

	public static void main(String[] args) {
		System.out.print("�������� ������� ������ �� �������: ");
		Scanner scan = new Scanner(System.in);
		String firstText= scan.next();
		System.out.print("�������� ������� ������ �� �������: ");
		String secondText= scan.next();
		
		if(firstText.length()>secondText.length()){
			System.out.println("��������� �� ������� ������ � ��-������ �� ������� ������.");
			
			for (int i = 0; i < secondText.length(); i++) {
				if(firstText.charAt(i)==secondText.charAt(i)){
					System.out.println("��������� �� ������ "+i+ " �� �������.");
				}else{
					System.out.println(i+"->"+ firstText.charAt(i)+" "+secondText.charAt(i));
				}
			}
		}else{
			if(firstText.length()<secondText.length()){
			System.out.println("��������� �� ������� ������ � ��-������ �� ������� ������.");
			
			for (int i = 0; i < firstText.length(); i++) {
				if(firstText.charAt(i)==secondText.charAt(i)){
					System.out.println("��������� �� ������ "+i+ " �� �������.");
				}else{
					System.out.println("�������� ������� �� ������� "+i+"->"+ firstText.charAt(i)+" - "+secondText.charAt(i));
				}
			}
		}
			else{
				System.out.println("�������� �� � ������� �������.");
				for (int i = 0; i < firstText.length(); i++) {
					if(firstText.charAt(i)==secondText.charAt(i)){
						System.out.println("��������� �� ������ "+i+ " �� �������.");
					}else{
						System.out.println("�������� ������� �� ������� "+i+"->"+ firstText.charAt(i)+" - "+secondText.charAt(i));
					}
				}
			}
		}
	}
}
