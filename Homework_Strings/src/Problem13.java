
public class Problem13 {
	
//	�� �� ������� �����, ����� ������ ��� ������ �� ����� � �����
//	�����, �������� ������ �������� �� ���������� ������, ���� �
//	������� ���� �� ������ �� ���������� �� ������ ������� �����,
//	� ��� ������� ���� � ���� �� ������ ������� �����.
	
	static int[] Array(int[]arr1, int[]arr2){
		int length= arr1.length+ arr2.length;
		int index=0;
		int[]arrayTotal= new int[length];
		
		for (int i = 0; i < arr1.length; i++) {
			arrayTotal[i]=arr1[i];
			System.out.print(arrayTotal[i]+" ");
		}
		for (int i = arr1.length; i < arrayTotal.length; i++) {
			arrayTotal[i]=arr2[index];
			System.out.print(arrayTotal[i]+" ");
			index++;
		}
		return arrayTotal;
	}
		
	
	public static void main(String[] args) {
		int[]a= {1,2,3,90,-7};
		int[]b= {4,5,6,7};
		
		Array(a,b);

	}

}
