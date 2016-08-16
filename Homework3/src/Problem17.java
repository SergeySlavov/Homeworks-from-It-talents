import java.util.Scanner;

public class Problem17 {

//	���� ������ �� ���������� ����� �� �������� �������������� ������,
//	��� �� ���������� � �� ���������� ���������:
//	N1 < N2 > N3 < N4 > N5 <..
//	��������� ��������, ����� ��������� ���� �������� � ���������
//	����� ������ �� ����� ���������� ������� ����������.
//	������: 1 3 2 4 3 7
//	�����: ��������� ������������ �� �������������� ������ ������
	
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.print("�������� ��������� �� ������: ");
		int length = scan.nextInt();
		boolean isZigZag=true;
		
		if(length<0){
			System.out.println("�������� �����������,���� �����.");
			return;
			} 
			int[] array= new int[length];
			System.out.print("�������� ���������� �� ������:");
			for (int i = 0; i < array.length; i++) {
				array[i]= scan.nextInt();	
			}
			for (int i = 1; i <= array.length-2; i+=2) {
				if(array[i]> array[i-1] && array[i]>array[i+1]){
					isZigZag=true;
				}
				else{
					isZigZag=false;
					break;
				}
			}if(isZigZag==true){
				System.out.println("���������� � �������������� ������.");
			}else{
				System.out.println("���������� �� � �������������� ������.");
			}
	}
}

