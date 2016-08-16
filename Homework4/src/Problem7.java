
public class Problem7 {
	
//	Имате предварително въведени стойности от естествени числа,
//	въведени в квадратна таблица с размери 6 реда и 6 колони.
//	Да се състави програма , чрез която се намира сумата на всички
//	елементи, чиято сума на индекси за ред и колона е четно число.
//	Програмата да извежда формираните суми за всеки отделен ред на
//	квадратната таблица, както и общата сума от тези елементи.
//	Да се използва само един цикъл.
	
	public static void main(String[] args) {
		
		int[][]array={
				{11,12,13,14,15,16},
				{21,22,23,24,25,26},
				{31,32,33,34,35,36},
				{41,42,43,44,45,46},
				{51,52,53,54,55,56},
				{61,62,63,64,65,66}
		};
		int sumEven=0;
		int sumTotal=0;
		int col=0;
		
		for (int row = 0; row < array.length; row++) {
			if(row%2==0){
				sumEven=array[row][col]+array[row][col+2]+array[row][col+4];
				System.out.println(array[row][col]+" + "+array[row][col+2]+" + "+array[row][col+4]+" = "+sumEven);
			}else{
				sumEven=array[row][col+1]+array[row][col+3]+array[row][col+5];
				System.out.println(array[row][col+1]+" + "+array[row][col+3]+" + "+array[row][col+5]+" = "+sumEven);
			}
			
			sumTotal+=sumEven;
			sumEven=0;
			col=0;
		}System.out.println("Общата сума  е "+sumTotal);
		
	}

}
