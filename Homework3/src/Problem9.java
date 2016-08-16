import java.util.Scanner;

public class Problem9 {

//	Напишете програма, в която потребителя въвежда масив, след което
//	елементите на масива се обръщат в обратен ред (Целта не е масива да
//	се отпечата в обратен ред, ами първо да се обърне, след което да се
//	отпечата в нормален ред). Пробвайте да решите задачата първо с един
//	допълнителен масив и после без да използвате друг масив.
	
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.print("Въведете дължината на масивa: ");
		int length= scan.nextInt();
		
		int holder=0;
		int lastIndex= length-1;
		
		if(length<=0){			
			System.out.println("Въведете положително число!");
			return;
		}
			int[]array= new int[length];
			System.out.print("Въведете стойностите на масива: ");
			for (int i = 0; i < array.length; i++) {
				array[i]=scan.nextInt();
			}
			
			for (int i = 0; i <=array.length/2; i++) {
				
				if(length%2!=0)
				{	if(i==array.length/2){
					break;
				}else{
					holder=array[i];
					array[i]=array[lastIndex];
					array[lastIndex]=holder;
					lastIndex--;
					}
				}
				else{
					holder=array[i];
					array[i]=array[lastIndex];
					array[lastIndex]=holder;
					lastIndex--;
					}
				}
			System.out.println("Стойностите на масива в обратен ред е:");
			
			for (int i = 0; i < array.length; i++) {
				System.out.print(array[i]+" ");
			}
		}
}

