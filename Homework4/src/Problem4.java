
public class Problem4 {
	
//	Имате предварително въведени стойности на елементи в двумерен
//	масив - естествени числа.
//	Да се състави програма, чрез която се извеждат стойностите на
//	елементите в двумерен масив след обръщането му на +90 градуса.
	
	public static void main(String[] args) {
	
		int[][] array= {
				{1,2,3,4,5},
				{6,7,8,9,10},
				{11,12,13,14,15},
				{16,17,18,19,20}
		};
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j]+" ");
			}System.out.println();
		}
		int row=array.length-1;
		int col= array[0].length-1;
		int colShifted= 0;
		
		System.out.println("Масива завъртян на +90°:");
		while(colShifted<=col){
			while(row>=0){
				System.out.print(array[row][colShifted]+" ");
				row--;
			}row=array.length-1;
			colShifted++;
			System.out.println();
		}
		
	}

}
