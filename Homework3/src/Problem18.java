import java.util.Scanner;

public class Problem18 {

//	Дадени са два едномерни масива с естествени числа.
//	Да се състави програма, която сравнява всички числа с еднакви
//	индекси от двата масива и записва в трети масив, по-голямото от
//	двете числа.
//	Да се изведе съдържанието и на трите масива
	
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.print("Въведете дължината на първия масив: ");
		int lengthFirst= scan.nextInt();
		float[] arrayFinal=new float[0];
		if(lengthFirst<=0){
			System.out.println("Въведеното число е отрицателно или 0.");
			return;
		}
		float[] arrayFirst= new float[lengthFirst];
		System.out.println("Въведете елементите на масива:");
		for (int i = 0; i < arrayFirst.length; i++) {
			arrayFirst[i]=scan.nextFloat();
		}
		System.out.print("Въведете дължината на втория масив: ");
		int lengthSecond= scan.nextInt();
		
		if(lengthSecond<=0){
			System.out.println("Въведеното число е отрицателно или 0.");
			return;
		}
		float[] arraySecond= new float[lengthFirst];
		System.out.println("Въведете елементите на масива:");
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
