import java.util.Scanner;

public class Problem15 {
//	Да се състави програма, която въвежда в едномерен масив реални
//	числа.
//	Като изход: програма извежда онези 3 различни числа, чиято
//	абсолютна стойност формира максималната обща сума.
//	Пример: 7.13; 0.2; 4.9; 5.1; 6.34; 1.12
//	Изход: 5.1; 6.34; 7.13



	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		float biggestSum=0;
		System.out.print("Въведете дължината на масива: ");
		int length = scan.nextInt();
		if(length<0){
			System.out.println("Въведете положително,цяло число.");
			return;
		}float[] array= new float[length];	
		System.out.print("Въведете елементите от масива:");
		for (int i = 0; i < array.length; i++) {
			array[i]= scan.nextFloat();	
			array[i]=Math.abs(array[i]);
		}
		float firstNum=Float.MIN_VALUE;
		float secondNum=Float.MIN_VALUE;
		float thirdNum=Float.MIN_VALUE;
		
		for (int i = 0; i < array.length; i++) {
			if(array[i]>firstNum){
				firstNum=array[i];
			}
		}for (int i = 0; i < array.length; i++) {
			if(array[i]>secondNum && array[i]<firstNum){
				secondNum=array[i];
			}
		}for (int i = 0; i < array.length; i++) {
			if(array[i]>thirdNum && array[i]<firstNum && array[i]<secondNum){
				thirdNum=array[i];
			}
			
		}
		biggestSum=firstNum+secondNum+thirdNum;
		System.out.print("Максималната сума по абсолютна стойност e между:"+firstNum+", "
		+secondNum+", "+thirdNum+" и е "+biggestSum);
		
		
		

	}

}
