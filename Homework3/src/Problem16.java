import java.util.Scanner;

public class Problem16 {

//	Да се състави програма, чрез която предварително въведени 10
//	реални числа от интервала се обработват по следния начин:
//	1. Извежда съществуващите числа.
//	2. Всички елементи със стойност по-малки от -0.231 се заменят със
//	сумата от квадрата на индекса им + числото 41.25, а всички останали
//	елементи се заменят с произведението между самия елемент и
//	неговият пореден номер
//	3. Да се изведат елементите от началния и новообразувания масив.
//	4. Да се изведат средната стойност на всички елементи от новата
//	редица, които са различни от 0.
	
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.print("Въведете дължината на масива: ");
		int length = scan.nextInt();
		float limit=-0.231f;
		float number=41.25f;
		float mean=0;
		float sum=0;
		int counter=0;
		
		if(length<0){
			System.out.println("Въведете положително,цяло число.");
			return;
		}float[] array= new float[length];
		float[] arraySecond= new float[length];
		
		System.out.println("Въведете елементите от масива:");
		for (int i = 0; i < array.length; i++) {
			array[i]= scan.nextFloat();	
		}
		for (int i = 0; i < arraySecond.length; i++) {
			if(array[i]<limit){
				arraySecond[i]=(float)Math.pow(i, 2) +number; 
			}else{
				arraySecond[i]=array[i]*i;
			}
		}
		for (int i = 0; i < arraySecond.length; i++) {
			System.out.print(arraySecond[i]+" ");
			if(arraySecond[i]!=0)
			{
				sum+=arraySecond[i];
				counter++;
			}
		}mean=sum/counter;
		System.out.println();
		System.out.println("Средната стойност на всички елементи "
				+ "от новата	редица, които са различни от 0 е "+mean);
	}

}
