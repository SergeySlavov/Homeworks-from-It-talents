import java.util.Scanner;

public class Problem1 {

//	Да се прочете масив и да се намери най-малкото число кратно на
//	3 от масива.

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.print("Въведете дължината на масива: ");
		int Length= scan.nextInt();
		int[]array= new int[Length];
		int min=0;
		
		if (Length<0) {
			System.out.println("Въведете положително число!");
			return;
		}else {
			System.out.print("Въведете елементите на масива: ");
			for (int i = 0; i < array.length; i++) {
				array[i]=scan.nextInt();
			}
			for (int i = 0; i < array.length; i++) {
					for (int j = 0; j < array.length; j++) {
						if (i==0 && array[j]%3==0) {
						min=array[j];
						}
						else{
							if(array[j]%3==0 && min>array[j] && array[j]!=0){
								min=array[j];
							}
					}
				}
			}System.out.println("Най-малкото число кратно на три от масива е "+min);
		}
	}

}
