import java.util.Scanner;

public class Problem18 {

//	������ �� ��� ��������� ������ � ���������� �����.
//	�� �� ������� ��������, ����� �������� ������ ����� � �������
//	������� �� ����� ������ � ������� � ����� �����, ��-�������� ��
//	����� �����.
//	�� �� ������ ������������ � �� ����� ������
	
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.print("�������� ��������� �� ������ �����: ");
		int lengthFirst= scan.nextInt();
		float[] arrayFinal=new float[0];
		if(lengthFirst<=0){
			System.out.println("���������� ����� � ����������� ��� 0.");
			return;
		}
		float[] arrayFirst= new float[lengthFirst];
		System.out.println("�������� ���������� �� ������:");
		for (int i = 0; i < arrayFirst.length; i++) {
			arrayFirst[i]=scan.nextFloat();
		}
		System.out.print("�������� ��������� �� ������ �����: ");
		int lengthSecond= scan.nextInt();
		
		if(lengthSecond<=0){
			System.out.println("���������� ����� � ����������� ��� 0.");
			return;
		}
		float[] arraySecond= new float[lengthFirst];
		System.out.println("�������� ���������� �� ������:");
		for (int i = 0; i < arraySecond.length; i++) {
			arraySecond[i]=scan.nextFloat();
		}
		
		if(lengthFirst>lengthSecond){
			 arrayFinal= new float[lengthSecond];				
			}
		else{
			arrayFinal = new float[lengthFirst];
		}
		for (int i = 0; i < arrayFinal.length; i++) {
			if(arrayFirst[i]>arraySecond[i]){
				arrayFinal[i]=arrayFirst[i];
			}else{
				arrayFinal[i]= arraySecond[i];
			}
			if(i<=arrayFinal.length-2){
			System.out.print(arrayFinal[i]+", ");
			}else
			{
				System.out.print(arrayFinal[i]);
			}
		}
	}

}
