import java.util.Scanner;

public class Problem5 {

//	�� �� ������� ��������, ���� ����� �� �������� 2 ������ �� �����
//	(����).
//	��� � ����� ������ ������� ���� � ���� ����, �� �� ������ �� ������
//	������� ������ ������������, � ������� ����������, ���� �� �� ��
//	�������� � ����� �� ����.
//	��� �������� ����� ��� ���� �� �� ������ ���� ������������
//	���������.
	
	public static void main(String[] args) {
		System.out.print("�������� ������� ������ �� �������: ");
		Scanner scan = new Scanner(System.in);
		String firstText= scan.next();
		System.out.print("�������� ������� ������ �� �������: ");
		String secondText= scan.next();
		int currentCol=0;
		int bestCol=0;
		String emptySpace=" ";
		int bestRow=0;
		
		for (int i = 0; i < secondText.length(); i++) {
			for (int j = 0; j < firstText.length(); j++) {
				if(secondText.charAt(i)==firstText.charAt(j)){
					currentCol=j;
					if(currentCol>bestCol){
						bestCol=currentCol;
						bestRow=i;
					}
				}
			}
		}
		for (int i = 0; i < secondText.length(); i++) {
			if(i!=bestRow){
				for (int j = 0; j <= bestCol; j++) {
					if(j!=bestCol){
						System.out.print(emptySpace);
					}else{
						System.out.print(secondText.charAt(i) );
					}	
				}System.out.println();	
			}else{
				System.out.println(firstText);
			}
		}
		
		
			
		

		
//		for (int i = 0; i < secondText.length(); i++) {
//			if(secondText.charAt(i)==firstText.charAt(0)){
//				System.out.println(firstText);
//				a=true;
//			}else{
//				System.out.println(secondText.charAt(i));
//			}
//		}
//		if(a==false){
//			System.out.println("������� ������ ���� ������� ������ ���� ������ �� ������� ������");
//		}
	}

}
