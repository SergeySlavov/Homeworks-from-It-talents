
public class Problem5 {

//	Да се състави програма, при която предварително са въведени
//	естествени числа в двумерен масив 4*4 елемента.
//	Програмата да извежда резултат от проверката какво е съотношението
//	на най-голямата сума по редове спрямо най-голямата сума по колони.
	
	public static void main(String[] args) {
		int[][]array= {
				{1,2,3,4},
				{5,6,7,8},
				{9,10,11,12},
				{13,14,15,16}
		};
		int currentSumRows=0;
		int currentSumCols=0;
		int bestSumRows=0;
		int bestSumCols=0;
		
		for (int row = 0; row < array.length; row++) {
			for (int col = 0; col < array.length; col++) {
				currentSumRows+=array[row][col];
			}
			if(currentSumRows>bestSumRows){
				bestSumRows=currentSumRows;
			}
			currentSumRows=0;
		}
		for (int col = 0; col < array[0].length; col++) {
			for (int row = 0; row < array.length; row++) {
				currentSumCols+=array[row][col];
			}
			if(currentSumCols>bestSumCols){
				bestSumCols=currentSumCols;
			}
			currentSumCols=0;
		}
		System.out.println("Максималната сума по редове е "+bestSumRows);
		System.out.println("Максималната сума по колони е "+bestSumCols);
		if(bestSumRows>=bestSumCols){
			System.out.println("Максималната сума по редове е по голяма/равна от максималната сума по колони.");
		}else
		{
			System.out.println("Максималната сума по колони е по голяма от максималната сума по редове.");
		}
		
	}

}
