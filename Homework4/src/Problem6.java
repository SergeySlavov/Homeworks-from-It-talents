import java.util.Scanner;

public class Problem6 {

	//	����� ������������� �������� ��������� �� ���������� �����.
//	������� �� �������� � ��������� ������� � ������� 6 ���� � 6
//	������.
//	�� �� ������� ��������, ���� ����� �� ������ ������ �� ������
//	�������� �� �������� � ����� ������: 2,4 � 6.
//	���������� �� ������� � ������ �� ����� ������� ���.
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("�������� ���������� �� ������ 6x6:");
		int[][]array= new int[6][6];
		
		for (int row = 0; row < array.length; row++) {
			for (int col = 0; col < array[row].length; col++) {
				array[row][col]=scan.nextInt();
			}
		}
//		int[][]array= {
//				{11,12,13,14,15,16},
//				{21,22,23,24,25,26},
//				{31,32,33,34,35,36},
//				{41,42,43,44,45,46},
//				{51,52,53,54,55,56},
//				{61,62,63,64,65,66}
//				};
		int sumEvenRow=0;
		int sumTotalRows=0;
		
		for (int row = 0; row < array.length; row++) {
			for (int col = 0; col < array[row].length; col++) {
				if(row%2==0){
					sumEvenRow+=array[row][col];
						if(col!=array[row].length-1){
							System.out.print(array[row][col]+" + ");
						}else{
							System.out.print(array[row][col]+" = "+sumEvenRow);
						}
				}
			}sumTotalRows+=sumEvenRow;
			sumEvenRow=0;
			System.out.println();
		}System.out.println("������ �� ������ �������� �� ������� ������ � "+ sumTotalRows);
	}

}
