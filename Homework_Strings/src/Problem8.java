import java.util.Scanner;

public class Problem8 {
//	�� �� ������� ��������, ���� ����� �� ������� ��� �� �������
//	(������, ���).
//	���������� �� ������ �� ������ ���� ��������� ������ � ���������,
//	�.�. ���� ����� ������-������� � �������-������ � ���� � ���.

	public static void main(String[] args) {
		System.out.print("�������� ��� �� �������: ");
		Scanner scan = new Scanner(System.in);
		String text= scan.nextLine();
		char[]array= text.toCharArray();
		boolean isSymetric=false;
		int indexFirst=0;
		int indexLast= array.length-1;
		
		while(indexFirst<=array.length/2){
			if(array[indexFirst]==array[indexLast]){
				isSymetric=true;
			}else{
				isSymetric=false;
				break;
			}
			indexFirst++;
			indexLast--;
		}
		if(isSymetric==true){
			System.out.println("����� � ����������");
		}else{
			System.out.println("����� �� � ����������.");
		}
	}
}
